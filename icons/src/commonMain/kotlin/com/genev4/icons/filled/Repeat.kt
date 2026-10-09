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

public val Icons.Filled.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat =
            materialIcon(name = "Filled.Repeat") {
            addPath(
                pathData = PathParser().parsePathString("M21.0607 4.93945L16.5607 0.439453L14.4394 2.56077L16.3787 4.50011H7.00004C4.51476 4.50011 2.50004 6.51483 2.50004 9.00011V15.0001H5.50004V9.00011C5.50004 8.17169 6.17161 7.50011 7.00004 7.50011H20C20.6067 7.50011 21.1537 7.13465 21.3859 6.57414C21.618 6.01363 21.4897 5.36845 21.0607 4.93945ZM2.93938 19.0608L7.43938 23.5608L9.5607 21.4395L7.62136 19.5001H17C19.4853 19.5001 21.5 17.4854 21.5 15.0001V9.00011H18.5V15.0001C18.5 15.8285 17.8285 16.5001 17 16.5001H4.00004C3.39335 16.5001 2.84639 16.8656 2.61422 17.4261C2.38205 17.9866 2.51039 18.6318 2.93938 19.0608Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _repeat!!
    }

private var _repeat: ImageVector? = null
