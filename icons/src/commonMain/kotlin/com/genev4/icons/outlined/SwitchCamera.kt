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

public val Icons.Outlined.SwitchCamera: ImageVector
    get() {
        if (_switchCamera != null) {
            return _switchCamera!!
        }
        _switchCamera =
            materialIcon(name = "Outlined.SwitchCamera") {
            addPath(
                pathData = PathParser().parsePathString("M8.74333 8.24121L10.0161 9.514L8.5309 10.9984H15.4689L13.9843 9.51542L15.257 8.24263L18.3079 11.2922C18.6984 11.6828 18.6984 12.3159 18.3079 12.7064L15.2577 15.7556L13.985 14.4828L15.4689 12.9984H8.5309L10.0154 14.4843L8.74262 15.757L5.6928 12.7064C5.30227 12.3159 5.30227 11.6828 5.6928 11.2922L8.74333 8.24121Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 5.5H4C2.89543 5.5 2 6.39543 2 7.5V18C2 19.1046 2.89543 20 4 20H20C21.1046 20 22 19.1046 22 18V7.5C22 6.39543 21.1046 5.5 20 5.5H18L16.6005 3.75061C16.2209 3.27618 15.6463 3 15.0387 3H8.96125C8.35368 3 7.77906 3.27618 7.39951 3.75061L6 5.5ZM17.0387 7.5L15.0387 5H8.96125L6.96125 7.5H4V18H20V7.5H17.0387Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _switchCamera!!
    }

private var _switchCamera: ImageVector? = null
