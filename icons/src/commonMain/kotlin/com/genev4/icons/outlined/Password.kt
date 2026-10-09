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

public val Icons.Outlined.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password =
            materialIcon(name = "Outlined.Password") {
            addPath(
                pathData = PathParser().parsePathString("M6.14952 7.27698L4.85048 6.52698L4 8.00005L3.14952 6.52698L1.85048 7.27698L2.70096 8.75005H1V10.2501H2.70096L1.85048 11.7231L3.14952 12.4731L4 11.0001L4.85048 12.4731L6.14952 11.7231L5.29904 10.2501H7V8.75005H5.29904L6.14952 7.27698ZM22 17.0001V15.0001H2V17.0001H22ZM20.8505 6.52698L22.1495 7.27698L21.299 8.75005H23V10.2501H21.299L22.1495 11.7231L20.8505 12.4731L20 11.0001L19.1495 12.4731L17.8505 11.7231L18.701 10.2501H17V8.75005H18.701L17.8505 7.27698L19.1495 6.52698L20 8.00005L20.8505 6.52698ZM14.1495 7.27698L12.8505 6.52698L12 8.00005L11.1495 6.52698L9.85048 7.27698L10.701 8.75005H9V10.2501H10.701L9.85048 11.7231L11.1495 12.4731L12 11.0001L12.8505 12.4731L14.1495 11.7231L13.299 10.2501H15V8.75005H13.299L14.1495 7.27698Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _password!!
    }

private var _password: ImageVector? = null
