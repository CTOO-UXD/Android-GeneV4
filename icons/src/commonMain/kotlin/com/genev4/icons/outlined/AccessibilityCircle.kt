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

public val Icons.Outlined.AccessibilityCircle: ImageVector
    get() {
        if (_accessibilityCircle != null) {
            return _accessibilityCircle!!
        }
        _accessibilityCircle =
            materialIcon(name = "Outlined.AccessibilityCircle") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM12 4C7.58172 4 4 7.58172 4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12C20 7.58172 16.4183 4 12 4ZM13.3333 6.66667C13.3333 5.93333 12.7333 5.33333 12 5.33333C11.2667 5.33333 10.6667 5.93333 10.6667 6.66667C10.6667 7.4 11.2667 8 12 8C12.7333 8 13.3333 7.4 13.3333 6.66667ZM14 10H18V8.66666H6V10H10V18.6667H11.3333V14.6667H12.6667V18.6667H14V10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _accessibilityCircle!!
    }

private var _accessibilityCircle: ImageVector? = null
