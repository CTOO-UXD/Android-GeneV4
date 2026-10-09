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

public val Icons.Filled.GMobiledata: ImageVector
    get() {
        if (_gMobiledata != null) {
            return _gMobiledata!!
        }
        _gMobiledata =
            materialIcon(name = "Filled.GMobiledata") {
            addPath(
                pathData = PathParser().parsePathString("M9 17C8.45 17 7.97917 16.8042 7.5875 16.4125C7.19583 16.0208 7 15.55 7 15V9C7 8.45 7.19583 7.97917 7.5875 7.5875C7.97917 7.19583 8.45 7 9 7H14C14.55 7 15.0208 7.19583 15.4125 7.5875C15.8042 7.97917 16 8.45 16 9H9V15H14V13H12V11H16V15C16 15.55 15.8042 16.0208 15.4125 16.4125C15.0208 16.8042 14.55 17 14 17H9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _gMobiledata!!
    }

private var _gMobiledata: ImageVector? = null
