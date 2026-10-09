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

public val Icons.Filled.SendToMobile: ImageVector
    get() {
        if (_sendToMobile != null) {
            return _sendToMobile!!
        }
        _sendToMobile =
            materialIcon(name = "Filled.SendToMobile") {
            addPath(
                pathData = PathParser().parsePathString("M7 2C5.89543 2 5 2.89543 5 4V20C5 21.1046 5.89543 22 7 22H17C18.1046 22 19 21.1046 19 20V16.1213L18.0606 17.0607C17.4749 17.6464 16.5251 17.6464 15.9393 17.0607L14.5393 15.6607C14.2212 15.3426 14.0756 14.9166 14.1033 14.4998H12C11.1716 14.4998 10.5 13.8282 10.5 12.9998V10.9998C10.5 10.1713 11.1716 9.49977 12 9.49977H14.1033C14.0757 9.08307 14.2213 8.65733 14.5393 8.33934L15.9393 6.93934C16.5251 6.35355 17.4749 6.35355 18.0606 6.93934L19 7.8787V4C19 2.89543 18.1046 2 17 2H7Z").toNodes(),
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
