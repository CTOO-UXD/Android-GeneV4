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

public val Icons.AiFilled.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school =
            materialIcon(name = "AiFilled.School") {
            addPath(
                pathData = PathParser().parsePathString("M12 2L0 9L12 16L22 10.1667V17.5H24V9L12 2ZM3.99902 13.4905V18.0001C5.82344 20.429 8.72812 22.0001 11.9998 22.0001C15.2714 22.0001 18.1761 20.429 20.0005 18.0001L20.0001 13.4913L12.0003 18.1579L3.99902 13.4905Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _school!!
    }

private var _school: ImageVector? = null
