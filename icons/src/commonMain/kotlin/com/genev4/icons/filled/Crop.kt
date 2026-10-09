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

public val Icons.Filled.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop =
            materialIcon(name = "Filled.Crop") {
            addPath(
                pathData = PathParser().parsePathString("M5.50001 1.99707V5.59707L2 5.59707L2 8.59707H5.50001V15.9971C5.50001 17.3778 6.6193 18.4971 8.00001 18.4971H15.5V21.9971H18.5V18.4971H22V15.4971H8.50001V1.99707H5.50001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.5 13.9971L18.5 7.99706C18.5 6.61635 17.3807 5.49707 16 5.49707L9.99999 5.49707V8.49707H15.5L15.5 13.9971L18.5 13.9971Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _crop!!
    }

private var _crop: ImageVector? = null
