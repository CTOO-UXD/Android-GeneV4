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

public val Icons.Filled.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text =
            materialIcon(name = "Filled.Text") {
            addPath(
                pathData = PathParser().parsePathString("M16 2L20 6V18C20 20.2091 18.2091 22 16 22H8C5.79086 22 4 20.2091 4 18V6C4 3.79086 5.79086 2 8 2H16ZM4.80859 11.2998V12.3555H6.33691V16.8994H7.55273V12.3555H9.08105V11.2998H4.80859ZM9.49707 11.2998L11.3525 14.0518L9.40039 16.8994H10.8008L12.0488 14.9561L13.3213 16.8994H14.7285L12.7607 14.0039L14.6006 11.2998H13.2812L12.0967 13.1162L10.8809 11.2998H9.49707ZM15.0488 11.2998V12.3555H16.5771V16.8994H17.793V12.3555H19.3213V11.2998H15.0488ZM15 6C15 6.55228 15.4477 7 16 7H19L15 3V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _text!!
    }

private var _text: ImageVector? = null
