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

public val Icons.Filled.ArtTrack: ImageVector
    get() {
        if (_artTrack != null) {
            return _artTrack!!
        }
        _artTrack =
            materialIcon(name = "Filled.ArtTrack") {
            addPath(
                pathData = PathParser().parsePathString("M13 18.9996C13.0259 18.9996 13.0517 18.9991 13.0773 18.9982C13.0949 18.9975 13.1125 18.9966 13.13 18.9955L13.1607 18.9933L13.192 18.9905L13.2046 18.9893L13.2286 18.9867C14.2255 18.8733 15 18.0269 15 16.9996V6.99963C15 5.89506 14.1046 4.99963 13 4.99963H3C1.89543 4.99963 1 5.89506 1 6.99963V16.9996C1 17.9661 1.68556 18.7725 2.59693 18.959C2.72713 18.9856 2.86193 18.9996 3 18.9996H13ZM8.57608 12.5063C9.35713 11.7253 10.6235 11.7253 11.4045 12.5063L13 14.1007V16.9996H4.08165L8.57608 12.5063ZM5.5 10.9996C6.32843 10.9996 7 10.3281 7 9.49963C7 8.67121 6.32843 7.99963 5.5 7.99963C4.67157 7.99963 4 8.67121 4 9.49963C4 10.3281 4.67157 10.9996 5.5 10.9996Z").toNodes(),
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
