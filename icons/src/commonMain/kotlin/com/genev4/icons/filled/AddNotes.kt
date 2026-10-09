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

public val Icons.Filled.AddNotes: ImageVector
    get() {
        if (_addNotes != null) {
            return _addNotes!!
        }
        _addNotes =
            materialIcon(name = "Filled.AddNotes") {
            addPath(
                pathData = PathParser().parsePathString("M20 2H18V4H16V6H18V8H20V6H22V4H20V2Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 5C14 4.2889 14.1484 3.61246 14.416 3H7C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21H17C19.2091 21 21 19.2091 21 17V9.58396C20.3875 9.85155 19.7111 10 19 10C16.2386 10 14 7.76142 14 5ZM7 9H13V7H7V9ZM7 13H17V11H7V13ZM7 17H14V15H7V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _addNotes!!
    }

private var _addNotes: ImageVector? = null
