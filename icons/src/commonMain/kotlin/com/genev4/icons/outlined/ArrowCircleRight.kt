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

public val Icons.Outlined.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight =
            materialIcon(name = "Outlined.ArrowCircleRight") {
            addPath(
                pathData = PathParser().parsePathString("M14.8488 10.5836L10.8466 6.58137L9.4324 7.99558L13.4346 11.9978L9.4324 16L10.8466 17.4142L14.8488 13.412C15.6299 12.631 15.6299 11.3646 14.8488 10.5836Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.0706 4.92674C22.9758 8.83198 22.9758 15.1636 19.0706 19.0689C15.1653 22.9741 8.83369 22.9741 4.92844 19.0689C1.0232 15.1636 1.0232 8.83198 4.92844 4.92673C8.83369 1.02149 15.1653 1.02149 19.0706 4.92674ZM6.34266 6.34095C9.46685 3.21675 14.5322 3.21676 17.6564 6.34095C20.7806 9.46514 20.7806 14.5305 17.6564 17.6547C14.5322 20.7789 9.46685 20.7789 6.34266 17.6547C3.21846 14.5305 3.21846 9.46514 6.34266 6.34095Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
