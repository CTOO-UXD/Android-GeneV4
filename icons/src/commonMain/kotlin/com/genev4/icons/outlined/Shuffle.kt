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

public val Icons.Outlined.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle =
            materialIcon(name = "Outlined.Shuffle") {
            addPath(
                pathData = PathParser().parsePathString("M5.40701 3.99316L10.5855 9.17166L9.1713 10.5859L3.9928 5.40738L5.40701 3.99316Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.5857 18.0003L13.4139 14.8285L14.8281 13.4143L17.9999 16.5861V14.0003H19.9999V19.0003C19.9999 19.5526 19.5522 20.0003 18.9999 20.0003H13.9999V18.0003H16.5857Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13.9998 6H16.5856L3.99268 18.5929L5.40689 20.0071L17.9998 7.41421V10H19.9998V5C19.9998 4.44772 19.5521 4 18.9998 4H13.9998V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
