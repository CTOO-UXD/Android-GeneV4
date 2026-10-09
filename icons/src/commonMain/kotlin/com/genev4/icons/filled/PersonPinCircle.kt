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

public val Icons.Filled.PersonPinCircle: ImageVector
    get() {
        if (_personPinCircle != null) {
            return _personPinCircle!!
        }
        _personPinCircle =
            materialIcon(name = "Filled.PersonPinCircle") {
            addPath(
                pathData = PathParser().parsePathString("M21 10.5C21 11.8107 20.7198 13.056 20.2161 14.1792C18.5989 18.0704 14.8915 21.2418 13.0616 22.6353C12.4282 23.1177 11.5718 23.1177 10.9384 22.6353C9.10849 21.2418 5.40105 18.0703 3.78392 14.1791C3.28018 13.056 3 11.8107 3 10.5C3 5.52944 7.02944 1.5 12 1.5C16.9706 1.5 21 5.52944 21 10.5ZM12 11.25C13.5188 11.25 14.75 10.0188 14.75 8.5C14.75 6.98122 13.5188 5.75 12 5.75C10.4812 5.75 9.24999 6.98122 9.24999 8.5C9.24999 10.0188 10.4812 11.25 12 11.25ZM12 12.5C9.66992 12.5 8.23058 13.2635 7.34842 14.2901C8.44865 15.6388 10.1238 16.5 12 16.5C13.8762 16.5 15.5513 15.6388 16.6516 14.2901C15.7694 13.2635 14.3301 12.5 12 12.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _personPinCircle!!
    }

private var _personPinCircle: ImageVector? = null
