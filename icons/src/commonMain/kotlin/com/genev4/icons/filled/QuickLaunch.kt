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

public val Icons.Filled.QuickLaunch: ImageVector
    get() {
        if (_quickLaunch != null) {
            return _quickLaunch!!
        }
        _quickLaunch =
            materialIcon(name = "Filled.QuickLaunch") {
            addPath(
                pathData = PathParser().parsePathString("M12 3C7.02944 3 3 7.02944 3 12C3 16.9706 7.02944 21 12 21C16.9706 21 21 16.9706 21 12V7C21 4.79086 19.2091 3 17 3H12ZM19.0002 6V12H17.0001V8.41421L8.20722 17.2071L6.793 15.7929L15.5859 7H12.0001V5H18.0002C18.5524 5 19.0002 5.44772 19.0002 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _quickLaunch!!
    }

private var _quickLaunch: ImageVector? = null
