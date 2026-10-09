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

public val Icons.Outlined.QuickLaunch: ImageVector
    get() {
        if (_quickLaunch != null) {
            return _quickLaunch!!
        }
        _quickLaunch =
            materialIcon(name = "Outlined.QuickLaunch") {
            addPath(
                pathData = PathParser().parsePathString("M21 4C21 3.44772 20.5523 3 20 3H14V5H17.5847L9.87869 12.7071L11.2929 14.1213L18.9997 6.414L19 10H21V4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3 11.9999C3 7.71671 5.99202 4.13236 10 3.2229V5.28976C7.10851 6.15031 5 8.82886 5 11.9999C5 15.8659 8.13401 18.9999 12 18.9999C15.171 18.9999 17.8496 16.8914 18.7101 13.9999H20.777C19.8675 18.0079 16.2832 20.9999 12 20.9999C7.02944 20.9999 3 16.9704 3 11.9999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _quickLaunch!!
    }

private var _quickLaunch: ImageVector? = null
