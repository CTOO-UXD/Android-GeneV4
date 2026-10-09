/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket =
            materialIcon(name = "AiFilled.Rocket") {
            addPath(
                pathData = PathParser().parsePathString("M8.49816 20.0047H15.5018C14.8432 21.5841 13.5794 22.8479 12 23.5065C10.4206 22.8479 9.15679 21.5841 8.49816 20.0047ZM18 14.8094L20 17.0777V19.0047H4V17.0777L6 14.8094V9.00475C6 5.5215 8.50442 2.55819 12 1.45996C15.4956 2.55819 18 5.5215 18 9.00475V14.8094ZM12 11.0047C13.1046 11.0047 14 10.1093 14 9.00475C14 7.90018 13.1046 7.00475 12 7.00475C10.8954 7.00475 10 7.90018 10 9.00475C10 10.1093 10.8954 11.0047 12 11.0047Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _rocket!!
    }

private var _rocket: ImageVector? = null
