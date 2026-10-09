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

public val Icons.Filled.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download =
            materialIcon(name = "Filled.Download") {
            addPath(
                pathData = PathParser().parsePathString("M13.5 2.08997H10.5L10.3507 2.09545C9.31596 2.17179 8.50011 3.03547 8.5 4.08976L8.49936 8.25697L7.7571 8.25733C5.97541 8.25756 5.08331 10.4117 6.34315 11.6715L10.5858 15.9142C11.3668 16.6952 12.6332 16.6952 13.4142 15.9142L17.6569 11.6715L17.7625 11.5581C18.8634 10.2868 17.9722 8.25755 16.2429 8.25733L15.4984 8.25697L15.5 4.09017C15.5001 2.98552 14.6047 2.08997 13.5 2.08997ZM4 17V15H2V17C2 18.6347 3.22874 20 4.8 20H19.2C20.7713 20 22 18.6347 22 17V15H20V17C20 17.5744 19.617 18 19.2 18H4.8C4.38304 18 4 17.5744 4 17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _download!!
    }

private var _download: ImageVector? = null
