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

public val Icons.Filled.CallSplit: ImageVector
    get() {
        if (_callSplit != null) {
            return _callSplit!!
        }
        _callSplit =
            materialIcon(name = "Filled.CallSplit") {
            addPath(
                pathData = PathParser().parsePathString("M5 3.99951C4.44772 3.99951 4 4.44723 4 4.99951V9.99951H6V7.41373L10.1213 11.535C10.6839 12.0977 11 12.8607 11 13.6564V19.9995H13V13.6564C13 12.3303 12.4732 11.0585 11.5355 10.1208L7.41421 5.99951H10V3.99951H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17.9999 7.41373L14.458 10.9556C14.1931 10.3222 13.835 9.72759 13.3923 9.19288L16.5857 5.99951H13.9999V3.99951H18.9999C19.5522 3.99951 19.9999 4.44723 19.9999 4.99951V9.99951H17.9999V7.41373Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _callSplit!!
    }

private var _callSplit: ImageVector? = null
