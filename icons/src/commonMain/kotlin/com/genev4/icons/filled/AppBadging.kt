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

public val Icons.Filled.AppBadging: ImageVector
    get() {
        if (_appBadging != null) {
            return _appBadging!!
        }
        _appBadging =
            materialIcon(name = "Filled.AppBadging") {
            addPath(
                pathData = PathParser().parsePathString("M12 1.99939C12.8971 1.99939 13.7666 2.11752 14.5938 2.33907C13.6133 3.25192 13 4.55404 13 5.99939C13 8.76081 15.2386 10.9994 18 10.9994C19.4454 10.9994 20.7475 10.3861 21.6603 9.40559C21.8819 10.2328 22 11.1023 22 11.9994C22 17.5222 17.5228 21.9994 12 21.9994C6.47715 21.9994 2 17.5222 2 11.9994C2 6.47654 6.47715 1.99939 12 1.99939Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15 5.99939C15 4.75958 15.7521 3.69543 16.8249 3.23827C17.1858 3.08449 17.583 2.99939 18 2.99939C19.6569 2.99939 21 4.34254 21 5.99939C21 6.41644 20.9149 6.81361 20.7611 7.17448C20.304 8.24731 19.2398 8.99939 18 8.99939C16.3431 8.99939 15 7.65624 15 5.99939Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _appBadging!!
    }

private var _appBadging: ImageVector? = null
