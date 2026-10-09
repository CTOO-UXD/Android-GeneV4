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

public val Icons.Outlined.Erase: ImageVector
    get() {
        if (_erase != null) {
            return _erase!!
        }
        _erase =
            materialIcon(name = "Outlined.Erase") {
            addPath(
                pathData = PathParser().parsePathString("M20.1318 13.0606C21.6939 11.4985 21.6939 8.96586 20.1318 7.40376L16.5963 3.86823C15.0342 2.30613 12.5015 2.30613 10.9394 3.86823L3.86835 10.9393C2.30625 12.5014 2.30625 15.0341 3.86835 16.5961L7.27216 20H3.00008V22H21.0001V20H13.1925L20.1318 13.0606ZM15.1821 5.28244L18.7176 8.81798C19.4986 9.59902 19.4986 10.8654 18.7176 11.6464L14.5918 15.7722L8.22783 9.40825L12.3536 5.28244C13.1347 4.50139 14.401 4.50139 15.1821 5.28244ZM6.81361 10.8225L13.1776 17.1864L11.6465 18.7175C10.8655 19.4985 9.59915 19.4985 8.8181 18.7175L5.28256 15.1819C4.50152 14.4009 4.50152 13.1346 5.28256 12.3535L6.81361 10.8225Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _erase!!
    }

private var _erase: ImageVector? = null
