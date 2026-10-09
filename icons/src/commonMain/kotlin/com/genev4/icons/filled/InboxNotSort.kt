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

public val Icons.Filled.InboxNotSort: ImageVector
    get() {
        if (_inboxNotSort != null) {
            return _inboxNotSort!!
        }
        _inboxNotSort =
            materialIcon(name = "Filled.InboxNotSort") {
            addPath(
                pathData = PathParser().parsePathString("M17 3C19.2091 3 21 4.79086 21 7V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7C3 4.79086 4.79086 3 7 3H17ZM12 6.46127C13.933 6.46127 15.5 8.02827 15.5 9.96127C15.5 11.5008 14.4989 12.8344 13.0752 13.2929L12.9996 13.3143L13 14.5H11V12.4613C11 11.9484 11.386 11.5258 11.8834 11.468L12.1782 11.4586L12.3061 11.4302C12.996 11.2877 13.5 10.6758 13.5 9.96127C13.5 9.13284 12.8284 8.46127 12 8.46127C11.3015 8.46127 10.6996 8.94303 10.5406 9.61234L8.59473 9.15001C8.96676 7.58426 10.3699 6.46127 12 6.46127ZM13 15.5V17.5H11V15.5H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _inboxNotSort!!
    }

private var _inboxNotSort: ImageVector? = null
