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

public val Icons.Filled.BrushPen: ImageVector
    get() {
        if (_brushPen != null) {
            return _brushPen!!
        }
        _brushPen =
            materialIcon(name = "Filled.BrushPen") {
            addPath(
                pathData = PathParser().parsePathString("M22.0092 7.92856C22.7903 8.7096 22.7903 9.97593 22.0092 10.757C21.9467 10.8195 21.8801 10.8778 21.8099 10.9315L19.6197 12.5485L11.4275 4.35631L13.0445 2.16606C13.7155 1.28864 14.9707 1.12128 15.8481 1.79225C15.9183 1.84595 15.9849 1.90424 16.0474 1.96675L22.0092 7.92856ZM10.5652 6.3224L17.8018 13.559C16.6699 16.9251 14.6712 19.261 11.8151 20.4998C8.66694 21.8652 5.32305 22.3527 1.80097 21.962L0.24292 21.7892L1.0564 20.4492C2.16629 18.6209 2.83082 16.8276 3.059 15.066L3.10791 14.7371C3.56608 12.0088 5.28088 9.60251 7.63281 7.89241C8.54613 7.22833 9.52438 6.70464 10.5652 6.3224Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _brushPen!!
    }

private var _brushPen: ImageVector? = null
