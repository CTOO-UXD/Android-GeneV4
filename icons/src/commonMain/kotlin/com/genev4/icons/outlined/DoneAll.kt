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

public val Icons.Outlined.DoneAll: ImageVector
    get() {
        if (_doneAll != null) {
            return _doneAll!!
        }
        _doneAll =
            materialIcon(name = "Outlined.DoneAll") {
            addPath(
                pathData = PathParser().parsePathString("M1.75601 9.86122L8.8268 16.9317L8.11997 17.6394C7.72945 18.0299 7.09628 18.0299 6.70576 17.6394L0.341797 11.2754L1.75601 9.86122ZM22.2621 6.32568L23.6763 7.7399L13.7768 17.6394C13.3863 18.0299 12.7531 18.0299 12.3626 17.6394L5.99865 11.2754L7.41286 9.86122L13.0697 15.5181L22.2621 6.32568ZM16.6053 6.32568L18.0195 7.7399L13.0697 12.6896L11.6558 11.2757L16.6053 6.32568Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _doneAll!!
    }

private var _doneAll: ImageVector? = null
