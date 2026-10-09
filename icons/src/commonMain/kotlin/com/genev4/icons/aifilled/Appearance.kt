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

public val Icons.AiFilled.Appearance: ImageVector
    get() {
        if (_appearance != null) {
            return _appearance!!
        }
        _appearance =
            materialIcon(name = "AiFilled.Appearance") {
            addPath(
                pathData = PathParser().parsePathString("M22 22.5H2V20.5H22V22.5ZM18.9121 9.82324L9.71973 19.0156L2.64844 11.9443L10.4268 4.16602L9.71973 3.45898L11.1338 2.04492L18.9121 9.82324ZM18.5 13.5C19.8333 14.7636 20.5 15.7636 20.5 16.5C20.5 17.6046 19.6045 18.5 18.5 18.5C17.3954 18.5 16.5 17.6046 16.5 16.5C16.5 15.7636 17.1666 14.7636 18.5 13.5ZM7.83301 9.58594L14.2188 11.6855L16.083 9.82227L11.8398 5.58008L7.83301 9.58594Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _appearance!!
    }

private var _appearance: ImageVector? = null
