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

public val Icons.Filled.AssistantNavigation: ImageVector
    get() {
        if (_assistantNavigation != null) {
            return _assistantNavigation!!
        }
        _assistantNavigation =
            materialIcon(name = "Filled.AssistantNavigation") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM8.07774 15.5235L11.5344 6.68992C11.7002 6.26619 12.2998 6.26619 12.4656 6.68992L15.9223 15.5235C16.1004 15.9787 15.5868 16.3927 15.1798 16.1221L12.2769 14.1917C12.1091 14.0802 11.8909 14.0802 11.7231 14.1917L8.82023 16.1221C8.41321 16.3927 7.89963 15.9787 8.07774 15.5235Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _assistantNavigation!!
    }

private var _assistantNavigation: ImageVector? = null
