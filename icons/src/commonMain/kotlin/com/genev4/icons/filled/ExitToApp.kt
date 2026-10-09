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

public val Icons.Filled.ExitToApp: ImageVector
    get() {
        if (_exitToApp != null) {
            return _exitToApp!!
        }
        _exitToApp =
            materialIcon(name = "Filled.ExitToApp") {
            addPath(
                pathData = PathParser().parsePathString("M5 4C5 2.89543 5.89543 2 7.00001 2H17.0001C18.1046 2 19.0001 2.89543 19.0001 4V7.31455L18.3073 6.62175L17.6002 5.91464L16.893 6.62175L15.4788 8.03596L14.7717 8.74307L15.4788 9.45018L16.0286 10H9.00002H8.00001V11V13V14H9.00002H16.0288L15.4788 14.55L14.7717 15.2571L15.4788 15.9642L16.893 17.3784L17.6002 18.0856L18.3073 17.3784L19.0001 16.6856V20C19.0001 21.1046 18.1046 22 17.0001 22H7.00001C5.89543 22 5 21.1046 5 20V4ZM17.6002 16.6712L21.5642 12.7071C21.9548 12.3166 21.9548 11.6834 21.5642 11.2929L17.6002 7.32886L16.1859 8.74307L18.4429 11H9.00002V13H18.4429L16.1859 15.257L17.6002 16.6712Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _exitToApp!!
    }

private var _exitToApp: ImageVector? = null
