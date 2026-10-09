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

public val Icons.Filled.FindDocument: ImageVector
    get() {
        if (_findDocument != null) {
            return _findDocument!!
        }
        _findDocument =
            materialIcon(name = "Filled.FindDocument") {
            addPath(
                pathData = PathParser().parsePathString("M16 2L20 6V18C20 20.2091 18.2091 22 16 22H8C5.79086 22 4 20.2091 4 18V6C4 3.79086 5.79086 2 8 2H16ZM16 7H19L15 3V6C15 6.55228 15.4477 7 16 7ZM14.5969 13.4313C15.0238 12.6646 15.1646 11.7376 14.9196 10.823C14.4193 8.9559 12.5001 7.84786 10.633 8.34816C8.76583 8.84845 7.6578 10.7676 8.15809 12.6348C8.65839 14.5019 10.5776 15.6099 12.4447 15.1096C12.7348 15.0319 13.0065 14.92 13.2567 14.7793L15.2194 16.7142L16.5537 15.3616L14.5969 13.4313ZM9.99335 12.143C9.76464 11.2895 10.2712 10.4121 11.1247 10.1834C11.9783 9.95471 12.8556 10.4612 13.0843 11.3148C13.313 12.1683 12.8065 13.0457 11.9529 13.2744C11.0994 13.5031 10.2221 12.9966 9.99335 12.143Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _findDocument!!
    }

private var _findDocument: ImageVector? = null
