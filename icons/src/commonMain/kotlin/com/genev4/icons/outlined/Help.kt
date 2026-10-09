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

public val Icons.Outlined.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help =
            materialIcon(name = "Outlined.Help") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM12 4C7.58172 4 4 7.58172 4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12C20 7.58172 16.4183 4 12 4ZM11.9865 6.5C13.9195 6.5 15.4865 8.067 15.4865 10C15.4865 11.5395 14.4855 12.8732 13.0618 13.3316L12.9862 13.353L12.9865 14.5387H10.9865V12.5C10.9865 11.9872 11.3726 11.5645 11.8699 11.5067L12.1647 11.4974L12.2927 11.4689C12.9825 11.3264 13.4865 10.7146 13.4865 10C13.4865 9.17157 12.815 8.5 11.9865 8.5C11.2881 8.5 10.6861 8.98177 10.5271 9.65107L8.58128 9.18874C8.9533 7.623 10.3565 6.5 11.9865 6.5ZM12.9865 15.5387V17.5387H10.9865V15.5387H12.9865Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _help!!
    }

private var _help: ImageVector? = null
