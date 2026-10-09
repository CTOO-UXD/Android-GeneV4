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

public val Icons.Filled.PrivacyCenter: ImageVector
    get() {
        if (_privacyCenter != null) {
            return _privacyCenter!!
        }
        _privacyCenter =
            materialIcon(name = "Filled.PrivacyCenter") {
            addPath(
                pathData = PathParser().parsePathString("M22 6C22 4.89543 21.1046 4 20 4H4C2.89543 4 2 4.89543 2 6V23L7.0226 20H20C21.1046 20 22 19.1046 22 18V6ZM12 9C13.1046 9 14 9.89543 14 11C14 11.7398 13.5983 12.3858 13.0011 12.7318L13 16H11L10.9999 12.7324C10.4022 12.3866 10 11.7403 10 11C10 9.89543 10.8954 9 12 9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _privacyCenter!!
    }

private var _privacyCenter: ImageVector? = null
