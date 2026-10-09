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

public val Icons.Outlined.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft =
            materialIcon(name = "Outlined.ChevronLeft") {
            addPath(
                pathData = PathParser().parsePathString("M14.002 18.0185L9.39877 13.4153C8.61773 12.6342 8.61773 11.3679 9.39877 10.5868L14.002 5.98358L15.4163 7.3978L10.813 12.0011L15.4162 16.6043L14.002 18.0185Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
