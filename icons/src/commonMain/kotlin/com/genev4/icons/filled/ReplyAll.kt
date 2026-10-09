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

public val Icons.Filled.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll =
            materialIcon(name = "Filled.ReplyAll") {
            addPath(
                pathData = PathParser().parsePathString("M7.99877 4.99951L3.41318 9.5851C2.63213 10.3661 2.63213 11.6325 3.41318 12.4135L8.0023 17.0026L9.41651 15.5884L4.82739 10.9993L9.41298 6.41372L7.99877 4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.9988 4.99951L8.41318 9.5851C7.63213 10.3661 7.63213 11.6325 8.41318 12.4135L13.0023 17.0026L14.4165 15.5884L10.8275 11.9994L16.9999 11.9994C18.6568 11.9994 19.9999 13.3426 19.9999 14.9994V18.9999H21.9999V14.9994C21.9999 12.238 19.7613 9.99942 16.9999 9.99941L10.8273 9.99939L14.413 6.41372L12.9988 4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
