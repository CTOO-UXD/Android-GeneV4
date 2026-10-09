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

public val Icons.Filled.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm =
            materialIcon(name = "Filled.Alarm") {
            addPath(
                pathData = PathParser().parsePathString("M5.98971 1.68604L1.74707 5.92868L3.16128 7.34289L7.40392 3.10025L5.98971 1.68604Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.839 7.34292L16.5964 3.10028L18.0106 1.68606L22.2533 5.9287L20.839 7.34292Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.0001 21.9994C16.9707 21.9994 21.0001 17.97 21.0001 12.9994C21.0001 8.02886 16.9707 3.99942 12.0001 3.99942C7.02955 3.99942 3.00012 8.02886 3.00012 12.9994C3.00012 17.97 7.02955 21.9994 12.0001 21.9994ZM11.0001 7.99939V13.9994C11.0001 14.5517 11.4478 14.9994 12.0001 14.9994H16.0001V12.9994H13.0001V7.99939H11.0001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _alarm!!
    }

private var _alarm: ImageVector? = null
