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

public val Icons.Outlined.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }
        _sync =
            materialIcon(name = "Outlined.Sync") {
            addPath(
                pathData = PathParser().parsePathString("M21 12C21 16.9706 16.9706 21 12 21C9.74297 21 7.62411 20.1627 6.0008 18.7098L6 21H4V16C4 15.4477 4.44772 15 5 15H10V17L7.10083 17.0004C8.39048 18.2653 10.1335 19 12 19C15.866 19 19 15.866 19 12H21ZM20 3V8C20 8.55228 19.5523 9 19 9H14V7L16.8995 6.99976C15.6108 5.73582 13.8676 5 12 5C8.13401 5 5 8.13401 5 12H3C3 7.02944 7.02944 3 12 3C14.2587 3 16.378 3.83869 18.0004 5.2912L18 3H20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _sync!!
    }

private var _sync: ImageVector? = null
