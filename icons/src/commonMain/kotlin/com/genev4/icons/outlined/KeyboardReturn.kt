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

public val Icons.Outlined.KeyboardReturn: ImageVector
    get() {
        if (_keyboardReturn != null) {
            return _keyboardReturn!!
        }
        _keyboardReturn =
            materialIcon(name = "Outlined.KeyboardReturn") {
            addPath(
                pathData = PathParser().parsePathString("M4.4144 13.4132L8.99999 17.9987L10.4142 16.5845L6.82862 12.9989L17.9998 12.9989C19.6566 12.9989 20.9998 11.6558 20.9998 9.99895V5.99956L18.9998 5.99956V9.99895C18.9998 10.5512 18.5521 10.9989 17.9998 10.9989L6.8286 10.9989L10.4177 7.40982L9.00352 5.99561L4.4144 10.5847C3.63335 11.3658 3.63335 12.6321 4.4144 13.4132Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _keyboardReturn!!
    }

private var _keyboardReturn: ImageVector? = null
