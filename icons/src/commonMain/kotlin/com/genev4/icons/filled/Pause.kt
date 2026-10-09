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

public val Icons.Filled.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause =
            materialIcon(name = "Filled.Pause") {
            addPath(
                pathData = PathParser().parsePathString("M7 4.33008C5.89543 4.33008 5 5.22551 5 6.33008V18.3301C5 19.4346 5.89543 20.3301 7 20.3301H8C9.10457 20.3301 10 19.4346 10 18.3301V6.33008C10 5.22551 9.10457 4.33008 8 4.33008H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16 4.33008C14.8954 4.33008 14 5.22551 14 6.33008V18.3301C14 19.4346 14.8954 20.3301 16 20.3301H17C18.1046 20.3301 19 19.4346 19 18.3301V6.33008C19 5.22551 18.1046 4.33008 17 4.33008H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _pause!!
    }

private var _pause: ImageVector? = null
