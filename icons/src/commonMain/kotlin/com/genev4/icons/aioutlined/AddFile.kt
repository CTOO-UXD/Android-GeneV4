/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aioutlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiOutlined.AddFile: ImageVector
    get() {
        if (_addFile != null) {
            return _addFile!!
        }
        _addFile =
            materialIcon(name = "AiOutlined.AddFile") {
            addPath(
                pathData = PathParser().parsePathString("M22 4C23.1 4 24 4.9 24 6V16C24 17.1 23.1 18 22 18H6C4.9 18 4 17.1 4 16V4C4 2.9 4.9 2 6 2H12L14 4H22ZM2 6V20H20V22H2C0.9 22 0 21.1 0 20V6H2ZM6 6V16H22V6H6ZM14 10H16V8H18V10H20V12H18V14H16V12H14V10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _addFile!!
    }

private var _addFile: ImageVector? = null
