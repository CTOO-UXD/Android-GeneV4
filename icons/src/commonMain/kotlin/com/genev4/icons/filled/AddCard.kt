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

public val Icons.Filled.AddCard: ImageVector
    get() {
        if (_addCard != null) {
            return _addCard!!
        }
        _addCard =
            materialIcon(name = "Filled.AddCard") {
            addPath(
                pathData = PathParser().parsePathString("M22 8C22 5.79086 20.2091 4 18 4H6C3.79086 4 2 5.79086 2 8V16C2 18.2091 3.79086 20 6 20H14.3415C14.1204 19.3743 14 18.701 14 17.9996C14 14.6859 16.6863 11.9996 20 11.9996C20.7013 11.9996 21.3744 12.1199 22 12.341V8ZM4 8H20V11H4V8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 21.9996V18.9996H16V16.9996H19V13.9996H21V16.9996H24V18.9996H21V21.9996H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _addCard!!
    }

private var _addCard: ImageVector? = null
