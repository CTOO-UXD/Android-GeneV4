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

public val Icons.Filled.DirectionsWalk: ImageVector
    get() {
        if (_directionsWalk != null) {
            return _directionsWalk!!
        }
        _directionsWalk =
            materialIcon(name = "Filled.DirectionsWalk") {
            addPath(
                pathData = PathParser().parsePathString("M7 22.5L9.8 8.4L8 9.1V12.5H6V7.8L11.05 5.65C11.2833 5.55 11.5292 5.49167 11.7875 5.475C12.0458 5.45833 12.2917 5.49167 12.525 5.575C12.7583 5.65833 12.9792 5.775 13.1875 5.925C13.3958 6.075 13.5667 6.26667 13.7 6.5L14.7 8.1C15.1333 8.8 15.7208 9.375 16.4625 9.825C17.2042 10.275 18.05 10.5 19 10.5V12.5C17.8333 12.5 16.7917 12.2583 15.875 11.775C14.9583 11.2917 14.175 10.675 13.525 9.925L12.9 13L15 15V22.5H13V16L10.9 14.4L9.1 22.5H7ZM13.5 5C12.95 5 12.4792 4.80417 12.0875 4.4125C11.6958 4.02083 11.5 3.55 11.5 3C11.5 2.45 11.6958 1.97917 12.0875 1.5875C12.4792 1.19583 12.95 1 13.5 1C14.05 1 14.5208 1.19583 14.9125 1.5875C15.3042 1.97917 15.5 2.45 15.5 3C15.5 3.55 15.3042 4.02083 14.9125 4.4125C14.5208 4.80417 14.05 5 13.5 5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _directionsWalk!!
    }

private var _directionsWalk: ImageVector? = null
