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

public val Icons.Outlined.ArtTrack: ImageVector
    get() {
        if (_artTrack != null) {
            return _artTrack!!
        }
        _artTrack =
            materialIcon(name = "Outlined.ArtTrack") {
            addPath(
                pathData = PathParser().parsePathString("M7 9.49963C7 10.3281 6.32843 10.9996 5.5 10.9996C4.67157 10.9996 4 10.3281 4 9.49963C4 8.67121 4.67157 7.99963 5.5 7.99963C6.32843 7.99963 7 8.67121 7 9.49963Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M1 6.99963C1 5.89506 1.89543 4.99963 3 4.99963H13C14.1046 4.99963 15 5.89506 15 6.99963V16.9996C15 18.1042 14.1046 18.9996 13 18.9996H3C1.89543 18.9996 1 18.1042 1 16.9996V6.99963ZM3 6.99963H13V14.0852L11.4143 12.4995C10.6332 11.7184 9.36691 11.7184 8.58586 12.4995L4.08571 16.9996H3V6.99963ZM6.91414 16.9996H13V16.9136L10.0001 13.9137L6.91414 16.9996Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 5V19H19V5H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M21 5V19H23V5H21Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _artTrack!!
    }

private var _artTrack: ImageVector? = null
