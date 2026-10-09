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

public val Icons.Filled.TimerAlt: ImageVector
    get() {
        if (_timerAlt != null) {
            return _timerAlt!!
        }
        _timerAlt =
            materialIcon(name = "Filled.TimerAlt") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM7.75736 7.75736C7.55538 7.95934 7.53541 8.28011 7.71078 8.50559L11.4326 13.2908C11.9216 13.9196 12.851 13.9774 13.4142 13.4142C13.9774 12.851 13.9196 11.9216 13.2908 11.4326L8.50559 7.71078C8.28011 7.53541 7.95934 7.55538 7.75736 7.75736Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _timerAlt!!
    }

private var _timerAlt: ImageVector? = null
