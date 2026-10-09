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

public val Icons.Outlined.PrivacySwitch: ImageVector
    get() {
        if (_privacySwitch != null) {
            return _privacySwitch!!
        }
        _privacySwitch =
            materialIcon(name = "Outlined.PrivacySwitch") {
            addPath(
                pathData = PathParser().parsePathString("M23 12C23 8.13401 19.866 5 16 5H8C4.13401 5 1 8.13401 1 12C1 15.866 4.13401 19 8 19H16C19.866 19 23 15.866 23 12ZM8 7H11.101C9.80447 8.27052 9 10.0413 9 12C9 13.9587 9.80447 15.7295 11.101 17H8C5.23858 17 3 14.7614 3 12C3 9.23858 5.23858 7 8 7ZM21 12C21 9.23858 18.7614 7 16 7C13.2386 7 11 9.23858 11 12C11 14.7614 13.2386 17 16 17C18.7614 17 21 14.7614 21 12ZM17.5 11.01C17.5 11.4543 17.3069 11.8534 17 12.1281V14H15V12.1281C14.6931 11.8534 14.5 11.4543 14.5 11.01C14.5 10.1816 15.1716 9.51 16 9.51C16.8284 9.51 17.5 10.1816 17.5 11.01Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _privacySwitch!!
    }

private var _privacySwitch: ImageVector? = null
