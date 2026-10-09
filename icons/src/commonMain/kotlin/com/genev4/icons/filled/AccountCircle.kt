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

public val Icons.Filled.AccountCircle: ImageVector
    get() {
        if (_accountCircle != null) {
            return _accountCircle!!
        }
        _accountCircle =
            materialIcon(name = "Filled.AccountCircle") {
            addPath(
                pathData = PathParser().parsePathString("M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22ZM15.5 10C15.5 11.933 13.933 13.5 12 13.5C10.067 13.5 8.50001 11.933 8.50001 10C8.50001 8.067 10.067 6.5 12 6.5C13.933 6.5 15.5 8.067 15.5 10ZM12 20C14.2692 20 16.3178 19.0552 17.7738 17.5375C16.7902 16.1203 15.0486 15 12 15C8.95138 15 7.20974 16.1203 6.2262 17.5375C7.68217 19.0552 9.73073 20 12 20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _accountCircle!!
    }

private var _accountCircle: ImageVector? = null
