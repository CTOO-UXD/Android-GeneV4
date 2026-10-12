/*
 * Copyright 2026 The GeneV4 Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.genev4.internal

import android.content.Context
import android.net.Uri
import android.provider.OpenableColumns
import androidx.activity.compose.LocalActivityResultRegistryOwner
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.platform.LocalContext
import com.genev4.AiInputFile

@Composable
internal actual fun rememberAiInputFilePicker(
    mimeTypes: List<String>,
    onPicked: (List<AiInputFile>) -> Unit,
): () -> Unit {
    // Paparazzi / plain Compose views have no ActivityResultRegistryOwner.
    if (LocalActivityResultRegistryOwner.current == null) {
        return remember { {} }
    }
    return rememberAiInputFilePickerLauncher(mimeTypes, onPicked)
}

@Composable
private fun rememberAiInputFilePickerLauncher(
    mimeTypes: List<String>,
    onPicked: (List<AiInputFile>) -> Unit,
): () -> Unit {
    val context = LocalContext.current
    val currentOnPicked = rememberUpdatedState(onPicked)
    val types = remember(mimeTypes) { mimeTypes.ifEmpty { listOf("*/*") } }
    val launcher =
        rememberLauncherForActivityResult(ActivityResultContracts.OpenMultipleDocuments()) { uris ->
            if (uris.isEmpty()) return@rememberLauncherForActivityResult
            currentOnPicked.value(uris.map { uri -> uri.toAiInputFile(context) })
        }
    return remember(launcher, types) {
        {
            launcher.launch(types.toTypedArray())
        }
    }
}

private fun Uri.toAiInputFile(context: Context): AiInputFile {
    val name = displayName(context, this)
    return AiInputFile(
        uri = toString(),
        name = name,
        type = fileType(context, this, name),
    )
}

private fun displayName(context: Context, uri: Uri): String {
    context.contentResolver
        .query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)
        ?.use { cursor ->
            if (cursor.moveToFirst()) {
                val index = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                if (index >= 0) {
                    cursor.getString(index)?.let { return it }
                }
            }
        }
    return uri.lastPathSegment ?: "File"
}

private fun fileType(context: Context, uri: Uri, name: String): String {
    val subtype = context.contentResolver.getType(uri)?.substringAfterLast('/')?.uppercase()
    if (!subtype.isNullOrBlank()) return subtype
    val extension = name.substringAfterLast('.', missingDelimiterValue = "")
    return if (extension.isNotEmpty()) extension.uppercase() else "FILE"
}
