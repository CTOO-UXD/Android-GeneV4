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

public val Icons.Outlined.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit =
            materialIcon(name = "Outlined.Edit") {
            addPath(
                pathData = PathParser().parsePathString("M20.4825 8.47487L8.81519 20.1422L3.75551 21.4737C3.0149 21.6686 2.33905 20.9927 2.53395 20.2521L3.86544 15.1924L15.5327 3.52512C16.8996 2.15829 19.1157 2.15829 20.4825 3.52512C21.8493 4.89196 21.8493 7.10803 20.4825 8.47487ZM16.5934 9.53553L7.7833 18.3456L4.90437 19.1032L5.66198 16.2243L14.4721 7.41421L16.5934 9.53553ZM18.0076 8.12131L19.0683 7.06065C19.6541 6.47487 19.6541 5.52512 19.0683 4.93933C18.4825 4.35355 17.5327 4.35355 16.947 4.93933L15.8863 6L18.0076 8.12131Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _edit!!
    }

private var _edit: ImageVector? = null
