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

public val Icons.Outlined.Favorite: ImageVector
    get() {
        if (_favorite != null) {
            return _favorite!!
        }
        _favorite =
            materialIcon(name = "Outlined.Favorite") {
            addPath(
                pathData = PathParser().parsePathString("M16.5 3.20471C19.8137 3.20471 22.5 5.891 22.5 9.20471C22.5 9.30434 22.4976 9.4034 22.4928 9.50184C22.4974 9.56687 22.5 9.6349 22.5 9.70471C22.5 13.6415 19.3482 17.5469 13.0446 21.4209C12.4041 21.8152 11.5966 21.8152 10.9554 21.4222C4.65206 17.5471 1.5 13.6417 1.5 9.70471C1.5 9.63536 1.50265 9.56778 1.5079 9.50192C1.50244 9.40407 1.5 9.30468 1.5 9.20471C1.5 5.891 4.18629 3.20471 7.5 3.20471C9.29203 3.20471 10.9006 3.99034 12 5.23595C13.0994 3.99034 14.708 3.20471 16.5 3.20471ZM16.5 5.20471C15.3354 5.20471 14.2558 5.70255 13.4994 6.55945L12 8.25828L10.5005 6.55943C9.7442 5.70254 8.66463 5.20471 7.5 5.20471C5.29086 5.20471 3.5 6.99557 3.5 9.20471L3.5048 9.39057L3.51234 9.52577L3.50041 9.68126L3.5 9.70471C3.5 12.6499 5.99217 15.869 11.2489 19.2449L11.998 19.7157L12.3777 19.4807C17.7652 16.0975 20.3799 12.8685 20.496 9.91063L20.5 9.70471L20.4893 9.52371L20.4951 9.40442C20.4984 9.33815 20.5 9.27157 20.5 9.20471C20.5 6.99557 18.7091 5.20471 16.5 5.20471Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _favorite!!
    }

private var _favorite: ImageVector? = null
