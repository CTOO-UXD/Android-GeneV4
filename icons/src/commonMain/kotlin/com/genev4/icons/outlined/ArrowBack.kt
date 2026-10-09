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

public val Icons.Outlined.ArrowBack: ImageVector
    get() {
        if (_arrowBack != null) {
            return _arrowBack!!
        }
        _arrowBack =
            materialIcon(name = "Outlined.ArrowBack") {
            addPath(
                pathData = PathParser().parsePathString("M5.40854 13.4121L12.0058 20.0094L13.4201 18.5952L7.82277 12.9979L20.0174 12.9979V10.9979L7.82274 10.9979L13.42 5.40063L12.0058 3.98642L5.40854 10.5837C4.62749 11.3648 4.62749 12.6311 5.40854 13.4121Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowBack!!
    }

private var _arrowBack: ImageVector? = null
