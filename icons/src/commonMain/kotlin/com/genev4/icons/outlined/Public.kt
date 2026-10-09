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

public val Icons.Outlined.Public: ImageVector
    get() {
        if (_public != null) {
            return _public!!
        }
        _public =
            materialIcon(name = "Outlined.Public") {
            addPath(
                pathData = PathParser().parsePathString("M22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12ZM11 19.9381V18C9.89543 18 9 17.1046 9 16V15L4.20269 10.2027C4.07007 10.7804 4 11.382 4 12C4 16.0796 7.05369 19.446 11 19.9381ZM15 4.58152C17.9318 5.76829 20 8.64262 20 12C20 14.079 19.207 15.9727 17.9069 17.3953C17.6506 16.5863 16.8938 16 16 16H15V13C15 12.4477 14.5523 12 14 12H8V10H10C10.5523 10 11 9.55228 11 9V7H13C14.1046 7 15 6.10457 15 5V4.58152Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _public!!
    }

private var _public: ImageVector? = null
