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

public val Icons.Outlined.Switch: ImageVector
    get() {
        if (_switch != null) {
            return _switch!!
        }
        _switch =
            materialIcon(name = "Outlined.Switch") {
            addPath(
                pathData = PathParser().parsePathString("M5.00005 13.9997C4.57903 13.9997 4.20311 14.2634 4.05978 14.6593C3.91645 15.0551 4.03642 15.4984 4.35986 15.7679L10.3599 20.7681L11.6402 19.2316L7.76204 15.9997L20.0001 15.9997L20.0001 13.9997L5.00005 13.9997ZM4.00005 9.99971L19.0001 9.99971C19.4211 9.99971 19.797 9.73601 19.9403 9.34013C20.0836 8.94426 19.9637 8.50102 19.6402 8.23149L13.6402 3.23149L12.3599 4.76793L16.238 7.99971L4.00005 7.99971L4.00005 9.99971Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _switch!!
    }

private var _switch: ImageVector? = null
