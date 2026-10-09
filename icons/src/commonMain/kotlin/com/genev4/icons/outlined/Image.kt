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

public val Icons.Outlined.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image =
            materialIcon(name = "Outlined.Image") {
            addPath(
                pathData = PathParser().parsePathString("M21 7C21 4.79086 19.2091 3 17 3H7C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21H17C19.2091 21 21 19.2091 21 17V7ZM7 5H17C18.1046 5 19 5.89543 19 7V14.5716L15.6657 11.2373C14.8846 10.4562 13.6183 10.4562 12.8372 11.2373L5.62353 18.451C5.23948 18.0865 5 17.5712 5 17V7C5 5.89543 5.89543 5 7 5ZM7.90293 19H17C17.9794 19 18.7943 18.296 18.9665 17.3665L14.2515 12.6515L7.90293 19ZM10 8.5C10 9.32843 9.32843 10 8.5 10C7.67157 10 7 9.32843 7 8.5C7 7.67157 7.67157 7 8.5 7C9.32843 7 10 7.67157 10 8.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _image!!
    }

private var _image: ImageVector? = null
