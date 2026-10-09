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

public val Icons.Filled.AirplanemodeActive: ImageVector
    get() {
        if (_airplanemodeActive != null) {
            return _airplanemodeActive!!
        }
        _airplanemodeActive =
            materialIcon(name = "Filled.AirplanemodeActive") {
            addPath(
                pathData = PathParser().parsePathString("M7.75 21.5H9.5L14.75 13.35L20.65 13.35C21.3956 13.35 22 12.7456 22 12C22 11.2544 21.3956 10.65 20.65 10.65L14.75 10.65L9.5 2.5L7.75 2.5L10.75 10.65L5.1 10.65L3.4 8.5H2L3.35 12L2 15.5H3.65L5.1 13.35L10.75 13.35L7.75 21.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _airplanemodeActive!!
    }

private var _airplanemodeActive: ImageVector? = null
