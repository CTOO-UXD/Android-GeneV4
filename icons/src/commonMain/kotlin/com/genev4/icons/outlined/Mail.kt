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

public val Icons.Outlined.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail =
            materialIcon(name = "Outlined.Mail") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4H18ZM20 8.856L13.0815 13.3048C12.4227 13.7283 11.5773 13.7283 10.9185 13.3048L4 8.857V16C4 17.1046 4.89543 18 6 18H18C19.1046 18 20 17.1046 20 16V8.856ZM18 6H6C5.3648 6 4.79877 6.29612 4.43241 6.75784L11.9997 11.622L19.5676 6.75784C19.2012 6.29612 18.6352 6 18 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _mail!!
    }

private var _mail: ImageVector? = null
