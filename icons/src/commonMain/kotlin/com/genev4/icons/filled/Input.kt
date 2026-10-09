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

public val Icons.Filled.Input: ImageVector
    get() {
        if (_input != null) {
            return _input!!
        }
        _input =
            materialIcon(name = "Filled.Input") {
            addPath(
                pathData = PathParser().parsePathString("M18 5.99951H6C4.89543 5.99951 4 6.89494 4 7.99951V8.99951H2V7.99951C2 5.79037 3.79086 3.99951 6 3.99951H18C20.2091 3.99951 22 5.79037 22 7.99951V15.9995C22 18.2087 20.2091 19.9995 18 19.9995H6C3.79086 19.9995 2 18.2087 2 15.9995V14.9995H4V15.9995C4 17.1041 4.89543 17.9995 6 17.9995H18C19.1046 17.9995 20 17.1041 20 15.9995V7.99951C20 6.89494 19.1046 5.99951 18 5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M9.99109 8.81705L12.1734 10.9994H2V12.9994H12.1734L9.99135 15.1814L11.4056 16.5957L15.2947 12.7065C15.6853 12.316 15.6853 11.6828 15.2947 11.2923L11.4053 7.40283L9.99109 8.81705Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _input!!
    }

private var _input: ImageVector? = null
