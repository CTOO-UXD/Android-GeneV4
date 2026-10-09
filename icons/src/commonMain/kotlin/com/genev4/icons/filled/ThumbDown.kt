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

public val Icons.Filled.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) {
            return _thumbDown!!
        }
        _thumbDown =
            materialIcon(name = "Filled.ThumbDown") {
            addPath(
                pathData = PathParser().parsePathString("M9 20.5624C9 21.7914 10.4609 22.4341 11.3668 21.6036L14.7301 18.5207C16.1765 17.1948 17 15.3227 17 13.3606V8C17 5.23858 14.7614 3 12 3L6.8541 3C5.33902 3 3.95396 3.85601 3.27639 5.21115L1.95016 7.86362C1.32531 9.11332 1 10.4913 1 11.8885L1 12C1 14.2091 2.79086 16 5 16L10.2408 16C10.3463 16.687 10.2297 17.4312 10.0053 18.1365C9.71586 19.0462 9.29142 19.7501 9.18696 19.9156C9.06308 20.1118 9 20.3352 9 20.5624Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M22.0001 14.0201C22.0001 15.1136 21.1136 16.0001 20.0201 16.0001H18.5001V3.00012L20.0001 3.00012C21.1047 3.00012 22.0001 3.89555 22.0001 5.00012V14.0201Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
