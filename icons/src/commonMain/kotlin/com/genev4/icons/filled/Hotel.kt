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

public val Icons.Filled.Hotel: ImageVector
    get() {
        if (_hotel != null) {
            return _hotel!!
        }
        _hotel =
            materialIcon(name = "Filled.Hotel") {
            addPath(
                pathData = PathParser().parsePathString("M13.9832 4.04953C14.0024 4.16146 14.0121 4.27482 14.0121 4.38839V6.452C14.1503 6.45282 14.288 6.46795 14.4231 6.49716L19.4231 7.57851C20.3434 7.77756 21.0003 8.59166 21.0003 9.53331V19.0095H22.0185V21.0095H14.0121V21.0152H3.0121V21.0095H2.02051V19.0095H3.0121V5.59178C3.0121 4.61796 3.7135 3.78569 4.67324 3.6207L11.6732 2.4173C12.7618 2.23016 13.796 2.96093 13.9832 4.04953ZM14.0121 18.9732H19.0003V9.53331L14.0121 8.45375V18.9732ZM9.57933 8.07377L7.57936 8.06175L7.52584 16.9709L9.52581 16.9829L9.57933 8.07377Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _hotel!!
    }

private var _hotel: ImageVector? = null
