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

public val Icons.Filled.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate =
            materialIcon(name = "Filled.Translate") {
            addPath(
                pathData = PathParser().parsePathString("M9.15755 2H6.84247L2.09326 12.9985H4.27234L5.35226 10.5H10.6495L10.8654 11H13.0439L9.15755 2ZM9.78584 8.5H6.21575L8.00023 4.36485L9.78584 8.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M14.4877 12L14.0498 10.663L15.9505 10.0405L16.5922 12H21.0001V14H19.1056C18.7733 15.7245 17.9997 17.1425 16.9914 18.2836C18.2939 19.2055 19.8048 19.7746 21.1731 20.015L20.8271 21.9848C19.1676 21.6933 17.188 20.9493 15.4979 19.665C13.8104 20.9491 11.8332 21.6932 10.1731 21.9848L9.82715 20.015C11.1945 19.7748 12.703 19.2061 14.0032 18.2847C12.9928 17.1435 12.2175 15.7252 11.8848 14H10.0001V12H14.4877ZM13.9352 14C14.2266 15.149 14.7822 16.1283 15.4968 16.945C16.2099 16.1283 16.7643 15.1491 17.0553 14H13.9352Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _translate!!
    }

private var _translate: ImageVector? = null
