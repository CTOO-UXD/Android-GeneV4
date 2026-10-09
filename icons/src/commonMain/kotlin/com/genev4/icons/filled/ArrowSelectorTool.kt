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

public val Icons.Filled.ArrowSelectorTool: ImageVector
    get() {
        if (_arrowSelectorTool != null) {
            return _arrowSelectorTool!!
        }
        _arrowSelectorTool =
            materialIcon(name = "Filled.ArrowSelectorTool") {
            addPath(
                pathData = PathParser().parsePathString("M7.22705 1.98654L19.388 12.0686C20.1365 12.6891 19.6488 13.9048 18.6789 13.8359L13.2271 13.4488L16.679 20.8515L13.9601 22.1194L10.5093 14.719L7.30121 19.1422C6.73038 19.9293 5.48574 19.5213 5.49172 18.549L5.58883 2.75023C5.59402 1.90647 6.57748 1.44801 7.22705 1.98654Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowSelectorTool!!
    }

private var _arrowSelectorTool: ImageVector? = null
