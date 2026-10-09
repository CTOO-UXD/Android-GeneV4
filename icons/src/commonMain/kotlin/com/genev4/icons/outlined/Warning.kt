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

public val Icons.Outlined.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning =
            materialIcon(name = "Outlined.Warning") {
            addPath(
                pathData = PathParser().parsePathString("M12.9578 1.42086C13.2949 1.60475 13.572 1.88181 13.7558 2.21894L22.3868 18.0423C22.9157 19.012 22.5584 20.2269 21.5887 20.7558C21.2949 20.916 20.9656 21 20.631 21H3.36914C2.26457 21 1.36914 20.1046 1.36914 19C1.36914 18.6654 1.45311 18.3361 1.61335 18.0423L10.2443 2.21894C10.7732 1.24925 11.9881 0.891931 12.9578 1.42086ZM12.0001 3.17665L3.36914 19H20.631L12.0001 3.17665ZM11.0001 14V7.99999H13.0001V14H11.0001ZM11.0001 17V15H13.0001V17H11.0001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _warning!!
    }

private var _warning: ImageVector? = null
