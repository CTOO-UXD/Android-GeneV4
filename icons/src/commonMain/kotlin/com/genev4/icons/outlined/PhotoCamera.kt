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

public val Icons.Outlined.PhotoCamera: ImageVector
    get() {
        if (_photoCamera != null) {
            return _photoCamera!!
        }
        _photoCamera =
            materialIcon(name = "Outlined.PhotoCamera") {
            addPath(
                pathData = PathParser().parsePathString("M15.0388 3C15.6463 3 16.2209 3.27618 16.6005 3.75061L18 5.5H20C21.1046 5.5 22 6.39543 22 7.5V18C22 19.1046 21.1046 20 20 20H4C2.89543 20 2 19.1046 2 18V7.5C2 6.39543 2.89543 5.5 4 5.5H6L7.39951 3.75061C7.77906 3.27618 8.35368 3 8.96125 3H15.0388ZM15.0388 5H8.96125L6.96125 7.5H4V18H20V7.5H17.0387L15.0388 5ZM12 7C14.7614 7 17 9.23858 17 12C17 14.7614 14.7614 17 12 17C9.23858 17 7 14.7614 7 12C7 9.23858 9.23858 7 12 7ZM12 9C10.3431 9 9 10.3431 9 12C9 13.6569 10.3431 15 12 15C13.6569 15 15 13.6569 15 12C15 10.3431 13.6569 9 12 9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _photoCamera!!
    }

private var _photoCamera: ImageVector? = null
