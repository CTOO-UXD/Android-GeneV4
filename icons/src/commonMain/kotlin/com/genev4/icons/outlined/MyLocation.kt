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

public val Icons.Outlined.MyLocation: ImageVector
    get() {
        if (_myLocation != null) {
            return _myLocation!!
        }
        _myLocation =
            materialIcon(name = "Outlined.MyLocation") {
            addPath(
                pathData = PathParser().parsePathString("M13 1H11V2.552C6.55197 3.01732 3.01732 6.55197 2.552 11H1V13H2.552C3.01732 17.448 6.55197 20.9827 11 21.448V23H13V21.448C17.448 20.9827 20.9827 17.448 21.448 13H23V11H21.448C20.9827 6.55197 17.448 3.01732 13 2.552V1ZM7 13H4.56609C5.01139 16.3422 7.65778 18.9886 11 19.4339V17H13V19.4339C16.3422 18.9886 18.9886 16.3422 19.4339 13H17V11H19.4339C18.9886 7.65778 16.3422 5.01139 13 4.56609V7H11V4.56609C7.65778 5.01139 5.01139 7.65778 4.56609 11H7V13ZM12 13.5C12.8284 13.5 13.5 12.8284 13.5 12C13.5 11.1716 12.8284 10.5 12 10.5C11.1716 10.5 10.5 11.1716 10.5 12C10.5 12.8284 11.1716 13.5 12 13.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _myLocation!!
    }

private var _myLocation: ImageVector? = null
