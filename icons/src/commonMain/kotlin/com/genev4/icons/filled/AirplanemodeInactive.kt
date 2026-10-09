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

public val Icons.Filled.AirplanemodeInactive: ImageVector
    get() {
        if (_airplanemodeInactive != null) {
            return _airplanemodeInactive!!
        }
        _airplanemodeInactive =
            materialIcon(name = "Filled.AirplanemodeInactive") {
            addPath(
                pathData = PathParser().parsePathString("M20.65 13.3496H16.1787L9.16045 6.33135L7.75 2.49963H9.5L14.75 10.6496H20.65C21.3956 10.6496 22 11.254 22 11.9996C22 12.7452 21.3956 13.3496 20.65 13.3496Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13.0935 15.9211L19.0711 21.8988L20.4854 20.4845L3.5148 3.51398L2.10059 4.92819L7.82203 10.6496H5.1L3.4 8.49963H2L3.35 11.9996L2 15.4996H3.65L5.1 13.3496H10.522L10.6887 13.5163L7.75 21.4996H9.5L13.0935 15.9211Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _airplanemodeInactive!!
    }

private var _airplanemodeInactive: ImageVector? = null
