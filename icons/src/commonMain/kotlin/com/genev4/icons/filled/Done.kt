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

public val Icons.Filled.Done: ImageVector
    get() {
        if (_done != null) {
            return _done!!
        }
        _done =
            materialIcon(name = "Filled.Done") {
            addPath(
                pathData = PathParser().parsePathString("M22.778 6.71426L11.0719 18.4204C10.6814 18.8109 10.0482 18.8109 9.65771 18.4204L2.91992 11.6826L4.33414 10.2684L10.3648 16.2991L21.3638 5.30005L22.778 6.71426Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _done!!
    }

private var _done: ImageVector? = null
