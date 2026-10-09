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

public val Icons.Outlined.PermDeviceInformation: ImageVector
    get() {
        if (_permDeviceInformation != null) {
            return _permDeviceInformation!!
        }
        _permDeviceInformation =
            materialIcon(name = "Outlined.PermDeviceInformation") {
            addPath(
                pathData = PathParser().parsePathString("M12 9C11.7167 9 11.4792 8.90417 11.2875 8.7125C11.0958 8.52083 11 8.28333 11 8C11 7.71667 11.0958 7.47917 11.2875 7.2875C11.4792 7.09583 11.7167 7 12 7C12.2833 7 12.5208 7.09583 12.7125 7.2875C12.9042 7.47917 13 7.71667 13 8C13 8.28333 12.9042 8.52083 12.7125 8.7125C12.5208 8.90417 12.2833 9 12 9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 16.5V11H13V16.5H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5 4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V20C19 21.1046 18.1046 22 17 22H7C5.89543 22 5 21.1046 5 20V4ZM7 4H17V20H7L7 4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _permDeviceInformation!!
    }

private var _permDeviceInformation: ImageVector? = null
