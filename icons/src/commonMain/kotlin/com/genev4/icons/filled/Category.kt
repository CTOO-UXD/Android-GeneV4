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

public val Icons.Filled.Category: ImageVector
    get() {
        if (_category != null) {
            return _category!!
        }
        _category =
            materialIcon(name = "Filled.Category") {
            addPath(
                pathData = PathParser().parsePathString("M12.873 3.50303L16.2291 9.51176C16.6014 10.1783 16.1195 10.9994 15.356 10.9994H8.64388C7.88039 10.9994 7.39853 10.1783 7.77083 9.51176L11.1269 3.50304C11.5085 2.81987 12.4914 2.81987 12.873 3.50303Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 17C11 19.2091 9.20914 21 7 21C4.79086 21 3 19.2091 3 17C3 14.7908 4.79086 13 7 13C9.20914 13 11 14.7908 11 17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 14C13 13.4477 13.4477 13 14 13H20C20.5523 13 21 13.4477 21 14V20C21 20.5523 20.5523 21 20 21H14C13.4477 21 13 20.5523 13 20V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _category!!
    }

private var _category: ImageVector? = null
