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

public val Icons.Filled.ArrowsOutward: ImageVector
    get() {
        if (_arrowsOutward != null) {
            return _arrowsOutward!!
        }
        _arrowsOutward =
            materialIcon(name = "Filled.ArrowsOutward") {
            addPath(
                pathData = PathParser().parsePathString("M3.41293 13.4108L7.99852 17.9964L9.41273 16.5822L5.82705 12.9965L10.9999 12.9965L10.9999 10.9965L5.82725 10.9965L9.41627 7.40747L8.00205 5.99326L3.41294 10.5824C2.63189 11.3634 2.63189 12.6298 3.41293 13.4108Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.5869 10.5841L16.0013 5.99851L14.5871 7.41272L18.1708 10.9965L12.9999 10.9965V12.9965L18.1745 12.9965L14.5835 16.5874L15.9978 18.0016L20.5869 13.4125C21.3679 12.6315 21.3679 11.3651 20.5869 10.5841Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowsOutward!!
    }

private var _arrowsOutward: ImageVector? = null
