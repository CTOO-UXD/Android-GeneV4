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

public val Icons.Outlined.FileTransfer: ImageVector
    get() {
        if (_fileTransfer != null) {
            return _fileTransfer!!
        }
        _fileTransfer =
            materialIcon(name = "Outlined.FileTransfer") {
            addPath(
                pathData = PathParser().parsePathString("M10 3.5L13 5.5H18C20.2091 5.5 22 7.29086 22 9.5V17C22 19.2091 20.2091 21 18 21H6C3.79086 21 2 19.2091 2 17V7.5C2 5.29086 3.79086 3.5 6 3.5H10ZM9.394 5.5H6C4.89543 5.5 4 6.39543 4 7.5V17C4 18.1046 4.89543 19 6 19H18C19.1046 19 20 18.1046 20 17V9.5C20 8.39543 19.1046 7.5 18 7.5H12.3944L9.394 5.5ZM17.1875 12.1123C17.578 12.5028 17.578 13.136 17.1875 13.5265L13.7227 16.9913L12.4499 15.7185L14.4482 13.7189L7.37917 13.7194V11.9194L14.4482 11.9186L12.4499 9.92025L13.7227 8.64746L17.1875 12.1123Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _fileTransfer!!
    }

private var _fileTransfer: ImageVector? = null
