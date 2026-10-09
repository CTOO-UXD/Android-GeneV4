/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money =
            materialIcon(name = "AiFilled.Money") {
            addPath(
                pathData = PathParser().parsePathString("M12.0049 22.0028C6.48204 22.0028 2.00488 17.5257 2.00488 12.0028C2.00488 6.47996 6.48204 2.00281 12.0049 2.00281C17.5277 2.00281 22.0049 6.47996 22.0049 12.0028C22.0049 17.5257 17.5277 22.0028 12.0049 22.0028ZM8.50488 14.0028V16.0028H11.0049V18.0028H13.0049V16.0028H14.0049C15.3856 16.0028 16.5049 14.8836 16.5049 13.5028C16.5049 12.1221 15.3856 11.0028 14.0049 11.0028H10.0049C9.72874 11.0028 9.50488 10.779 9.50488 10.5028C9.50488 10.2267 9.72874 10.0028 10.0049 10.0028H15.5049V8.00281H13.0049V6.00281H11.0049V8.00281H10.0049C8.62417 8.00281 7.50488 9.12209 7.50488 10.5028C7.50488 11.8836 8.62417 13.0028 10.0049 13.0028H14.0049C14.281 13.0028 14.5049 13.2267 14.5049 13.5028C14.5049 13.779 14.281 14.0028 14.0049 14.0028H8.50488Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _money!!
    }

private var _money: ImageVector? = null
