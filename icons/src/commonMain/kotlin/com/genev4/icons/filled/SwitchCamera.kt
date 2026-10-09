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

public val Icons.Filled.SwitchCamera: ImageVector
    get() {
        if (_switchCamera != null) {
            return _switchCamera!!
        }
        _switchCamera =
            materialIcon(name = "Filled.SwitchCamera") {
            addPath(
                pathData = PathParser().parsePathString("M2 7.5C2 6.39543 2.89543 5.5 4 5.5H6L7.39951 3.75061C7.77906 3.27618 8.35368 3 8.96125 3H15.0387C15.6463 3 16.2209 3.27618 16.6005 3.75061L18 5.5H20C21.1046 5.5 22 6.39543 22 7.5V18C22 19.1046 21.1046 20 20 20H4C2.89543 20 2 19.1046 2 18V7.5ZM10.0161 9.514L8.74333 8.24121L5.6928 11.2922C5.30227 11.6828 5.30227 12.3159 5.6928 12.7064L8.74262 15.757L10.0154 14.4843L8.5309 12.9984H15.4689L13.985 14.4828L15.2577 15.7556L18.3079 12.7064C18.6984 12.3159 18.6984 11.6828 18.3079 11.2922L15.257 8.24263L13.9843 9.51542L15.4689 10.9984H8.5309L10.0161 9.514Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _switchCamera!!
    }

private var _switchCamera: ImageVector? = null
