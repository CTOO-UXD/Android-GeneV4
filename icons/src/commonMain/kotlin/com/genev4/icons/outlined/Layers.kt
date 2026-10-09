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

public val Icons.Outlined.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers =
            materialIcon(name = "Outlined.Layers") {
            addPath(
                pathData = PathParser().parsePathString("M5.02993 7.42078L10.7723 2.9545C11.4945 2.39277 12.5058 2.39277 13.228 2.9545L18.9704 7.42078C19.9999 8.22149 19.9999 9.77747 18.9704 10.5782L13.2281 15.0445C12.5058 15.6062 11.4945 15.6062 10.7723 15.0445L5.02993 10.5782C4.00044 9.77747 4.00044 8.22149 5.02993 7.42078ZM6.25781 8.99948L12.0002 4.5332L17.7425 8.99948L12.0002 13.4658L6.25781 8.99948Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.02993 15.5783C4.15017 14.894 4.02222 13.6582 4.64608 12.8135L12.0001 18.5333L19.3542 12.8135C19.9781 13.6582 19.8502 14.894 18.9704 15.5783L13.2281 20.0446C12.5058 20.6063 11.4945 20.6063 10.7723 20.0446L5.02993 15.5783Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _layers!!
    }

private var _layers: ImageVector? = null
