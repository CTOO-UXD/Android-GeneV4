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

public val Icons.Filled.SelectCheckBox: ImageVector
    get() {
        if (_selectCheckBox != null) {
            return _selectCheckBox!!
        }
        _selectCheckBox =
            materialIcon(name = "Filled.SelectCheckBox") {
            addPath(
                pathData = PathParser().parsePathString("M3 7C3 4.79086 4.79086 3 7 3H17C17.997 3 18.9089 3.36478 19.6093 3.96815C19.5947 3.98167 19.5803 3.99551 19.5661 4.00965L11.5262 12.0495L8.34426 8.86754C7.75847 8.28175 6.80872 8.28175 6.22294 8.86754L4.80872 10.2818C4.52742 10.5631 4.36938 10.9446 4.36938 11.3424C4.36938 11.7402 4.52742 12.1218 4.80872 12.4031L9.75847 17.3528C10.7348 18.3291 12.3177 18.3291 13.294 17.3528L21 9.64682V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11.5262 14.1708L20.6268 5.07031L22.041 6.48453L12.2333 16.2922C11.8428 16.6827 11.2097 16.6827 10.8191 16.2922L5.86938 11.3424L7.2836 9.9282L11.5262 14.1708Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _selectCheckBox!!
    }

private var _selectCheckBox: ImageVector? = null
