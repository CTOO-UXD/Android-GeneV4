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

public val Icons.Outlined.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload =
            materialIcon(name = "Outlined.Upload") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 16.0001H13.5L13.6493 15.9946C14.684 15.9183 15.4999 15.0546 15.5 14.0003L15.5006 9.83309L16.2429 9.83273C18.0246 9.8325 18.9167 7.67836 17.6569 6.41852L13.4142 2.17587C12.6332 1.39483 11.3668 1.39483 10.5858 2.17587L6.34315 6.41852L6.23754 6.53192C5.13655 7.80321 6.02782 9.8325 7.7571 9.83273L8.50164 9.83309L8.5 13.9999C8.49989 15.1045 9.39535 16.0001 10.5 16.0001ZM10.5 14.0001L10.5006 7.83309L7.75736 7.83273L12 3.59009L16.2426 7.83273L13.5006 7.83309L13.5 14.0001H10.5ZM4 17.0001V15.0001H2V17.0001C2 18.6348 3.22874 20.0001 4.8 20.0001H19.2C20.7713 20.0001 22 18.6348 22 17.0001V15.0001H20V17.0001C20 17.5745 19.617 18.0001 19.2 18.0001H4.8C4.38304 18.0001 4 17.5745 4 17.0001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _upload!!
    }

private var _upload: ImageVector? = null
