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

public val Icons.Outlined.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check =
            materialIcon(name = "Outlined.Check") {
            addPath(
                pathData = PathParser().parsePathString("M22.778 6.7142L11.0719 18.4203C10.6814 18.8108 10.0482 18.8108 9.65771 18.4203L2.91992 11.6825L4.33414 10.2683L10.3648 16.299L21.3638 5.29999L22.778 6.7142Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _check!!
    }

private var _check: ImageVector? = null
