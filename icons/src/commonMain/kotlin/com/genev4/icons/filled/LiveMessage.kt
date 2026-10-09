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

public val Icons.Filled.LiveMessage: ImageVector
    get() {
        if (_liveMessage != null) {
            return _liveMessage!!
        }
        _liveMessage =
            materialIcon(name = "Filled.LiveMessage") {
            addPath(
                pathData = PathParser().parsePathString("M1.5 7.08925C1.5 4.17673 4.84978 2.5384 7.14879 4.32651L10.4651 6.9059C11.3679 7.60806 12.6321 7.60806 13.5349 6.9059L16.8512 4.32651C19.1502 2.5384 22.5 4.17673 22.5 7.08925V20H19.5V7.08925C19.5 6.67317 19.0215 6.43912 18.693 6.69457L15.3767 9.27396C13.3906 10.8187 10.6094 10.8187 8.62333 9.27396L5.30697 6.69457C4.97854 6.43913 4.5 6.67317 4.5 7.08925V17.2299C4.5 17.6538 4.99443 17.8854 5.32009 17.614L11.0397 12.8476L12.9603 15.1523L7.24064 19.9187C4.961 21.8184 1.5 20.1973 1.5 17.2299V7.08925Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _liveMessage!!
    }

private var _liveMessage: ImageVector? = null
