/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Filled.Mood: ImageVector
    get() {
        if (_mood != null) {
            return _mood!!
        }
        _mood =
            materialIcon(name = "Filled.Mood") {
            addPath(
                pathData = PathParser().parsePathString("M22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12ZM9 9.49998C9 8.67155 8.55228 7.99998 8 7.99998C7.44771 7.99998 7 8.67155 7 9.49998C7 10.3284 7.44771 11 8 11C8.55228 11 9 10.3284 9 9.49998ZM17 9.49998C17 8.67155 16.5523 7.99998 16 7.99998C15.4478 7.99998 15 8.67155 15 9.49998C15 10.3284 15.4478 11 16 11C16.5523 11 17 10.3284 17 9.49998ZM12 17.5C13.1334 17.5 14.1625 17.1792 15.0875 16.5375C16.0125 15.8958 16.6834 15.05 17.1 14H6.90002C7.31669 15.05 7.98752 15.8958 8.91253 16.5375C9.83752 17.1792 10.8667 17.5 12 17.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _mood!!
    }

private var _mood: ImageVector? = null
