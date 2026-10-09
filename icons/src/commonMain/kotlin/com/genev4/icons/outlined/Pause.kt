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

public val Icons.Outlined.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause =
            materialIcon(name = "Outlined.Pause") {
            addPath(
                pathData = PathParser().parsePathString("M5 6.33008C5 5.22551 5.89543 4.33008 7 4.33008H9C10.1046 4.33008 11 5.22551 11 6.33008V18.3301C11 19.4346 10.1046 20.3301 9 20.3301H7C5.89543 20.3301 5 19.4346 5 18.3301V6.33008ZM7 6.33008H9V18.3301H7L7 6.33008Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 6.33008C13 5.22551 13.8954 4.33008 15 4.33008H17C18.1046 4.33008 19 5.22551 19 6.33008V18.3301C19 19.4346 18.1046 20.3301 17 20.3301H15C13.8954 20.3301 13 19.4346 13 18.3301V6.33008ZM15 6.33008H17V18.3301H15V6.33008Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _pause!!
    }

private var _pause: ImageVector? = null
