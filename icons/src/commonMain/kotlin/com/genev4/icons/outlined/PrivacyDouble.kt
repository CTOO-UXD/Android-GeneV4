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

public val Icons.Outlined.PrivacyDouble: ImageVector
    get() {
        if (_privacyDouble != null) {
            return _privacyDouble!!
        }
        _privacyDouble =
            materialIcon(name = "Outlined.PrivacyDouble") {
            addPath(
                pathData = PathParser().parsePathString("M16 9H4V18H16V9ZM10 11C10.8284 11 11.5 11.6716 11.5 12.5C11.5 12.9437 11.3073 13.3425 11.0011 13.6171L11 15.5H10H9L8.9999 13.618C8.69308 13.3433 8.5 12.9442 8.5 12.5C8.5 11.6716 9.17157 11 10 11ZM18 13H20V5H9V7H16C17.1046 7 18 7.89543 18 9V13ZM18 18C18 19.1046 17.1046 20 16 20H4C2.89543 20 2 19.1046 2 18V9C2 7.89543 2.89543 7 4 7H7V5C7 3.89543 7.89543 3 9 3H20C21.1046 3 22 3.89543 22 5V13C22 14.1046 21.1046 15 20 15H18V18Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _privacyDouble!!
    }

private var _privacyDouble: ImageVector? = null
