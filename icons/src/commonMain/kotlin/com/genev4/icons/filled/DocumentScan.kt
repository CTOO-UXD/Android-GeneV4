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

public val Icons.Filled.DocumentScan: ImageVector
    get() {
        if (_documentScan != null) {
            return _documentScan!!
        }
        _documentScan =
            materialIcon(name = "Filled.DocumentScan") {
            addPath(
                pathData = PathParser().parsePathString("M8 2C5.79086 2 4 3.79086 4 6V18C4 20.2091 5.79086 22 8 22H13.2676C13.0974 21.7058 13 21.3643 13 21V15C13 13.8954 13.8954 13 15 13H20V6C20 3.79086 18.2091 2 16 2H8ZM17 9H7V7H17V9ZM13 13H7V11H13V13ZM20.999 15.75C20.999 15.3358 20.6632 15 20.249 15H18.749V16.125H19.874V17.2493H20.999V15.75ZM16.124 18.7493V19.875H17.249V21H15.749C15.3348 21 14.999 20.6642 14.999 20.25V18.7493H16.124ZM20.999 18.7493V20.25C20.999 20.6642 20.6632 21 20.249 21H18.749V19.875H19.874V18.7493H20.999ZM17.249 15V16.125H16.124V17.2493H14.999V15.75C14.999 15.3358 15.3348 15 15.749 15H17.249Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _documentScan!!
    }

private var _documentScan: ImageVector? = null
