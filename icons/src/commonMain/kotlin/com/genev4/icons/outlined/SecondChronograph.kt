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

public val Icons.Outlined.SecondChronograph: ImageVector
    get() {
        if (_secondChronograph != null) {
            return _secondChronograph!!
        }
        _secondChronograph =
            materialIcon(name = "Outlined.SecondChronograph") {
            addPath(
                pathData = PathParser().parsePathString("M15 3.00955V2H9V3.02595L10.4922 4.12575C6.23947 4.84307 3 8.54323 3 13C3 17.9706 7.02944 22 12 22C16.9706 22 21 17.9706 21 13C21 10.6201 20.0762 8.45591 18.5677 6.8465L19.8284 5.58579L18.4142 4.17157L17.042 5.54381C15.9979 4.83645 14.7975 4.3426 13.5032 4.12498L15 3.00955ZM12 6C8.13401 6 5 9.13401 5 13C5 16.866 8.13401 20 12 20C15.866 20 19 16.866 19 13C19 9.13401 15.866 6 12 6ZM13 8V14H11V8H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _secondChronograph!!
    }

private var _secondChronograph: ImageVector? = null
