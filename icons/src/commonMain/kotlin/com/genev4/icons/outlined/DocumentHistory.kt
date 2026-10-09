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

public val Icons.Outlined.DocumentHistory: ImageVector
    get() {
        if (_documentHistory != null) {
            return _documentHistory!!
        }
        _documentHistory =
            materialIcon(name = "Outlined.DocumentHistory") {
            addPath(
                pathData = PathParser().parsePathString("M16 2L20 6V18C20 20.2091 18.2091 22 16 22H8C5.79086 22 4 20.2091 4 18V6C4 3.79086 5.79086 2 8 2H16ZM15 4H8C6.89543 4 6 4.89543 6 6V18C6 19.1046 6.89543 20 8 20H16C17.1046 20 18 19.1046 18 18V7H16C15.4477 7 15 6.55228 15 6V4ZM13.4878 9.02918V13.4566L10.354 16.6477L8.92704 15.2464L11.4875 12.6372L11.4878 9.02918H13.4878Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _documentHistory!!
    }

private var _documentHistory: ImageVector? = null
