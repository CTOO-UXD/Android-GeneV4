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

public val Icons.Filled.AddLocation: ImageVector
    get() {
        if (_addLocation != null) {
            return _addLocation!!
        }
        _addLocation =
            materialIcon(name = "Filled.AddLocation") {
            addPath(
                pathData = PathParser().parsePathString("M21 10.5C21 5.52944 16.9706 1.5 12 1.5C7.02944 1.5 3 5.52944 3 10.5C3 14.1859 5.57257 18.1745 10.715 22.469C11.4556 23.0867 12.5316 23.088 13.2742 22.4726C18.4247 18.1787 21 14.1879 21 10.5ZM11 9.499V6.5H13V9.499L16 9.5V11.5L13 11.499V14.5H11V11.499L8 11.5V9.5L11 9.499Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _addLocation!!
    }

private var _addLocation: ImageVector? = null
