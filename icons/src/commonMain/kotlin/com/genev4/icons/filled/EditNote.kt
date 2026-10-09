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

public val Icons.Filled.EditNote: ImageVector
    get() {
        if (_editNote != null) {
            return _editNote!!
        }
        _editNote =
            materialIcon(name = "Filled.EditNote") {
            addPath(
                pathData = PathParser().parsePathString("M17.0002 3C19.2094 3 21.0002 4.79086 21.0002 7V8.93435C20.2404 9.02019 19.5033 9.35449 18.9205 9.93724L17.0002 11.8575V11H7.00024V13H15.8577L13.8577 15H7.00024V17H11.8577L10.4985 18.3592L9.4422 21H7.00024C4.79111 21 3.00024 19.2091 3.00024 17V7C3.00024 4.79086 4.79111 3 7.00024 3H17.0002ZM17.0002 7H7.00024V9H17.0002V7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.3354 15.5934L14.3243 21.6045L11.3304 22.8021C11.2022 22.8533 11.0567 22.791 11.0054 22.6628C10.9816 22.6032 10.9816 22.5367 11.0054 22.4771L12.203 19.4832L18.2141 13.4721L20.3354 15.5934Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M22.456 11.3514C23.0418 11.9372 23.0418 12.887 22.456 13.4728L21.3961 14.5327L19.2748 12.4114L20.3347 11.3514C20.9205 10.7657 21.8703 10.7657 22.456 11.3514Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _editNote!!
    }

private var _editNote: ImageVector? = null
