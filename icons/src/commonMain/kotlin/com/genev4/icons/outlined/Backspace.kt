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

public val Icons.Outlined.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace =
            materialIcon(name = "Outlined.Backspace") {
            addPath(
                pathData = PathParser().parsePathString("M22 8C22 5.79086 20.2092 4 18 4H7.40025C6.05109 4 4.79283 4.68012 4.05377 5.80886L0.717388 10.9044C0.281704 11.5698 0.281704 12.4302 0.717388 13.0956L4.05377 18.1911C4.79283 19.3199 6.05109 20 7.40025 20H18C20.2092 20 22 18.2091 22 16V8ZM7.40025 6H18C19.1046 6 20 6.89543 20 8V16C20 17.1046 19.1046 18 18 18H7.40025C6.72567 18 6.09654 17.6599 5.72701 17.0956L2.39062 12L5.72701 6.90443C6.09654 6.34006 6.72567 6 7.40025 6ZM14.8285 7.75736L16.2427 9.17157L13.4143 12L16.2427 14.8284L14.8285 16.2426L12 13.4142L9.17162 16.2426L7.75741 14.8284L10.5858 12L7.75741 9.17157L9.17162 7.75736L12 10.5858L14.8285 7.75736Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _backspace!!
    }

private var _backspace: ImageVector? = null
