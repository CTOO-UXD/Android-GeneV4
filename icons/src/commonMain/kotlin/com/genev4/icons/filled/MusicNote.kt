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

public val Icons.Filled.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote =
            materialIcon(name = "Filled.MusicNote") {
            addPath(
                pathData = PathParser().parsePathString("M12 2.5L19 3.5V6L14 5.286V17C14 19.4853 11.9853 21.5 9.5 21.5C7.01472 21.5 5 19.4853 5 17C5 14.5147 7.01472 12.5 9.5 12.5C10.4253 12.5 11.2854 12.7793 12.0005 13.2581L12 2.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
