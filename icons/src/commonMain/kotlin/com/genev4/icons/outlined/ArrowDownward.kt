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

public val Icons.Outlined.ArrowDownward: ImageVector
    get() {
        if (_arrowDownward != null) {
            return _arrowDownward!!
        }
        _arrowDownward =
            materialIcon(name = "Outlined.ArrowDownward") {
            addPath(
                pathData = PathParser().parsePathString("M12.9993 16.1754L12.9993 3.98083H10.9993L10.9993 16.1754L5.40201 10.5781L3.98779 11.9924L10.5851 18.5896C11.3661 19.3707 12.6325 19.3707 13.4135 18.5896L20.0108 11.9923L18.5966 10.5781L12.9993 16.1754Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowDownward!!
    }

private var _arrowDownward: ImageVector? = null
