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

public val Icons.Filled.Mindfulness: ImageVector
    get() {
        if (_mindfulness != null) {
            return _mindfulness!!
        }
        _mindfulness =
            materialIcon(name = "Filled.Mindfulness") {
            addPath(
                pathData = PathParser().parsePathString("M15 22V20H17C18.1046 20 19 19.1046 19 18V15H20.9692C21.6198 15 22.0972 14.3886 21.9394 13.7575L20.5319 8.12759C19.6316 4.52636 16.3959 2 12.6838 2H12C7.02944 2 3 6.02944 3 11C3 13.6655 4.15875 16.0604 6 17.7083V22H15ZM11 7V14H13V7H11ZM14 8V12.5H16V8H14ZM8 8V12H10V8H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _mindfulness!!
    }

private var _mindfulness: ImageVector? = null
