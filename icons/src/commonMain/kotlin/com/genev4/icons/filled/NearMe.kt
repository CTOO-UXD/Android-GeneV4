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

public val Icons.Filled.NearMe: ImageVector
    get() {
        if (_nearMe != null) {
            return _nearMe!!
        }
        _nearMe =
            materialIcon(name = "Filled.NearMe") {
            addPath(
                pathData = PathParser().parsePathString("M19.2446 3.43889C19.4914 3.33541 19.7693 3.33514 20.0163 3.43814C20.526 3.65074 20.7669 4.2363 20.5543 4.74603L13.4469 21.7868C13.3307 22.0654 13.0949 22.2766 12.8052 22.3615C12.2752 22.5168 11.7197 22.2131 11.5643 21.6831L9.46574 14.5231L2.34427 12.4537C2.05428 12.3695 1.8179 12.1587 1.70111 11.8802C1.48753 11.3709 1.72727 10.7849 2.23658 10.5713L19.2446 3.43889Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _nearMe!!
    }

private var _nearMe: ImageVector? = null
