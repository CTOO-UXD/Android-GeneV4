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

public val Icons.Filled.AccountBox: ImageVector
    get() {
        if (_accountBox != null) {
            return _accountBox!!
        }
        _accountBox =
            materialIcon(name = "Filled.AccountBox") {
            addPath(
                pathData = PathParser().parsePathString("M7 3H17C19.2091 3 21 4.79086 21 7V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7C3 4.79086 4.79086 3 7 3ZM12 13.5C13.933 13.5 15.5 11.933 15.5 10C15.5 8.067 13.933 6.5 12 6.5C10.067 6.5 8.49997 8.067 8.49997 10C8.49997 11.933 10.067 13.5 12 13.5ZM17 19C17.5046 19 17.9656 18.8131 18.3175 18.5047C17.4917 16.6659 15.7176 15 12 15C8.28233 15 6.50825 16.6659 5.68237 18.5047C6.03427 18.8131 6.49529 19 6.99997 19H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _accountBox!!
    }

private var _accountBox: ImageVector? = null
