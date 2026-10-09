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

public val Icons.Filled.PersonRemove: ImageVector
    get() {
        if (_personRemove != null) {
            return _personRemove!!
        }
        _personRemove =
            materialIcon(name = "Filled.PersonRemove") {
            addPath(
                pathData = PathParser().parsePathString("M13.5001 7.5C13.5001 9.70914 11.7092 11.5 9.50006 11.5C7.29092 11.5 5.50006 9.70914 5.50006 7.5C5.50006 5.29086 7.29092 3.5 9.50006 3.5C11.7092 3.5 13.5001 5.29086 13.5001 7.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.50005 21C2.39549 21 1.47643 20.0976 1.67253 19.0106C2.1609 16.3035 3.90342 13 9.50005 13C15.0967 13 16.8392 16.3035 17.3276 19.0106C17.5237 20.0976 16.6046 21 15.5001 21H3.50005Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.0001 13H22.0001V11H16.0001V13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _personRemove!!
    }

private var _personRemove: ImageVector? = null
