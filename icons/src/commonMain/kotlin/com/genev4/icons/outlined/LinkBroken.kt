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

public val Icons.Outlined.LinkBroken: ImageVector
    get() {
        if (_linkBroken != null) {
            return _linkBroken!!
        }
        _linkBroken =
            materialIcon(name = "Outlined.LinkBroken") {
            addPath(
                pathData = PathParser().parsePathString("M8 5H6V2H8V5ZM6.34315 9.17157L4.22183 11.2929C1.87868 13.636 1.87868 17.435 4.22183 19.7782C6.56497 22.1213 10.364 22.1213 12.7071 19.7782L14.8284 17.6569L13.4142 16.2426L11.2929 18.364C9.7308 19.9261 7.19814 19.9261 5.63604 18.364C4.07394 16.8019 4.07394 14.2692 5.63604 12.7071L7.75736 10.5858L6.34315 9.17157ZM17.6569 14.8284L19.7782 12.7071C22.1213 10.364 22.1213 6.56497 19.7782 4.22183C17.435 1.87868 13.636 1.87868 11.2929 4.22183L9.17157 6.34315L10.5858 7.75736L12.7071 5.63604C14.2692 4.07394 16.8019 4.07394 18.364 5.63604C19.9261 7.19814 19.9261 9.7308 18.364 11.2929L16.2426 13.4142L17.6569 14.8284ZM9.17157 16.2426L7.75736 14.8284L10.5858 12L12 13.4142L9.17157 16.2426ZM13.4142 12L16.2426 9.17157L14.8284 7.75736L12 10.5858L13.4142 12ZM16 19H18V22H16V19ZM19 16V18H22V16H19ZM5 8V6H2V8H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _linkBroken!!
    }

private var _linkBroken: ImageVector? = null
