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

public val Icons.Outlined.ArrowInsert: ImageVector
    get() {
        if (_arrowInsert != null) {
            return _arrowInsert!!
        }
        _arrowInsert =
            materialIcon(name = "Outlined.ArrowInsert") {
            addPath(
                pathData = PathParser().parsePathString("M6.3396 8.33719V17.6672H8.3396L8.3396 9.75157L16.9624 18.3744L18.3766 16.9602L9.75364 8.33719L17.6696 8.33719V6.33719H8.3396C7.23503 6.33719 6.3396 7.23262 6.3396 8.33719Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowInsert!!
    }

private var _arrowInsert: ImageVector? = null
