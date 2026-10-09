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

public val Icons.Outlined.ArrowSelectorTool: ImageVector
    get() {
        if (_arrowSelectorTool != null) {
            return _arrowSelectorTool!!
        }
        _arrowSelectorTool =
            materialIcon(name = "Outlined.ArrowSelectorTool") {
            addPath(
                pathData = PathParser().parsePathString("M13.2271 13.4488L18.6789 13.8359C19.6488 13.9048 20.1365 12.6891 19.388 12.0686L7.22705 1.98654C6.57748 1.44801 5.59402 1.90647 5.58883 2.75023L5.49172 18.549C5.48574 19.5213 6.73038 19.9293 7.30121 19.1422L10.5093 14.719L13.9601 22.1194L16.679 20.8515L13.2271 13.4488ZM15.7137 11.6203L10.5518 11.2538L7.51083 15.4467L7.57582 4.87363L15.7137 11.6203Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowSelectorTool!!
    }

private var _arrowSelectorTool: ImageVector? = null
