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

public val Icons.Filled.FolderZip: ImageVector
    get() {
        if (_folderZip != null) {
            return _folderZip!!
        }
        _folderZip =
            materialIcon(name = "Filled.FolderZip") {
            addPath(
                pathData = PathParser().parsePathString("M13 5L10 3H6C3.79086 3 2 4.79086 2 7V16C2 18.2091 3.79086 20 6 20H18C20.2091 20 22 18.2091 22 16V9C22 6.79086 20.2091 5 18 5H13ZM18 8H16V6H14V8H16V10H14V12H16V14H14V17H16H18V15H16V14H18V12H16V10H18V8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _folderZip!!
    }

private var _folderZip: ImageVector? = null
