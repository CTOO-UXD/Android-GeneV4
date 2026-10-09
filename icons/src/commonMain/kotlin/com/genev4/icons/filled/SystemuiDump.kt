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

public val Icons.Filled.SystemuiDump: ImageVector
    get() {
        if (_systemuiDump != null) {
            return _systemuiDump!!
        }
        _systemuiDump =
            materialIcon(name = "Filled.SystemuiDump") {
            addPath(
                pathData = PathParser().parsePathString("M16.5 3C17.6046 3 18.5 3.89543 18.5 5H21V7H18.5V9H21V11H18.5V13H21V15H18.5V17H21V19H18.5C18.5 20.1046 17.6046 21 16.5 21H7.5C6.39543 21 5.5 20.1046 5.5 19H3V17H5.5V15H3V13H5.5V11H3V9H5.5V7H3V5H5.5C5.5 3.89543 6.39543 3 7.5 3H16.5ZM11 9H9V14H11V11H13V8H11V9ZM14 6H16V11H14V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _systemuiDump!!
    }

private var _systemuiDump: ImageVector? = null
