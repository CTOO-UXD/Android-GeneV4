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

public val Icons.Outlined.FormatUnderlined: ImageVector
    get() {
        if (_formatUnderlined != null) {
            return _formatUnderlined!!
        }
        _formatUnderlined =
            materialIcon(name = "Outlined.FormatUnderlined") {
            addPath(
                pathData = PathParser().parsePathString("M11.992 17.9901C9.88 17.9901 8.24 17.3501 7.072 16.0701C5.904 14.7901 5.32 12.9501 5.32 10.5501V4.5H7.576V10.4541C7.576 14.0541 9.056 15.8541 12.016 15.8541C13.456 15.8541 14.56 15.4101 15.328 14.5221C16.096 13.6341 16.48 12.2781 16.48 10.4541V4.5H18.664V10.5501C18.664 12.9661 18.08 14.8101 16.912 16.0821C15.744 17.3541 14.104 17.9901 11.992 17.9901ZM19 19H5V21H19V19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _formatUnderlined!!
    }

private var _formatUnderlined: ImageVector? = null
