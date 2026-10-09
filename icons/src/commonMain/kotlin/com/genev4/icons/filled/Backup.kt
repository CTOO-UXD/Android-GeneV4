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

public val Icons.Filled.Backup: ImageVector
    get() {
        if (_backup != null) {
            return _backup!!
        }
        _backup =
            materialIcon(name = "Filled.Backup") {
            addPath(
                pathData = PathParser().parsePathString("M12.5 3C8.93685 3 5.91777 5.32946 4.8826 8.54853C2.59677 9.55468 1 11.8409 1 14.5C1 18.0899 3.91015 21 7.5 21H17.5C20.5376 21 23 18.5376 23 15.5C23 13.5687 22.0045 11.8698 20.4987 10.8886C20.4394 6.52143 16.8809 3 12.5 3ZM9.06508 12.9171C8.84235 12.9171 8.73081 12.6479 8.8883 12.4904L11.6435 9.73516C11.8388 9.5399 12.1553 9.5399 12.3506 9.73516L15.1058 12.4904C15.2633 12.6479 15.1518 12.9171 14.929 12.9171H13V17H11V12.9171H9.06508Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _backup!!
    }

private var _backup: ImageVector? = null
