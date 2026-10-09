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

public val Icons.Outlined.FindMyPhone: ImageVector
    get() {
        if (_findMyPhone != null) {
            return _findMyPhone!!
        }
        _findMyPhone =
            materialIcon(name = "Outlined.FindMyPhone") {
            addPath(
                pathData = PathParser().parsePathString("M17 4H7L7 20H12.3369C12.8365 20.3518 13.3972 20.6225 14 20.793V22H7C5.89543 22 5 21.1046 5 20V4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V11.2572C18.421 10.779 17.7424 10.417 17 10.207V4ZM16.5607 16.5607C17.1464 15.9749 17.1464 15.0251 16.5607 14.4393C15.9749 13.8536 15.0251 13.8536 14.4393 14.4393C13.8536 15.0251 13.8536 15.9749 14.4393 16.5607C15.0251 17.1464 15.9749 17.1464 16.5607 16.5607ZM17.9749 13.0251C19.096 14.1463 19.2976 15.8388 18.5794 17.1654L20.707 19.2929L19.2929 20.7071L17.1651 18.5796C15.8386 19.2975 14.1462 19.096 13.0251 17.9749C11.6583 16.608 11.6583 14.392 13.0251 13.0251C14.392 11.6583 16.608 11.6583 17.9749 13.0251Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _findMyPhone!!
    }

private var _findMyPhone: ImageVector? = null
