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

public val Icons.Outlined.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download =
            materialIcon(name = "Outlined.Download") {
            addPath(
                pathData = PathParser().parsePathString("M13.5 2.09003H10.5L10.3507 2.09551C9.31596 2.17185 8.50011 3.03553 8.5 4.08982L8.49936 8.25703L7.7571 8.25739C5.97541 8.25762 5.08331 10.4118 6.34315 11.6716L10.5858 15.9142C11.3668 16.6953 12.6332 16.6953 13.4142 15.9142L17.6569 11.6716L17.7625 11.5582C18.8634 10.2869 17.9722 8.25761 16.2429 8.25739L15.4984 8.25703L15.5 4.09023C15.5001 2.98558 14.6047 2.09003 13.5 2.09003ZM13.5 4.09003L13.4994 10.257L16.2426 10.2574L12 14.5L7.75736 10.2574L10.4994 10.257L10.5 4.09003H13.5ZM4 17V15H2V17C2 18.6348 3.22874 20 4.8 20H19.2C20.7713 20 22 18.6348 22 17V15H20V17C20 17.5744 19.617 18 19.2 18H4.8C4.38304 18 4 17.5744 4 17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _download!!
    }

private var _download: ImageVector? = null
