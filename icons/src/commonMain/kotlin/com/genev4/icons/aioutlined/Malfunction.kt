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

public val Icons.AiOutlined.Malfunction: ImageVector
    get() {
        if (_malfunction != null) {
            return _malfunction!!
        }
        _malfunction =
            materialIcon(name = "AiOutlined.Malfunction") {
            addPath(
                pathData = PathParser().parsePathString("M6 4H18C18.5523 4 19 4.44771 19 5V15H5V5C5 4.44772 5.44772 4 6 4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.0459 15L20.2197 18.6973C20.4244 19.3421 19.9431 20 19.2666 20H4.7334C4.05687 20 3.57557 19.3421 3.78027 18.6973L4.9541 15H19.0459Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12 6V10").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 11H13V13H11V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _malfunction!!
    }

private var _malfunction: ImageVector? = null
