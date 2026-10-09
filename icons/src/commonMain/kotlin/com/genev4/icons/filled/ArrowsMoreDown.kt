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

public val Icons.Filled.ArrowsMoreDown: ImageVector
    get() {
        if (_arrowsMoreDown != null) {
            return _arrowsMoreDown!!
        }
        _arrowsMoreDown =
            materialIcon(name = "Filled.ArrowsMoreDown") {
            addPath(
                pathData = PathParser().parsePathString("M12 15.9974H21L21 13.9974H12L12 4.99738H10L10 13.9974C10 15.1019 10.8954 15.9974 12 15.9974Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M7 20.9974H16L16 18.9974H7L7 9.99738H5V18.9974C5 20.1019 5.89543 20.9974 7 20.9974Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowsMoreDown!!
    }

private var _arrowsMoreDown: ImageVector? = null
