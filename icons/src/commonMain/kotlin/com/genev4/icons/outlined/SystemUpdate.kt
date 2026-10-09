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

public val Icons.Outlined.SystemUpdate: ImageVector
    get() {
        if (_systemUpdate != null) {
            return _systemUpdate!!
        }
        _systemUpdate =
            materialIcon(name = "Outlined.SystemUpdate") {
            addPath(
                pathData = PathParser().parsePathString("M14.932 12.6716C15.1547 12.6716 15.2663 12.9409 15.1088 13.0983L12.3536 15.8536C12.1583 16.0488 11.8417 16.0488 11.6465 15.8536L8.89126 13.0983C8.73376 12.9409 8.84531 12.6716 9.06803 12.6716L10.9971 12.6716V8.58871L12.9971 8.58871V12.6716H14.932Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 4C19 2.89543 18.1046 2 17 2H7C5.89543 2 5 2.89543 5 4V20C5 21.1046 5.89543 22 7 22H17C18.1046 22 19 21.1046 19 20V4ZM7 4H17V20H7V4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _systemUpdate!!
    }

private var _systemUpdate: ImageVector? = null
