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

public val Icons.Filled.Monitoring: ImageVector
    get() {
        if (_monitoring != null) {
            return _monitoring!!
        }
        _monitoring =
            materialIcon(name = "Filled.Monitoring") {
            addPath(
                pathData = PathParser().parsePathString("M12 1.5C15.866 1.5 19 4.63401 19 8.5V11.5C19 15.0265 16.3923 17.9439 13 18.4291V20H20V22H13H11H4V20H11V18.4291C7.60771 17.9439 5 15.0265 5 11.5V8.5C5 4.63401 8.13401 1.5 12 1.5ZM12 6C13.6569 6 15 7.34315 15 9C15 10.6569 13.6569 12 12 12C10.3431 12 9 10.6569 9 9C9 7.34315 10.3431 6 12 6ZM12 7.8C11.3373 7.8 10.8 8.33726 10.8 9C10.8 9.66274 11.3373 10.2 12 10.2C12.6627 10.2 13.2 9.66274 13.2 9C13.2 8.33726 12.6627 7.8 12 7.8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _monitoring!!
    }

private var _monitoring: ImageVector? = null
