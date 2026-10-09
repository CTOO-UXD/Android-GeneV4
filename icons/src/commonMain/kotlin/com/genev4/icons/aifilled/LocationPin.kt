/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.LocationPin: ImageVector
    get() {
        if (_locationPin != null) {
            return _locationPin!!
        }
        _locationPin =
            materialIcon(name = "AiFilled.LocationPin") {
            addPath(
                pathData = PathParser().parsePathString("M12 17L13 15V9.858C14.721 9.411 16 7.858 16 6C16 3.794 14.206 2 12 2C9.794 2 8 3.794 8 6C8 7.858 9.279 9.411 11 9.858V15L12 17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.267 10.563L15.734 12.491C18.325 13.207 20 14.584 20 16C20 17.892 16.715 20 12 20C7.285 20 4 17.892 4 16C4 14.584 5.675 13.207 8.267 12.49L7.734 10.562C4.197 11.54 2 13.623 2 16C2 19.364 6.393 22 12 22C17.607 22 22 19.364 22 16C22 13.623 19.803 11.54 16.267 10.563Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _locationPin!!
    }

private var _locationPin: ImageVector? = null
