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

public val Icons.AiOutlined.Model: ImageVector
    get() {
        if (_model != null) {
            return _model!!
        }
        _model =
            materialIcon(name = "AiOutlined.Model") {
            addPath(
                pathData = PathParser().parsePathString("M13 21.9226L20.0933 17.8273C20.7121 17.47 21.0933 16.8098 21.0933 16.0953V7.90466C21.0933 7.19012 20.7121 6.52987 20.0933 6.1726L13 2.0773C12.3812 1.72004 11.6188 1.72004 11 2.0773L3.90674 6.1726C3.28794 6.52987 2.90674 7.19012 2.90674 7.90466V16.0953C2.90674 16.8098 3.28794 17.47 3.90674 17.8273L11 21.9226C11.6188 22.2799 12.3812 22.2799 13 21.9226ZM11 19.6132L4.90674 16.0953V9.05936L11 12.5773V19.6132ZM13 19.6132V12.5773L19.0933 9.05936V16.0953L13 19.6132ZM18.0933 7.3273L12 10.8453L5.90674 7.3273L12 3.80936L18.0933 7.3273Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _model!!
    }

private var _model: ImageVector? = null
