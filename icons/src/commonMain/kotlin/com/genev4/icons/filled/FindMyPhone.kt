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

public val Icons.Filled.FindMyPhone: ImageVector
    get() {
        if (_findMyPhone != null) {
            return _findMyPhone!!
        }
        _findMyPhone =
            materialIcon(name = "Filled.FindMyPhone") {
            addPath(
                pathData = PathParser().parsePathString("M5 4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V11.2572C18.0491 10.4718 16.8296 10 15.5 10C12.4624 10 10 12.4624 10 15.5C10 18.0176 11.6915 20.14 14 20.793V22H7C5.89543 22 5 21.1046 5 20V4ZM17.9749 13.0251C19.096 14.1463 19.2976 15.8388 18.5794 17.1654L20.707 19.2929L19.2929 20.7071L17.1651 18.5796C15.8386 19.2975 14.1462 19.096 13.0251 17.9749C11.6583 16.608 11.6583 14.392 13.0251 13.0251C14.392 11.6583 16.608 11.6583 17.9749 13.0251ZM16.5607 16.5607C17.1464 15.9749 17.1464 15.0251 16.5607 14.4393C15.9749 13.8536 15.0251 13.8536 14.4393 14.4393C13.8536 15.0251 13.8536 15.9749 14.4393 16.5607C15.0251 17.1464 15.9749 17.1464 16.5607 16.5607Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _findMyPhone!!
    }

private var _findMyPhone: ImageVector? = null
