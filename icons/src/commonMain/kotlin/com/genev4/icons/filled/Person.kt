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

public val Icons.Filled.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person =
            materialIcon(name = "Filled.Person") {
            addPath(
                pathData = PathParser().parsePathString("M11.9999 11C14.4852 11 16.4999 8.98528 16.4999 6.5C16.4999 4.01472 14.4852 2 11.9999 2C9.51466 2 7.49994 4.01472 7.49994 6.5C7.49994 8.98528 9.51466 11 11.9999 11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.15231 19.5083C2.9799 20.5993 3.89538 21.5 4.99995 21.5H18.9999C20.1045 21.5 21.02 20.5993 20.8476 19.5083C20.3597 16.4209 18.467 12.5 11.9999 12.5C5.53288 12.5 3.6402 16.4209 3.15231 19.5083Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _person!!
    }

private var _person: ImageVector? = null
