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

public val Icons.Filled.ArrowInsert: ImageVector
    get() {
        if (_arrowInsert != null) {
            return _arrowInsert!!
        }
        _arrowInsert =
            materialIcon(name = "Filled.ArrowInsert") {
            addPath(
                pathData = PathParser().parsePathString("M6.3396 8.33728V17.6673H8.3396L8.3396 9.75166L16.9624 18.3745L18.3766 16.9603L9.75364 8.33728L17.6696 8.33728V6.33728H8.3396C7.23503 6.33728 6.3396 7.23271 6.3396 8.33728Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowInsert!!
    }

private var _arrowInsert: ImageVector? = null
