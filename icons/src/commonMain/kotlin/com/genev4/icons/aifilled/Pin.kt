/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin =
            materialIcon(name = "AiFilled.Pin") {
            addPath(
                pathData = PathParser().parsePathString("M8.625 15.375L2.625 21.375L8.625 15.375ZM21.375 10.125L13.875 2.625C13.875 2.625 12.375 5.625 10.875 7.125C9.375 8.625 4.125 10.125 4.125 10.125L13.875 19.875C13.875 19.875 15.375 14.625 16.875 13.125C18.375 11.625 21.375 10.125 21.375 10.125Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8.625 15.375L2.625 21.375M21.375 10.125L13.875 2.625C13.875 2.625 12.375 5.625 10.875 7.125C9.375 8.625 4.125 10.125 4.125 10.125L13.875 19.875C13.875 19.875 15.375 14.625 16.875 13.125C18.375 11.625 21.375 10.125 21.375 10.125Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _pin!!
    }

private var _pin: ImageVector? = null
