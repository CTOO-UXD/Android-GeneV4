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

public val Icons.Outlined.AddComment: ImageVector
    get() {
        if (_addComment != null) {
            return _addComment!!
        }
        _addComment =
            materialIcon(name = "Outlined.AddComment") {
            addPath(
                pathData = PathParser().parsePathString("M11 5.99963V8.99963H8V10.9996H11V13.9996H13V10.9996H16V8.99963H13V5.99963H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2.70711 21.9991C2.89464 21.9991 3.0745 21.9246 3.20711 21.792L7 17.9991H18C20.2091 17.9991 22 16.2083 22 13.9991V5.99915C22 3.79001 20.2091 1.99915 18 1.99915H6C3.79086 1.99915 2 3.79001 2 5.99915V21.292C2 21.6826 2.31658 21.9991 2.70711 21.9991ZM18 15.9991H6.17157L4 18.1707V5.99915C4 4.89458 4.89543 3.99915 6 3.99915H18C19.1046 3.99915 20 4.89458 20 5.99915V13.9991C20 15.1037 19.1046 15.9991 18 15.9991Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _addComment!!
    }

private var _addComment: ImageVector? = null
