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

public val Icons.Outlined.ArrowRightAlt: ImageVector
    get() {
        if (_arrowRightAlt != null) {
            return _arrowRightAlt!!
        }
        _arrowRightAlt =
            materialIcon(name = "Outlined.ArrowRightAlt") {
            addPath(
                pathData = PathParser().parsePathString("M17.587 10.5846L13.0014 5.99899L11.5872 7.41321L15.1729 10.9989L6.00001 10.9989L6 12.9989L15.1727 12.9989L11.5836 16.5879L12.9979 18.0021L17.587 13.413C18.368 12.632 18.368 11.3656 17.587 10.5846Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowRightAlt!!
    }

private var _arrowRightAlt: ImageVector? = null
