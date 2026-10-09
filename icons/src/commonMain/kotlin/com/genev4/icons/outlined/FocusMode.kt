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

public val Icons.Outlined.FocusMode: ImageVector
    get() {
        if (_focusMode != null) {
            return _focusMode!!
        }
        _focusMode =
            materialIcon(name = "Outlined.FocusMode") {
            addPath(
                pathData = PathParser().parsePathString("M20 12C20 11.0848 19.8463 10.2054 19.5633 9.38638L21.1005 7.84918C21.6781 9.11351 22 10.5192 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C13.4798 2 14.8845 2.32143 16.1482 2.89827L14.6108 4.43569C13.7925 4.15334 12.9142 4 12 4C7.58172 4 4 7.58172 4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14.5846 10.476C14.8486 10.9226 15 11.4436 15 12C15 13.6568 13.6569 15 12 15C10.3431 15 9 13.6568 9 12C9 10.3431 10.3431 8.99997 12 8.99997C12.5564 8.99997 13.0773 9.15142 13.524 9.41534L15.3229 7.61645L15.145 6.73053L19.423 2.45233L19.7782 4.22174L21.5476 4.57691L17.2696 8.85511L16.3834 8.67722L14.5846 10.476ZM12 10.5C12.8284 10.5 13.5 11.1715 13.5 12C13.5 12.8284 12.8284 13.5 12 13.5C11.1716 13.5 10.5 12.8284 10.5 12C10.5 11.1715 11.1716 10.5 12 10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _focusMode!!
    }

private var _focusMode: ImageVector? = null
