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

public val Icons.Filled.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight =
            materialIcon(name = "Filled.ArrowCircleRight") {
            addPath(
                pathData = PathParser().parsePathString("M4.92844 19.069C8.83369 22.9742 15.1653 22.9742 19.0706 19.069C22.9758 15.1638 22.9758 8.8321 19.0706 4.92686C15.1653 1.02161 8.83369 1.02161 4.92844 4.92686C1.0232 8.8321 1.0232 15.1637 4.92844 19.069ZM14.8488 10.5837L10.8466 6.58149L9.4324 7.9957L13.4346 11.9979L9.4324 16.0001L10.8466 17.4144L14.8488 13.4121C15.6299 12.6311 15.6299 11.3648 14.8488 10.5837Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
