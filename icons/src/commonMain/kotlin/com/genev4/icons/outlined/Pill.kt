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

public val Icons.Outlined.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill =
            materialIcon(name = "Outlined.Pill") {
            addPath(
                pathData = PathParser().parsePathString("M14.1209 15.5356L11.6461 18.0105C10.084 19.5726 7.5513 19.5726 5.9892 18.0105C4.4271 16.4484 4.4271 13.9157 5.9892 12.3536L8.46407 9.87878L14.1209 15.5356ZM19.4242 13.0608C21.7674 10.7176 21.7674 6.91862 19.4242 4.57547C17.0811 2.23233 13.2821 2.23233 10.9389 4.57547L4.57499 10.9394C2.23184 13.2826 2.23184 17.0816 4.57499 19.4247C6.91813 21.7679 10.7171 21.7679 13.0603 19.4247L19.4242 13.0608ZM15.5351 14.1214L9.87829 8.46456L12.3532 5.98969C13.9153 4.42759 16.4479 4.42759 18.01 5.98969C19.5721 7.55179 19.5721 10.0844 18.01 11.6465L15.5351 14.1214Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _pill!!
    }

private var _pill: ImageVector? = null
