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

public val Icons.Filled.FileTransfer: ImageVector
    get() {
        if (_fileTransfer != null) {
            return _fileTransfer!!
        }
        _fileTransfer =
            materialIcon(name = "Filled.FileTransfer") {
            addPath(
                pathData = PathParser().parsePathString("M13 5.5L10 3.5H6C3.79086 3.5 2 5.29086 2 7.5V17C2 19.2091 3.79086 21 6 21H18C20.2091 21 22 19.2091 22 17V9.5C22 7.29086 20.2091 5.5 18 5.5H13ZM17.1875 12.1123C17.578 12.5028 17.578 13.136 17.1875 13.5265L13.7227 16.9913L12.4499 15.7185L14.4482 13.7189L7.37915 13.7194V11.9194L14.4482 11.9186L12.4499 9.92025L13.7227 8.64746L17.1875 12.1123Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _fileTransfer!!
    }

private var _fileTransfer: ImageVector? = null
