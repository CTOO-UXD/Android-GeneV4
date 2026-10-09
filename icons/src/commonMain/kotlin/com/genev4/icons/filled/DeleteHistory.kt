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

public val Icons.Filled.DeleteHistory: ImageVector
    get() {
        if (_deleteHistory != null) {
            return _deleteHistory!!
        }
        _deleteHistory =
            materialIcon(name = "Filled.DeleteHistory") {
            addPath(
                pathData = PathParser().parsePathString("M14 2C15.1046 2 16 2.89543 16 4V5H22V7H20V12.3414C19.3744 12.1203 18.7013 12 18 12C16.9071 12 15.8825 12.2922 15 12.8027V9H13V14.6822C12.3682 15.6325 12 16.7733 12 18C12 19.5367 12.5777 20.9385 13.5278 22H8C5.79086 22 4 20.2091 4 18V7H2V5H8V4C8 2.89543 8.89543 2 10 2H14ZM10 5H14V4H10V5ZM11 9V18H9V9H11ZM22 18C22 20.2091 20.2091 22 18 22C15.7909 22 14 20.2091 14 18C14 15.7909 15.7909 14 18 14C20.2091 14 22 15.7909 22 18ZM18.7623 15.6211V18.36L16.9304 20.1908L15.8697 19.1301L17.2623 17.7373V15.6211H18.7623Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _deleteHistory!!
    }

private var _deleteHistory: ImageVector? = null
