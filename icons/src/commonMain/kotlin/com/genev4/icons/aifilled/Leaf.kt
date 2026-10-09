/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf =
            materialIcon(name = "AiFilled.Leaf") {
            addPath(
                pathData = PathParser().parsePathString("M21 5C21 14.627 15.627 19 9 19H5.24316C5.07392 19.9909 4.99244 20.9948 5 22H3C3 17.9689 4.17783 15.3132 5.66016 13.4316C7.1688 11.5168 9.02513 10.3517 10.5547 9.33203L9.44531 7.66797C7.97495 8.64821 5.83116 9.98337 4.08984 12.1934C3.70326 12.684 3.33969 13.2164 3.00488 13.7939C3.00141 13.5362 3 13.2716 3 13C3 7.477 7.477 3 13 3C15 3 17 4 21 3V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _leaf!!
    }

private var _leaf: ImageVector? = null
