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

public val Icons.Outlined.PhoneSound: ImageVector
    get() {
        if (_phoneSound != null) {
            return _phoneSound!!
        }
        _phoneSound =
            materialIcon(name = "Outlined.PhoneSound") {
            addPath(
                pathData = PathParser().parsePathString("M19.3348 4.80293C22.9132 8.94935 22.886 15.1244 19.2666 19.2397L17.7648 17.9189C20.7245 14.5537 20.7468 9.50017 17.8207 6.10964L19.3348 4.80293ZM16.2426 7.73955C18.5858 10.0827 18.5858 13.8817 16.2426 16.2248L14.8284 14.8106C16.3905 13.2485 16.3905 10.7159 14.8284 9.15376L16.2426 7.73955ZM11 3.5C12.1046 3.5 13 4.39543 13 5.5V18.5C13 19.6046 12.1046 20.5 11 20.5H4C2.89543 20.5 2 19.6046 2 18.5V5.5C2 4.39543 2.89543 3.5 4 3.5H11ZM11 5.5H4V18.5H11V5.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _phoneSound!!
    }

private var _phoneSound: ImageVector? = null
