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

public val Icons.AiFilled.Dark: ImageVector
    get() {
        if (_dark != null) {
            return _dark!!
        }
        _dark =
            materialIcon(name = "AiFilled.Dark") {
            addPath(
                pathData = PathParser().parsePathString("M10.4466 3.1337C6.16667 3.87892 3 7.60827 3 12C3 16.9705 7.02944 21 12 21C16.3918 21 20.1211 17.8332 20.8659 13.5531C21.0036 12.7622 20.2002 12.1397 19.4688 12.4704C18.7002 12.8179 17.8639 13 17 13C13.6863 13 11 10.3137 11 6.99998C11 6.136 11.1821 5.29933 11.5295 4.53067C11.86 3.7992 11.2374 2.99601 10.4466 3.1337Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _dark!!
    }

private var _dark: ImageVector? = null
