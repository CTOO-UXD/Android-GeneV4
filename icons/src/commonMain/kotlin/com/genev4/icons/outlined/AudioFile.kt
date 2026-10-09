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

public val Icons.Outlined.AudioFile: ImageVector
    get() {
        if (_audioFile != null) {
            return _audioFile!!
        }
        _audioFile =
            materialIcon(name = "Outlined.AudioFile") {
            addPath(
                pathData = PathParser().parsePathString("M15.5113 10.5239L11.125 9.77478V13.6004C10.9836 13.5713 10.8373 13.556 10.6875 13.556C9.47938 13.556 8.5 14.5509 8.5 15.7782C8.5 17.0055 9.47938 18.0004 10.6875 18.0004C11.8956 18.0004 12.875 17.0055 12.875 15.7782V11.8472L15.5113 12.3243V10.5239Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20 6L16 2H8C5.79086 2 4 3.79086 4 6V18C4 20.2091 5.79086 22 8 22H16C18.2091 22 20 20.2091 20 18V6ZM8 4H15V6C15 6.55228 15.4477 7 16 7H18V18C18 19.1046 17.1046 20 16 20H8C6.89543 20 6 19.1046 6 18V6C6 4.89543 6.89543 4 8 4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _audioFile!!
    }

private var _audioFile: ImageVector? = null
