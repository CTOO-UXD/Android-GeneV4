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

public val Icons.Filled.Drink: ImageVector
    get() {
        if (_drink != null) {
            return _drink!!
        }
        _drink =
            materialIcon(name = "Filled.Drink") {
            addPath(
                pathData = PathParser().parsePathString("M6.64779 10.5638L6.1555 4H17.8443L17.4356 9.44854C15.8078 9.20185 13.9039 9.23843 11.9999 9.99999C10.1285 10.7486 8.25705 10.7967 6.64779 10.5638ZM4.08049 3.07479C4.03698 2.49467 4.49594 2 5.07769 2H18.9221C19.5038 2 19.9628 2.49467 19.9193 3.07479L18.6387 20.1496C18.5604 21.1932 17.6908 22 16.6443 22H7.3555C6.30896 22 5.43937 21.1932 5.3611 20.1496L4.08049 3.07479Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _drink!!
    }

private var _drink: ImageVector? = null
