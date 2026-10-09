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

public val Icons.Outlined.FindDocument: ImageVector
    get() {
        if (_findDocument != null) {
            return _findDocument!!
        }
        _findDocument =
            materialIcon(name = "Outlined.FindDocument") {
            addPath(
                pathData = PathParser().parsePathString("M16 2L20 6V18C20 20.2091 18.2091 22 16 22H8C5.79086 22 4 20.2091 4 18V6C4 3.79086 5.79086 2 8 2H16ZM15 4H8C6.89543 4 6 4.89543 6 6V18C6 19.1046 6.89543 20 8 20H16C17.1046 20 18 19.1046 18 18V7H16C15.4477 7 15 6.55228 15 6V4ZM14.9196 10.8229C15.1647 11.7374 15.0239 12.6644 14.597 13.4311L16.5537 15.3614L15.2195 16.7141L13.2568 14.7791C13.0065 14.9198 12.7348 15.0318 12.4447 15.1095C10.5776 15.6098 8.65844 14.5017 8.15814 12.6346C7.65785 10.7675 8.76589 8.84829 10.633 8.34799C12.5001 7.8477 14.4193 8.95574 14.9196 10.8229ZM11.1248 10.1833C10.2712 10.412 9.76469 11.2893 9.9934 12.1428C10.2221 12.9964 11.0994 13.5029 11.953 13.2742C12.8065 13.0455 13.3131 12.1682 13.0844 11.3146C12.8557 10.4611 11.9783 9.95455 11.1248 10.1833Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _findDocument!!
    }

private var _findDocument: ImageVector? = null
