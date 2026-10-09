/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aioutlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiOutlined.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist =
            materialIcon(name = "AiOutlined.Playlist") {
            addPath(
                pathData = PathParser().parsePathString("M11.2227 14.4053H3.22266M11.2227 19.4053H3.22266").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.3927 16.1603C20.9055 16.4564 20.9055 17.1966 20.3927 17.4927L16.9312 19.4912C16.4184 19.7873 15.7773 19.4172 15.7773 18.825L15.7773 14.828C15.7773 14.2358 16.4184 13.8657 16.9312 14.1618L20.3927 16.1603Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.22266 4.40491H13.7227M20.2227 4.40491H17.9727M20.2227 9.40491H9.72266M3.22266 9.40491H5.47266").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _playlist!!
    }

private var _playlist: ImageVector? = null
