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

public val Icons.Outlined.PhonelinkLock: ImageVector
    get() {
        if (_phonelinkLock != null) {
            return _phonelinkLock!!
        }
        _phonelinkLock =
            materialIcon(name = "Outlined.PhonelinkLock") {
            addPath(
                pathData = PathParser().parsePathString("M17 4H7L7 20H17V17H19V20C19 21.1046 18.1046 22 17 22H7C5.89543 22 5 21.1046 5 20V4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V7H17V4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.25 15.75C15.4167 15.9167 15.6167 16 15.85 16H20.15C20.3833 16 20.5833 15.9167 20.75 15.75C20.9167 15.5833 21 15.3833 21 15.15V11.85C21 11.6167 20.9167 11.4167 20.75 11.25C20.5833 11.0833 20.3833 11 20.15 11H20V10C20 9.45 19.8042 8.97917 19.4125 8.5875C19.0208 8.19583 18.55 8 18 8C17.45 8 16.9792 8.19583 16.5875 8.5875C16.1958 8.97917 16 9.45 16 10V11H15.85C15.6167 11 15.4167 11.0833 15.25 11.25C15.0833 11.4167 15 11.6167 15 11.85V15.15C15 15.3833 15.0833 15.5833 15.25 15.75ZM17 11V10C17 9.71667 17.0958 9.47917 17.2875 9.2875C17.4792 9.09583 17.7167 9 18 9C18.2833 9 18.5208 9.09583 18.7125 9.2875C18.9042 9.47917 19 9.71667 19 10V11H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _phonelinkLock!!
    }

private var _phonelinkLock: ImageVector? = null
