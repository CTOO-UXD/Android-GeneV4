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

public val Icons.Filled.Acute: ImageVector
    get() {
        if (_acute != null) {
            return _acute!!
        }
        _acute =
            materialIcon(name = "Filled.Acute") {
            addPath(
                pathData = PathParser().parsePathString("M23 11.9994C23 16.4177 19.4183 19.9994 15 19.9994C10.5817 19.9994 7 16.4177 7 11.9994C7 7.58111 10.5817 3.99939 15 3.99939C19.4183 3.99939 23 7.58111 23 11.9994ZM14 11.9994V7.99939H16V11.5852L18.7071 14.2923L17.2929 15.7065L14.2929 12.7065C14.1054 12.519 14 12.2646 14 11.9994Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M6.92072 6.99939H2V8.99939H5.98341C6.21861 8.29213 6.5347 7.62181 6.92072 6.99939Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M1 10.9994H5.552C5.51762 11.328 5.5 11.6617 5.5 11.9994C5.5 12.3371 5.51762 12.6708 5.552 12.9994H1V10.9994Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 14.9994H5.98341C6.21861 15.7066 6.5347 16.377 6.92072 16.9994H2V14.9994Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _acute!!
    }

private var _acute: ImageVector? = null
