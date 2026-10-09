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

public val Icons.Filled.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build =
            materialIcon(name = "Filled.Build") {
            addPath(
                pathData = PathParser().parsePathString("M8.5 2C12.0899 2 15 4.91015 15 8.5C15 9.1965 14.8905 9.86741 14.6876 10.4965L20.6533 16.447C21.8029 17.5935 21.8053 19.4549 20.6587 20.6045C19.4999 21.7603 17.633 21.7603 16.4796 20.6099L10.5305 14.6766C9.89165 14.8865 9.20908 15 8.5 15C4.91015 15 2 12.0899 2 8.5C2 7.0868 2.45099 5.77894 3.2169 4.71249L7.20617 8.59875L8.43162 8.30454L8.7326 7.03289L4.78206 3.16762C5.8356 2.43168 7.11739 2 8.5 2Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _build!!
    }

private var _build: ImageVector? = null
