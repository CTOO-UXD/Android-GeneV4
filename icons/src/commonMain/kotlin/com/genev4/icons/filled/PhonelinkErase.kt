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

public val Icons.Filled.PhonelinkErase: ImageVector
    get() {
        if (_phonelinkErase != null) {
            return _phonelinkErase!!
        }
        _phonelinkErase =
            materialIcon(name = "Filled.PhonelinkErase") {
            addPath(
                pathData = PathParser().parsePathString("M4 3C4 1.89543 4.89543 1 6 1H16C17.1046 1 18 1.89543 18 3V7.47889L17 8.47891L15.4606 6.93957C14.8749 6.35378 13.9251 6.35378 13.3393 6.93957L11.9393 8.33957C11.3535 8.92535 11.3535 9.8751 11.9393 10.4609L13.4787 12.0002L11.9393 13.5396C11.3535 14.1254 11.3535 15.0751 11.9393 15.6609L13.3393 17.0609C13.9251 17.6467 14.8749 17.6467 15.4606 17.0609L17 15.5215L18 16.5216V19C18 20.1046 17.1046 21 16 21H6C4.89543 21 4 20.1046 4 19V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.6 16L21 14.6L18.4 12L21 9.4L19.6 8L17 10.6L14.4 8L13 9.4L15.5999 12.0001L13 14.6L14.4 16.0002L17 13.4002L19.6 16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _phonelinkErase!!
    }

private var _phonelinkErase: ImageVector? = null
