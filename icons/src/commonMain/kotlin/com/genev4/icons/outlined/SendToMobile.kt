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

public val Icons.Outlined.SendToMobile: ImageVector
    get() {
        if (_sendToMobile != null) {
            return _sendToMobile!!
        }
        _sendToMobile =
            materialIcon(name = "Outlined.SendToMobile") {
            addPath(
                pathData = PathParser().parsePathString("M7 4H17V7H19V4C19 2.89543 18.1046 2 17 2H7C5.89543 2 5 2.89543 5 4V20C5 21.1046 5.89543 22 7 22H17C18.1046 22 19 21.1046 19 20V17H17V20H7L7 4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.2905 11.2955L17.0014 7.99414L15.5845 9.40572L17.1742 11.0013H12V13.0013H17.1712L15.5852 14.5904L17.0008 16.0032L20.2898 12.7077C20.6792 12.3176 20.6795 11.6859 20.2905 11.2955Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _sendToMobile!!
    }

private var _sendToMobile: ImageVector? = null
