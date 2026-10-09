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

public val Icons.Filled.ShieldPerson: ImageVector
    get() {
        if (_shieldPerson != null) {
            return _shieldPerson!!
        }
        _shieldPerson =
            materialIcon(name = "Filled.ShieldPerson") {
            addPath(
                pathData = PathParser().parsePathString("M4.56841 4.87279C3.9233 5.13013 3.45789 5.70373 3.33898 6.38801C3.18766 7.25875 3.02637 8.47036 3.02637 9.67844C3.02637 17.409 8.8954 20.7591 11.1943 21.7709C11.7076 21.9968 12.2923 21.9968 12.8056 21.7709C15.1045 20.7591 20.9735 17.409 20.9735 9.67844C20.9735 8.49098 20.81 7.26878 20.6577 6.38814C20.5392 5.70321 20.0736 5.12892 19.428 4.87138L12.741 2.20387C12.2652 2.01407 11.7347 2.01407 11.2589 2.20387L4.56841 4.87279ZM12 14.8005C14.0509 14.8005 15.6734 15.3483 16.8134 16.2511C15.2351 18.2966 13.1736 19.4238 11.9999 19.9403C10.8263 19.4238 8.76475 18.2966 7.18654 16.2512C8.32649 15.3483 9.94901 14.8005 12 14.8005ZM12 13.4998C13.933 13.4998 15.5 11.9328 15.5 9.99976C15.5 8.06676 13.933 6.49976 12 6.49976C10.067 6.49976 8.50001 8.06676 8.50001 9.99976C8.50001 11.9328 10.067 13.4998 12 13.4998Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _shieldPerson!!
    }

private var _shieldPerson: ImageVector? = null
