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

import androidx.compose.runtime.Composable
import com.genev4.AiInputFile

/** Returns a lambda that opens the platform document picker. */
@Composable
internal expect fun rememberAiInputFilePicker(
    mimeTypes: List<String>,
    onPicked: (List<AiInputFile>) -> Unit,
): () -> Unit
