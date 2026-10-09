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

public val Icons.Outlined.SwitchCard: ImageVector
    get() {
        if (_switchCard != null) {
            return _switchCard!!
        }
        _switchCard =
            materialIcon(name = "Outlined.SwitchCard") {
            addPath(
                pathData = PathParser().parsePathString("M6 6H18C19.1046 6 20 6.89543 20 8V16C20 17.1046 19.1046 18 18 18H6C4.89543 18 4 17.1046 4 16V8C4 6.89543 4.89543 6 6 6ZM2 8C2 5.79086 3.79086 4 6 4H18C20.2091 4 22 5.79086 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8ZM7.79482 13.2445C7.90232 12.9476 8.18426 12.7499 8.50003 12.7499L16 12.7499V14.2499L10.5715 14.2499L11.9802 15.4238L11.0199 16.5761L8.01988 14.076C7.77731 13.8739 7.68733 13.5414 7.79482 13.2445ZM15.5 11.2499L8.00003 11.2499V9.74986L13.5243 9.74985L11.9023 8.31109L12.8977 7.18895L15.9977 9.93878C16.2308 10.1455 16.3118 10.4748 16.2012 10.766C16.0906 11.0573 15.8116 11.2499 15.5 11.2499Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _switchCard!!
    }

private var _switchCard: ImageVector? = null
