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

public val Icons.AiFilled.Word: ImageVector
    get() {
        if (_word != null) {
            return _word!!
        }
        _word =
            materialIcon(name = "AiFilled.Word") {
            addPath(
                pathData = PathParser().parsePathString("M17 2.93702H21C21.5523 2.93702 22 3.38788 22 3.94402V20.056C22 20.6122 21.5523 21.063 21 21.063H17V2.93702ZM2.85858 2.81351L15.4293 1.00512C15.7027 0.965801 15.9559 1.15708 15.995 1.43236C15.9983 1.45595 16 1.47974 16 1.50357V22.4965C16 22.7745 15.7761 23 15.5 23C15.4763 23 15.4527 22.9983 15.4293 22.9949L2.85858 21.1865C2.36593 21.1156 2 20.6908 2 20.1897V3.81039C2 3.30926 2.36593 2.88439 2.85858 2.81351ZM11 7.97202V12.996L9 10.993L7.01083 13.007L7 7.97202H5V16.028H7L9 14.014L11 16.028H13V7.97202H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _word!!
    }

private var _word: ImageVector? = null
