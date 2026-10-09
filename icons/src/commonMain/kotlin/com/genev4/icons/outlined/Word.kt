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

public val Icons.Outlined.Word: ImageVector
    get() {
        if (_word != null) {
            return _word!!
        }
        _word =
            materialIcon(name = "Outlined.Word") {
            addPath(
                pathData = PathParser().parsePathString("M16 4.30592C16 4.21128 15.9933 4.11676 15.9799 4.02308C15.8237 2.92961 14.8106 2.16981 13.7172 2.32602L3.71716 3.75459C2.73186 3.89535 2 4.73919 2 5.73449V18.2653C2 19.2606 2.73186 20.1045 3.71716 20.2452L13.7172 21.6738C13.8108 21.6872 13.9054 21.6939 14 21.6939C15.1046 21.6939 16 20.7985 16 19.6939V4.30592ZM4 5.73449L14 4.30592V19.6939L4 18.2653V5.73449ZM7 7.9999V11.9419L8.18091 10.3315C8.55456 9.82155 9.2913 9.78827 9.7121 10.233L9.79185 10.3283L11 11.9639V7.9999H13V14.9999C13 15.9646 11.7689 16.37 11.1957 15.5941L8.991 12.6089L6.80664 15.5909C6.25815 16.3395 5.09776 15.997 5.00581 15.1132L5 14.9999V7.9999H7ZM22 5.9999C22 4.89533 21.1046 3.9999 20 3.9999H17.0421V5.9999H20V17.9999H17.043V19.9999H20C21.1046 19.9999 22 19.1045 22 17.9999V5.9999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _word!!
    }

private var _word: ImageVector? = null
