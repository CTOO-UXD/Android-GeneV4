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

public val Icons.Outlined.PlayDisabled: ImageVector
    get() {
        if (_playDisabled != null) {
            return _playDisabled!!
        }
        _playDisabled =
            materialIcon(name = "Outlined.PlayDisabled") {
            addPath(
                pathData = PathParser().parsePathString("M13.9821 16.8104L20.4853 23.3137L21.8995 21.8995L2.10049 2.10046L0.686279 3.51468L5 7.8284V18.6673C5 19.0298 5.09852 19.3855 5.28501 19.6963C5.85331 20.6434 7.08183 20.9506 8.02899 20.3823L13.9821 16.8104ZM12.5239 15.3523L7 9.8284V18.6673L12.5239 15.3523Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.1417 13.7147L17.5175 14.6892L16.059 13.2307L18.112 11.9987L9.90046 7.07219L6.29002 3.46174C6.51066 3.37794 6.74997 3.33206 7 3.33206C7.36249 3.33206 7.71816 3.43058 8.02899 3.61707L19.1417 10.2847C20.0889 10.853 20.396 12.0815 19.8277 13.0287C19.6588 13.3102 19.4232 13.5458 19.1417 13.7147Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _playDisabled!!
    }

private var _playDisabled: ImageVector? = null
