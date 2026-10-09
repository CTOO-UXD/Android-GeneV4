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

public val Icons.Outlined.NetworkWifi: ImageVector
    get() {
        if (_networkWifi != null) {
            return _networkWifi!!
        }
        _networkWifi =
            materialIcon(name = "Outlined.NetworkWifi") {
            addPath(
                pathData = PathParser().parsePathString("M21.3792 6.81924C21.9325 7.18592 22.4631 7.5841 22.9684 8.01124L22.9813 8.02216C19.7786 11.8072 16.6121 15.6062 13.4141 19.4142C13.0523 19.7761 12.5522 20 12 20C11.4477 20 10.9476 19.7761 10.5857 19.4142C7.38757 15.6061 4.22146 11.8071 1.0188 8.02216L1.0317 8.01124C1.53701 7.5841 2.06758 7.18592 2.62085 6.81924C5.30914 5.03763 8.53342 4 12 4C15.4667 4 18.691 5.03763 21.3792 6.81924ZM18.7717 9.90086C16.7995 8.69497 14.4808 8 11.9999 8C9.51902 8 7.20047 8.69492 5.22827 9.90073L3.9228 8.3579C6.25419 6.86476 9.02446 6 12 6C14.9756 6 17.7459 6.86476 20.0773 8.3579L18.7717 9.90086Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _networkWifi!!
    }

private var _networkWifi: ImageVector? = null
