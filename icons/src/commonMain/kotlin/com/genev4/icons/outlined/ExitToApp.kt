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

public val Icons.Outlined.ExitToApp: ImageVector
    get() {
        if (_exitToApp != null) {
            return _exitToApp!!
        }
        _exitToApp =
            materialIcon(name = "Outlined.ExitToApp") {
            addPath(
                pathData = PathParser().parsePathString("M19 18V20C19 21.1046 18.1046 22 17 22H7C5.89543 22 5 21.1046 5 20V4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V6H17V4H7V20H17V18H19ZM10.0183 11.0441L18.5034 11.0443L15.968 8.5086L17.3822 7.09439L21.6249 11.337C22.0154 11.7276 22.0154 12.3607 21.6249 12.7512L17.3822 16.9939L15.968 15.5797L18.5034 13.044L10.0183 13.0441V11.0441Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _exitToApp!!
    }

private var _exitToApp: ImageVector? = null
