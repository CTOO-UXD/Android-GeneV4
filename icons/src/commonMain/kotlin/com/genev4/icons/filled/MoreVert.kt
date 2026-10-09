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

public val Icons.Filled.MoreVert: ImageVector
    get() {
        if (_moreVert != null) {
            return _moreVert!!
        }
        _moreVert =
            materialIcon(name = "Filled.MoreVert") {
            addPath(
                pathData = PathParser().parsePathString("M12 7C12.9665 7 13.75 6.2165 13.75 5.25C13.75 4.2835 12.9665 3.5 12 3.5C11.0335 3.5 10.25 4.2835 10.25 5.25C10.25 6.2165 11.0335 7 12 7ZM12 13.75C12.9665 13.75 13.75 12.9665 13.75 12C13.75 11.0335 12.9665 10.25 12 10.25C11.0335 10.25 10.25 11.0335 10.25 12C10.25 12.9665 11.0335 13.75 12 13.75ZM12 20.5C12.9665 20.5 13.75 19.7165 13.75 18.75C13.75 17.7835 12.9665 17 12 17C11.0335 17 10.25 17.7835 10.25 18.75C10.25 19.7165 11.0335 20.5 12 20.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _moreVert!!
    }

private var _moreVert: ImageVector? = null
