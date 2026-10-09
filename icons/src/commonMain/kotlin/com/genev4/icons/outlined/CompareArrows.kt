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

public val Icons.Outlined.CompareArrows: ImageVector
    get() {
        if (_compareArrows != null) {
            return _compareArrows!!
        }
        _compareArrows =
            materialIcon(name = "Outlined.CompareArrows") {
            addPath(
                pathData = PathParser().parsePathString("M17.3738 12.6025L14.7716 10.0003L21.9997 10.0003V8.00035L14.7716 8.00035L17.3738 5.39822L15.9595 3.98401L11.6503 8.29324C11.2598 8.68377 11.2598 9.31693 11.6503 9.70745L15.9595 14.0167L17.3738 12.6025Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.3494 14.2925L8.04018 9.98328L6.62597 11.3975L9.2281 13.9996H2V15.9996H9.2281L6.62597 18.6017L8.04018 20.016L12.3494 15.7067C12.7399 15.3162 12.7399 14.683 12.3494 14.2925Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _compareArrows!!
    }

private var _compareArrows: ImageVector? = null
