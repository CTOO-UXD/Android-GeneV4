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

public val Icons.Outlined.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer =
            materialIcon(name = "Outlined.Timer") {
            addPath(
                pathData = PathParser().parsePathString("M9.00012 3H15.0001V1H9.00012V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11.4294 8.49498L10.7122 13.5153C10.6003 14.299 11.2084 15.0002 12.0001 15.0002C12.7918 15.0002 13.4 14.299 13.288 13.5153L12.5708 8.49498C12.5303 8.21096 12.287 8 12.0001 8C11.7132 8 11.47 8.21096 11.4294 8.49498Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.364 19.364C14.8492 22.8787 9.15076 22.8787 5.63604 19.364C2.12132 15.8492 2.12132 10.1508 5.63604 6.63604C8.91169 3.36039 14.0841 3.13758 17.6178 5.96762L19.0708 4.51465L20.485 5.92886L19.0321 7.3818C21.8624 10.9155 21.6397 16.0882 18.364 19.364ZM16.9497 17.9497C14.2161 20.6834 9.78392 20.6834 7.05025 17.9497C4.31658 15.2161 4.31658 10.7839 7.05025 8.05025C9.78392 5.31658 14.2161 5.31658 16.9497 8.05025C19.6834 10.7839 19.6834 15.2161 16.9497 17.9497Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _timer!!
    }

private var _timer: ImageVector? = null
