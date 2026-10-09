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

public val Icons.Outlined.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) {
            return _arrowCircleUp!!
        }
        _arrowCircleUp =
            materialIcon(name = "Outlined.ArrowCircleUp") {
            addPath(
                pathData = PathParser().parsePathString("M10.5853 9.14964L6.58307 13.1519L7.99729 14.5661L11.9995 10.5639L16.0017 14.5661L17.4159 13.1519L13.4137 9.14964C12.6327 8.36859 11.3663 8.36859 10.5853 9.14964Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4.92844 4.92789C8.83369 1.02265 15.1653 1.02265 19.0706 4.9279C22.9758 8.83314 22.9758 15.1648 19.0706 19.07C15.1653 22.9753 8.83369 22.9753 4.92844 19.07C1.0232 15.1648 1.0232 8.83314 4.92844 4.92789ZM6.34266 6.34211C9.46685 3.21791 14.5322 3.21792 17.6564 6.34211C20.7806 9.4663 20.7806 14.5316 17.6564 17.6558C14.5322 20.78 9.46685 20.78 6.34266 17.6558C3.21846 14.5316 3.21846 9.4663 6.34266 6.34211Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
