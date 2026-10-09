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

public val Icons.Filled.SelectAll: ImageVector
    get() {
        if (_selectAll != null) {
            return _selectAll!!
        }
        _selectAll =
            materialIcon(name = "Filled.SelectAll") {
            addPath(
                pathData = PathParser().parsePathString("M19 3C20.1046 3 21 3.89543 21 5V16C21 17.1046 20.1046 18 19 18H8C6.89543 18 6 17.1046 6 16V5C6 3.89543 6.89543 3 8 3H19ZM5 7V17C5 18.1046 5.89543 19 7 19H19V21H7C4.79086 21 3 19.2091 3 17V7H5ZM16.7282 7.36264L18.1424 8.77685L13.1927 13.7266C12.8021 14.1171 12.169 14.1171 11.7785 13.7266L8.95003 10.8982L10.3642 9.48396L12.4856 11.6053L16.7282 7.36264Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _selectAll!!
    }

private var _selectAll: ImageVector? = null
