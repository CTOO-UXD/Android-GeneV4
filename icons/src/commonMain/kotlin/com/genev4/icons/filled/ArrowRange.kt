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

public val Icons.Filled.ArrowRange: ImageVector
    get() {
        if (_arrowRange != null) {
            return _arrowRange!!
        }
        _arrowRange =
            materialIcon(name = "Filled.ArrowRange") {
            addPath(
                pathData = PathParser().parsePathString("M7.99852 17.9964L3.41293 13.4108C2.63189 12.6298 2.63189 11.3634 3.41294 10.5824L8.00205 5.99326L9.41627 7.40747L5.82726 10.9965L18.1708 10.9965L14.587 7.41272L16.0013 5.99851L20.5868 10.5841C21.3679 11.3651 21.3679 12.6315 20.5868 13.4125L15.9977 18.0016L14.5835 16.5874L18.1744 12.9965L5.82704 12.9965L9.41273 16.5822L7.99852 17.9964Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowRange!!
    }

private var _arrowRange: ImageVector? = null
