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

public val Icons.Filled.SportRecord: ImageVector
    get() {
        if (_sportRecord != null) {
            return _sportRecord!!
        }
        _sportRecord =
            materialIcon(name = "Filled.SportRecord") {
            addPath(
                pathData = PathParser().parsePathString("M3 7C3 4.79086 4.79086 3 7 3H17C19.2091 3 21 4.79086 21 7V12.8027C20.1175 12.2922 19.0929 12 18 12C14.6863 12 12 14.6863 12 18C12 19.0929 12.2922 20.1175 12.8027 21H7C4.79086 21 3 19.2091 3 17V7ZM7 8H17V10H7V8ZM12 12H7V14H12V12ZM22 18C22 20.2091 20.2091 22 18 22C15.7909 22 14 20.2091 14 18C14 15.7909 15.7909 14 18 14C20.2091 14 22 15.7909 22 18ZM17.25 17.6894L17.25 15.5H18.75L18.75 18.0001V18.3107L18.5303 18.5304L16.7626 20.2982L15.7019 19.2375L17.25 17.6894Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _sportRecord!!
    }

private var _sportRecord: ImageVector? = null
