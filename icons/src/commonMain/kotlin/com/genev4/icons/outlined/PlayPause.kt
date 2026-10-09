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

public val Icons.Outlined.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause =
            materialIcon(name = "Outlined.PlayPause") {
            addPath(
                pathData = PathParser().parsePathString("M4 8.80433C4 8.0189 4.86395 7.54006 5.53 7.95633L10.6432 11.1521C11.2699 11.5438 11.2699 12.4564 10.6432 12.8481L5.53 16.0438C4.86395 16.4601 4 15.9813 4 15.1958V8.80433Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 8V16H16V8H14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18 8V16H20V8H18Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _playPause!!
    }

private var _playPause: ImageVector? = null
