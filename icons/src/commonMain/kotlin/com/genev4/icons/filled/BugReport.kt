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

public val Icons.Filled.BugReport: ImageVector
    get() {
        if (_bugReport != null) {
            return _bugReport!!
        }
        _bugReport =
            materialIcon(name = "Filled.BugReport") {
            addPath(
                pathData = PathParser().parsePathString("M10.5621 4.14339C11.0262 4.04649 11.5071 3.99555 12 3.99555C12.4929 3.99555 12.9738 4.04649 13.4379 4.14339L15.1213 2.46002L16.5355 3.87423L15.4859 4.92388C16.7177 5.63264 17.7135 6.7055 18.3264 7.99555H21V9.99555H18.9291C18.9758 10.3222 19 10.6561 19 10.9956V11.9956H21V13.9956H19V14.9956C19 15.3351 18.9758 15.669 18.9291 15.9956H21V17.9956H18.3264C17.2029 20.3605 14.7924 21.9956 12 21.9956C9.2076 21.9956 6.7971 20.3605 5.67363 17.9956H3V15.9956H5.07089C5.02417 15.669 5 15.3351 5 14.9956V13.9956H3V11.9956H5V10.9956C5 10.6561 5.02417 10.3222 5.07089 9.99555H3V7.99555H5.67363C6.28647 6.7055 7.28227 5.63264 8.51412 4.92388L7.46447 3.87423L8.87868 2.46002L10.5621 4.14339ZM9 13.9956H15V15.9956H9V13.9956ZM9 9.99555H15V11.9956H9V9.99555Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _bugReport!!
    }

private var _bugReport: ImageVector? = null
