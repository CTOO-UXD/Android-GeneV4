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

public val Icons.Filled.EmojiFlags: ImageVector
    get() {
        if (_emojiFlags != null) {
            return _emojiFlags!!
        }
        _emojiFlags =
            materialIcon(name = "Filled.EmojiFlags") {
            addPath(
                pathData = PathParser().parsePathString("M7 3L7.00098 3.67899C8.52804 3.22792 9.85854 3 11 3C12.0083 3 12.6805 3.22916 13.8442 3.81795L14.1379 3.96526C14.9622 4.3714 15.3847 4.5 16.0018 4.5C17.0061 4.5 17.9764 4.30209 18.9217 3.90349C19.6875 3.58187 20.5677 3.94513 20.8856 4.71157C20.9607 4.89275 20.9996 5.08691 21 5.28516V12.1839C20.9998 12.7637 20.6656 13.2908 20.1313 13.5456C18.7563 14.1795 17.3756 14.5 15.9965 14.5C14.9729 14.5 14.3128 14.2722 13.0712 13.6521L12.6351 13.4396C11.926 13.1063 11.5359 13 11 13C9.93713 13 8.60096 13.2412 7.00147 13.7296L7 22H5V3H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _emojiFlags!!
    }

private var _emojiFlags: ImageVector? = null
