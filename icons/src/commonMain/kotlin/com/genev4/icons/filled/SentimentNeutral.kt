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

public val Icons.Filled.SentimentNeutral: ImageVector
    get() {
        if (_sentimentNeutral != null) {
            return _sentimentNeutral!!
        }
        _sentimentNeutral =
            materialIcon(name = "Filled.SentimentNeutral") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM15 14V16H9V14H15ZM8 7.99998C8.55228 7.99998 9 8.67155 9 9.49998C9 10.3284 8.55228 11 8 11C7.44771 11 7 10.3284 7 9.49998C7 8.67155 7.44771 7.99998 8 7.99998ZM16 7.99998C16.5523 7.99998 17 8.67155 17 9.49998C17 10.3284 16.5523 11 16 11C15.4478 11 15 10.3284 15 9.49998C15 8.67155 15.4478 7.99998 16 7.99998Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _sentimentNeutral!!
    }

private var _sentimentNeutral: ImageVector? = null
