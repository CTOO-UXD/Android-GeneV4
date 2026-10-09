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

public val Icons.Filled.HighlighterPen: ImageVector
    get() {
        if (_highlighterPen != null) {
            return _highlighterPen!!
        }
        _highlighterPen =
            materialIcon(name = "Filled.HighlighterPen") {
            addPath(
                pathData = PathParser().parsePathString("M3.40872 13.408C2.68279 14.197 2.70822 15.4182 3.46637 16.1763L3.52407 16.234L1.32324 18.4348C1.2843 18.4738 1.24863 18.5159 1.21662 18.5607C0.895609 19.0101 0.9997 19.6347 1.44911 19.9557L4.74895 22.3127C5.14673 22.5968 5.69163 22.5517 6.03729 22.2061L7.76671 20.4767L7.82441 20.5344C8.58256 21.2925 9.80368 21.3179 10.5927 20.592L18.0106 13.7676L10.2331 5.99014L3.40872 13.408ZM11.4398 4.36838L19.6323 12.5609L21.862 10.9041C21.9322 10.8504 21.9988 10.7921 22.0613 10.7296C22.8424 9.94859 22.8424 8.68226 22.0613 7.90121L16.0995 1.93941C16.037 1.8769 15.9704 1.8186 15.9002 1.7649C15.0228 1.09393 13.7676 1.2613 13.0966 2.13872L11.4398 4.36838Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _highlighterPen!!
    }

private var _highlighterPen: ImageVector? = null
