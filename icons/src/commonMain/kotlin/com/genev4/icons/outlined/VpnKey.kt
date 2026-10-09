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

public val Icons.Outlined.VpnKey: ImageVector
    get() {
        if (_vpnKey != null) {
            return _vpnKey!!
        }
        _vpnKey =
            materialIcon(name = "Outlined.VpnKey") {
            addPath(
                pathData = PathParser().parsePathString("M9.51867 16.5812C10.1045 15.9954 10.1045 15.0456 9.51867 14.4598C8.93288 13.8741 7.98313 13.8741 7.39735 14.4598C6.81156 15.0456 6.81156 15.9954 7.39735 16.5812C7.98313 17.167 8.93288 17.167 9.51867 16.5812Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.4791 4.91309C21.2597 5.69377 21.2601 6.95928 20.4802 7.74041L20.1255 8.09507L20.4802 8.44972C21.2601 9.23085 21.2597 10.4964 20.4791 11.277L19.0649 12.6913C18.2838 13.4723 17.0175 13.4723 16.2364 12.6913L15.8829 12.3377L14.2546 13.966C14.7892 15.9677 14.2713 18.192 12.7009 19.7623C10.3577 22.1055 6.55876 22.1055 4.21561 19.7623C1.87247 17.4192 1.87247 13.6202 4.21561 11.277C5.78599 9.70667 8.01028 9.18876 10.012 9.72332L16.2364 3.49887C17.0175 2.71782 18.2838 2.71782 19.0649 3.49887L20.4791 4.91309ZM15.8829 9.50928L12.0247 13.3674L12.3223 14.482C12.6803 15.8223 12.3318 17.303 11.2867 18.3481C9.72458 19.9102 7.19192 19.9102 5.62982 18.3481C4.06773 16.786 4.06773 14.2534 5.62982 12.6913C6.67496 11.6461 8.15567 11.2977 9.49596 11.6556L10.6105 11.9532L17.6506 4.91308L19.0649 6.3273L17.2971 8.09507L19.0649 9.86283L17.6506 11.277L15.8829 9.50928Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _vpnKey!!
    }

private var _vpnKey: ImageVector? = null
