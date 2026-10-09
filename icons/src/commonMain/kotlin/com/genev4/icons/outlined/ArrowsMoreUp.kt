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

public val Icons.Outlined.ArrowsMoreUp: ImageVector
    get() {
        if (_arrowsMoreUp != null) {
            return _arrowsMoreUp!!
        }
        _arrowsMoreUp =
            materialIcon(name = "Outlined.ArrowsMoreUp") {
            addPath(
                pathData = PathParser().parsePathString("M17 2.99939H8V4.99939L17 4.99939V13.9994L19 13.9994V4.99939C19 3.89482 18.1046 2.99939 17 2.99939Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12 7.99939L3 7.99939V9.99939L12 9.99939V18.9994L14 18.9994V9.99939C14 8.89482 13.1046 7.99939 12 7.99939Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowsMoreUp!!
    }

private var _arrowsMoreUp: ImageVector? = null
