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

public val Icons.AiFilled.Model: ImageVector
    get() {
        if (_model != null) {
            return _model!!
        }
        _model =
            materialIcon(name = "AiFilled.Model") {
            addPath(
                pathData = PathParser().parsePathString("M12.9995 21.9226L12.9995 12.5772L21.0928 7.90458C21.0928 7.90461 21.0928 7.90463 21.0928 7.90466V16.0953C21.0928 16.8098 20.7116 17.47 20.0928 17.8273L12.9995 21.9226ZM10.9995 21.9226L3.90625 17.8273C3.28745 17.47 2.90625 16.8098 2.90625 16.0953V7.90466C2.90625 7.90438 2.90625 7.9041 2.90625 7.90381L10.9995 12.5765L10.9995 21.9226ZM3.90698 6.17219L10.9995 2.07731C11.6183 1.72005 12.3807 1.72005 12.9995 2.07731L20.0927 6.17257L12.0002 10.8448L3.90698 6.17219Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _model!!
    }

private var _model: ImageVector? = null
