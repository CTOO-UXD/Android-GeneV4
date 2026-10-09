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

public val Icons.Filled.HealthFemale: ImageVector
    get() {
        if (_healthFemale != null) {
            return _healthFemale!!
        }
        _healthFemale =
            materialIcon(name = "Filled.HealthFemale") {
            addPath(
                pathData = PathParser().parsePathString("M13 14.9236C16.1151 14.4425 18.5 11.7498 18.5 8.5C18.5 4.91015 15.5899 2 12 2C8.41015 2 5.5 4.91015 5.5 8.5C5.5 11.7498 7.88491 14.4425 11 14.9236V16.5H6V18.5H11V22.5H13V18.5H18V16.5H13V14.9236Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _healthFemale!!
    }

private var _healthFemale: ImageVector? = null
