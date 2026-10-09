/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.PaymentsPlan: ImageVector
    get() {
        if (_paymentsPlan != null) {
            return _paymentsPlan!!
        }
        _paymentsPlan =
            materialIcon(name = "AiFilled.PaymentsPlan") {
            addPath(
                pathData = PathParser().parsePathString("M12 16C11.45 16 10.9792 15.8042 10.5875 15.4125C10.1958 15.0208 10 14.55 10 14C10 13.45 10.1958 12.9792 10.5875 12.5875C10.9792 12.1958 11.45 12 12 12C12.55 12 13.0208 12.1958 13.4125 12.5875C13.8042 12.9792 14 13.45 14 14C14 14.55 13.8042 15.0208 13.4125 15.4125C13.0208 15.8042 12.55 16 12 16ZM7.375 7H16.625L18.625 3H5.375L7.375 7ZM8.4 21H15.6C17.1 21 18.375 20.4792 19.425 19.4375C20.475 18.3958 21 17.1167 21 15.6C21 14.9667 20.8917 14.35 20.675 13.75C20.4583 13.15 20.15 12.6083 19.75 12.125L17.15 9H6.85L4.25 12.125C3.85 12.6083 3.54167 13.15 3.325 13.75C3.10833 14.35 3 14.9667 3 15.6C3 17.1167 3.52083 18.3958 4.5625 19.4375C5.60417 20.4792 6.88333 21 8.4 21Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _paymentsPlan!!
    }

private var _paymentsPlan: ImageVector? = null
