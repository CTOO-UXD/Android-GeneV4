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

public val Icons.Outlined.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text =
            materialIcon(name = "Outlined.Text") {
            addPath(
                pathData = PathParser().parsePathString("M6.00002 18C6.00002 19.1046 6.89545 20 8.00002 20H16C17.1046 20 18 19.1046 18 18H20C20 20.2091 18.2092 22 16 22H8.00002C5.79088 22 4.00002 20.2091 4.00002 18H6.00002ZM9.08088 11.3V12.356H7.55288V16.9H6.33688V12.356H4.80888V11.3H9.08088ZM10.8809 11.3L12.0969 13.116L13.2809 11.3H14.6009L12.7609 14.004L14.7289 16.9H13.3209L12.0489 14.956L10.8009 16.9H9.40088L11.3529 14.052L9.49688 11.3H10.8809ZM19.3209 11.3V12.356H17.7929V16.9H16.5769V12.356H15.0489V11.3H19.3209ZM16 2L20 6L19.999 10H17.999L18 7H16C15.4477 7 15 6.55228 15 6V4H8.00002C6.89545 4 6.00002 4.89543 6.00002 6L5.99902 10H3.99902L4.00002 6C4.00002 3.79086 5.79088 2 8.00002 2H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _text!!
    }

private var _text: ImageVector? = null
