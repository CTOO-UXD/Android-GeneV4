/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Outlined.DialEnter: ImageVector
    get() {
        if (_dialEnter != null) {
            return _dialEnter!!
        }
        _dialEnter =
            materialIcon(name = "Outlined.DialEnter") {
            addPath(
                pathData = PathParser().parsePathString("M20 20V4H22V20H20ZM14.5858 11L9.29289 5.70711L10.7071 4.29289L17.7782 11.364C18.1687 11.7545 18.1687 12.3877 17.7782 12.7782L10.7071 19.8492L9.29289 18.435L14.7279 13H2V11H14.5858Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _dialEnter!!
    }

private var _dialEnter: ImageVector? = null
