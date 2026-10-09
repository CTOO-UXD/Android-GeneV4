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

public val Icons.Outlined.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation =
            materialIcon(name = "Outlined.Navigation") {
            addPath(
                pathData = PathParser().parsePathString("M11.622 1.70997C12.1328 1.49987 12.7172 1.7436 12.9273 2.25436L19.9512 19.3297C20.066 19.6089 20.0486 19.9249 19.9039 20.1898C19.6389 20.6744 19.0313 20.8525 18.5467 20.5876L11.9999 17.0086L5.50102 20.581C5.23638 20.7265 4.92017 20.7445 4.64067 20.6302C4.12951 20.4211 3.88465 19.8372 4.09376 19.326L11.0769 2.25615C11.1782 2.00849 11.3746 1.81177 11.622 1.70997ZM12.0042 5.26894L7.01416 17.4659L11.9973 14.7278L17.0262 17.4769L12.0042 5.26894Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _navigation!!
    }

private var _navigation: ImageVector? = null
