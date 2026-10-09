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

public val Icons.Outlined.Tool: ImageVector
    get() {
        if (_tool != null) {
            return _tool!!
        }
        _tool =
            materialIcon(name = "Outlined.Tool") {
            addPath(
                pathData = PathParser().parsePathString("M13 2.07728L20.0933 6.17257C20.7121 6.52984 21.0933 7.19009 21.0933 7.90462V16.0952C21.0933 16.8098 20.7121 17.47 20.0933 17.8273L13 21.9226C12.3812 22.2798 11.6188 22.2798 11 21.9226L3.90674 17.8273C3.28794 17.47 2.90674 16.8098 2.90674 16.0952V7.90462C2.90674 7.19009 3.28794 6.52984 3.90674 6.17257L11 2.07728C11.6188 1.72001 12.3812 1.72001 13 2.07728ZM11 4.38668L4.90674 7.90462V14.9405L11 11.4226V4.38668ZM13 4.38668V11.4226L19.0933 14.9405V7.90462L13 4.38668ZM18.0933 16.6726L12 13.1546L5.90674 16.6726L12 20.1905L18.0933 16.6726Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _tool!!
    }

private var _tool: ImageVector? = null
