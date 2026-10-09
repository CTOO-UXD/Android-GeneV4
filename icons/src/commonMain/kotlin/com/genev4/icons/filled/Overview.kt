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

public val Icons.Filled.Overview: ImageVector
    get() {
        if (_overview != null) {
            return _overview!!
        }
        _overview =
            materialIcon(name = "Filled.Overview") {
            addPath(
                pathData = PathParser().parsePathString("M2 7.5C2 6.19378 2.83481 5.08254 4 4.67071V3H6V4.67071C7.16519 5.08254 8 6.19378 8 7.5C8 8.80622 7.16519 9.91746 6 10.3293V13.6707C7.16519 14.0825 8 15.1938 8 16.5C8 17.8062 7.16519 18.9175 6 19.3293V21H4V19.3293C2.83481 18.9175 2 17.8062 2 16.5C2 15.1938 2.83481 14.0825 4 13.6707V10.3293C2.83481 9.91746 2 8.80622 2 7.5ZM22 6C22 4.89543 21.1046 4 20 4H11C9.89543 4 9 4.89543 9 6V9C9 10.1046 9.89543 11 11 11H20C21.1046 11 22 10.1046 22 9V6ZM20 13C21.1046 13 22 13.8954 22 15V18C22 19.1046 21.1046 20 20 20H11C9.89543 20 9 19.1046 9 18V15C9 13.8954 9.89543 13 11 13H20ZM4 7.5C4 6.94772 4.44772 6.5 5 6.5C5.55228 6.5 6 6.94772 6 7.5C6 8.05228 5.55228 8.5 5 8.5C4.44772 8.5 4 8.05228 4 7.5ZM5 15.5C4.44772 15.5 4 15.9477 4 16.5C4 17.0523 4.44772 17.5 5 17.5C5.55228 17.5 6 17.0523 6 16.5C6 15.9477 5.55228 15.5 5 15.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _overview!!
    }

private var _overview: ImageVector? = null
