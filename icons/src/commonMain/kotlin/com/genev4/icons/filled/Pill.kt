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

public val Icons.Filled.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill =
            materialIcon(name = "Filled.Pill") {
            addPath(
                pathData = PathParser().parsePathString("M19.4242 4.57547C17.0811 2.23233 13.2821 2.23233 10.9389 4.57547L4.57499 10.9394C2.23184 13.2826 2.23184 17.0816 4.57499 19.4247C6.91813 21.7679 10.7171 21.7679 13.0603 19.4247L15.5351 16.9498L7.05055 8.46525L8.46476 7.05104L16.9494 15.5356L19.4242 13.0608C21.7674 10.7176 21.7674 6.91862 19.4242 4.57547Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _pill!!
    }

private var _pill: ImageVector? = null
