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

public val Icons.Filled.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer =
            materialIcon(name = "Filled.Timer") {
            addPath(
                pathData = PathParser().parsePathString("M9.00012 3H15.0001V1H9.00012V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.63604 19.364C9.15076 22.8787 14.8492 22.8787 18.364 19.364C21.6397 16.0882 21.8624 10.9155 19.0321 7.3818L20.485 5.92886L19.0708 4.51465L17.6178 5.96762C14.0841 3.13758 8.91169 3.36039 5.63604 6.63604C2.12132 10.1508 2.12132 15.8492 5.63604 19.364ZM11.4294 8.49498L10.7122 13.5153C10.6003 14.299 11.2084 15.0002 12.0001 15.0002C12.7918 15.0002 13.4 14.299 13.288 13.5153L12.5708 8.49498C12.5303 8.21096 12.287 8 12.0001 8C11.7132 8 11.47 8.21096 11.4294 8.49498Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _timer!!
    }

private var _timer: ImageVector? = null
