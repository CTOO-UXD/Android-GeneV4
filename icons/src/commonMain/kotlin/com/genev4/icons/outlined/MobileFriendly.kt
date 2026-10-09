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

public val Icons.Outlined.MobileFriendly: ImageVector
    get() {
        if (_mobileFriendly != null) {
            return _mobileFriendly!!
        }
        _mobileFriendly =
            materialIcon(name = "Outlined.MobileFriendly") {
            addPath(
                pathData = PathParser().parsePathString("M16 4H6L6 20H16V16.9103C16.2463 16.7891 16.4774 16.6266 16.683 16.4226L18 15.1163V20C18 21.1046 17.1046 22 16 22H6C4.89543 22 4 21.1046 4 20V4C4 2.89543 4.89543 2 6 2H16C17.1046 2 18 2.89543 18 4V8.074L16 10.0577V4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.6267 15.3576C15.1966 15.7842 14.5026 15.7828 14.0742 15.3545L10.6174 11.8977L12.0316 10.4835L14.8546 13.3065L20.289 7.91636L21.6974 9.33634L15.6267 15.3576Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _mobileFriendly!!
    }

private var _mobileFriendly: ImageVector? = null
