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

public val Icons.Filled.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler =
            materialIcon(name = "Filled.Ruler") {
            addPath(
                pathData = PathParser().parsePathString("M17.6563 2.10044C16.8752 1.31939 15.6089 1.31939 14.8279 2.10043L2.09995 14.8284C1.3189 15.6094 1.3189 16.8757 2.09995 17.6568L6.34259 21.8994C7.12364 22.6805 8.38996 22.6805 9.17101 21.8994L21.8989 9.1715C22.68 8.39045 22.68 7.12412 21.8989 6.34308L17.6563 2.10044ZM15.535 8.4644L18.3634 11.2928L19.7776 9.87861L16.9492 7.05018L15.535 8.4644ZM16.2421 10.5857L14.8279 11.9999L16.2421 13.4141L17.6563 11.9999L16.2421 10.5857ZM14.1208 15.5355L15.535 14.1213L12.7065 11.2928L11.2923 12.707L14.1208 15.5355ZM11.9994 14.8284L10.5852 16.2426L11.9994 17.6568L13.4137 16.2426L11.9994 14.8284ZM9.87812 19.7781L11.2923 18.3639L8.46391 15.5355L7.04969 16.9497L9.87812 19.7781Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
