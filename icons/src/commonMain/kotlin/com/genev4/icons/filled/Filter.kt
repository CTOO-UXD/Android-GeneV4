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

public val Icons.Filled.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter =
            materialIcon(name = "Filled.Filter") {
            addPath(
                pathData = PathParser().parsePathString("M18 8C18 11.3137 15.3137 14 12 14C8.68629 14 6 11.3137 6 8C6 4.68629 8.68629 2 12 2C15.3137 2 18 4.68629 18 8ZM14.9693 14.341C14.9896 14.558 15 14.7779 15 15.0001C15 17.0023 14.1594 18.8081 12.8119 20.084C13.7355 20.6644 14.8286 21.0001 16 21.0001C19.3137 21.0001 22 18.3139 22 15.0001C22 12.6956 20.7007 10.6946 18.7948 9.68945C18.2834 11.7533 16.8562 13.4559 14.9693 14.341ZM12 15.0002C12.6925 15.0002 13.3615 14.8996 13.9932 14.7123C13.9977 14.8077 14 14.9037 14 15.0002C14 18.3139 11.3137 21.0002 8 21.0002C4.68629 21.0002 2 18.3139 2 15.0002C2 12.6956 3.29924 10.6946 5.2052 9.68945C5.96095 12.7394 8.71646 15.0002 12 15.0002Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _filter!!
    }

private var _filter: ImageVector? = null
