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

public val Icons.Outlined.SecurityUpdateGood: ImageVector
    get() {
        if (_securityUpdateGood != null) {
            return _securityUpdateGood!!
        }
        _securityUpdateGood =
            materialIcon(name = "Outlined.SecurityUpdateGood") {
            addPath(
                pathData = PathParser().parsePathString("M17 2C18.1046 2 19 2.89543 19 4V20C19 21.1046 18.1046 22 17 22H7C5.89543 22 5 21.1046 5 20V4C5 2.89543 5.89543 2 7 2H17ZM17 4H7V20H17V4ZM15.1517 8.71967L16.5659 10.1339L11.9697 14.7301C11.5791 15.1206 10.946 15.1206 10.5555 14.7301L9.84835 14.023L7.72703 11.9017L9.14124 10.4874L11.2626 12.6088L15.1517 8.71967Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _securityUpdateGood!!
    }

private var _securityUpdateGood: ImageVector? = null
