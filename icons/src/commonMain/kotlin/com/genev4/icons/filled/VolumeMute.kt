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

public val Icons.Filled.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute =
            materialIcon(name = "Filled.VolumeMute") {
            addPath(
                pathData = PathParser().parsePathString("M17 4.48249C17 4.26856 16.9314 4.06027 16.8043 3.88822C16.4761 3.44404 15.8499 3.35001 15.4057 3.67822L10.233 7.49942L8 7.50023C6.89543 7.50023 6 8.39566 6 9.50023V14.5002C6 15.6048 6.89543 16.5002 8 16.5002L10.233 16.4994L15.4057 20.3222C15.5778 20.4494 15.7861 20.518 16 20.518C16.5523 20.518 17 20.0703 17 19.518V4.48249Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
