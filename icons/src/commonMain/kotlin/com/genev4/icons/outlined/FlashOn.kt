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

public val Icons.Outlined.FlashOn: ImageVector
    get() {
        if (_flashOn != null) {
            return _flashOn!!
        }
        _flashOn =
            materialIcon(name = "Outlined.FlashOn") {
            addPath(
                pathData = PathParser().parsePathString("M12 15.6L15.2 11H12.35L14.35 4H9V12H12V15.6ZM10 22V14H7V2H17L15 9H19L10 22Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _flashOn!!
    }

private var _flashOn: ImageVector? = null
