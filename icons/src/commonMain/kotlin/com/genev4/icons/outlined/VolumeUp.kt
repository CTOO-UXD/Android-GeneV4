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

public val Icons.Outlined.VolumeUp: ImageVector
    get() {
        if (_volumeUp != null) {
            return _volumeUp!!
        }
        _volumeUp =
            materialIcon(name = "Outlined.VolumeUp") {
            addPath(
                pathData = PathParser().parsePathString("M13 4.48224C13 4.26832 12.9314 4.06003 12.8043 3.88798C12.4761 3.44379 11.8499 3.34977 11.4057 3.67797L6.233 7.49918L4 7.49999C2.89543 7.49999 2 8.39542 2 9.49999V14.5C2 15.6046 2.89543 16.5 4 16.5L6.233 16.4992L11.4057 20.322C11.5778 20.4491 11.7861 20.5177 12 20.5177C12.5523 20.5177 13 20.07 13 19.5177V4.48224ZM11 6.46317V17.5352L6.89151 14.4989L4 14.5V9.49998L6.89194 9.49893L11 6.46317ZM16.2426 7.73953C18.5858 10.0827 18.5858 13.8817 16.2426 16.2248L14.8284 14.8106C16.3905 13.2485 16.3905 10.7158 14.8284 9.15375L16.2426 7.73953ZM19.2666 19.2397C22.886 15.1244 22.9132 8.94934 19.3348 4.80292L17.8207 6.10963C20.7468 9.50016 20.7245 14.5537 17.7648 17.9189L19.2666 19.2397Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
