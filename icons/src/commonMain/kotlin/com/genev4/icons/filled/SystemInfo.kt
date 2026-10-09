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

public val Icons.Filled.SystemInfo: ImageVector
    get() {
        if (_systemInfo != null) {
            return _systemInfo!!
        }
        _systemInfo =
            materialIcon(name = "Filled.SystemInfo") {
            addPath(
                pathData = PathParser().parsePathString("M12.9983 2.07801L20.0916 6.17331C20.7104 6.53057 21.0916 7.19083 21.0916 7.90536V16.096C21.0916 16.8105 20.7104 17.4707 20.0916 17.828L12.9983 21.9233C12.3795 22.2806 11.6171 22.2806 10.9983 21.9233L3.90503 17.828C3.28623 17.4707 2.90503 16.8105 2.90503 16.096V7.90536C2.90503 7.19083 3.28623 6.53057 3.90503 6.17331L10.9983 2.07801C11.6171 1.72074 12.3795 1.72074 12.9983 2.07801ZM11 7H13V9H11V7ZM11 10H13V17H11V10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _systemInfo!!
    }

private var _systemInfo: ImageVector? = null
