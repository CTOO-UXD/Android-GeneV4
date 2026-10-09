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

public val Icons.Outlined.AttachFile: ImageVector
    get() {
        if (_attachFile != null) {
            return _attachFile!!
        }
        _attachFile =
            materialIcon(name = "Outlined.AttachFile") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 2.99963C9.11929 2.99963 8 4.11892 8 5.49963V16.9996C8 19.2088 9.79086 20.9996 12 20.9996C14.2091 20.9996 16 19.2088 16 16.9996V6.99963H18V16.9996C18 20.3133 15.3137 22.9996 12 22.9996C8.68629 22.9996 6 20.3133 6 16.9996V5.49963C6 3.01435 8.01472 0.999634 10.5 0.999634C12.9853 0.999634 15 3.01435 15 5.49963V16.9996C15 18.6565 13.6569 19.9996 12 19.9996C10.3431 19.9996 9 18.6565 9 16.9996V5.99963H11V16.9996C11 17.5519 11.4477 17.9996 12 17.9996C12.5523 17.9996 13 17.5519 13 16.9996V5.49963C13 4.11892 11.8807 2.99963 10.5 2.99963Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _attachFile!!
    }

private var _attachFile: ImageVector? = null
