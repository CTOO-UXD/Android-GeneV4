/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Malfunction: ImageVector
    get() {
        if (_malfunction != null) {
            return _malfunction!!
        }
        _malfunction =
            materialIcon(name = "AiFilled.Malfunction") {
            addPath(
                pathData = PathParser().parsePathString("M21.1723 18.3945C21.5817 19.6841 20.619 21 19.266 21H4.73281C3.38006 20.9997 2.41728 19.684 2.82656 18.3945L3.58633 16H20.4125L21.1723 18.3945ZM17.9994 3C19.104 3.00003 19.9994 3.89545 19.9994 5V14H3.99942V5C3.99942 3.89565 4.89514 3.00035 5.99942 3H17.9994ZM11.0004 10V12H13.0004V10H11.0004ZM11.0004 5V9H13.0004V5H11.0004Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _malfunction!!
    }

private var _malfunction: ImageVector? = null
