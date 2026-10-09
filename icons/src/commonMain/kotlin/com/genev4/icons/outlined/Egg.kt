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

public val Icons.Outlined.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg =
            materialIcon(name = "Outlined.Egg") {
            addPath(
                pathData = PathParser().parsePathString("M12 1.5C16.9706 1.5 21 7.63283 21 13.4318C21 19.2308 16.9706 22.5 12 22.5C7.02944 22.5 3 19.2308 3 13.4318C3 7.63283 7.02944 1.5 12 1.5ZM12 3.5C8.49806 3.5 5 8.34989 5 13.4318C5 17.828 7.8219 20.5 12 20.5C16.1781 20.5 19 17.828 19 13.4318C19 8.34989 15.5019 3.5 12 3.5ZM11.4862 18.9823C15.0318 18.9823 17.6291 16.523 17.6291 12.8005H15.6291C15.6291 15.3933 13.9509 16.9823 11.4862 16.9823V18.9823Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _egg!!
    }

private var _egg: ImageVector? = null
