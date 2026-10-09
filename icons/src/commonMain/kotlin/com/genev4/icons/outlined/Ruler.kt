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

public val Icons.Outlined.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler =
            materialIcon(name = "Outlined.Ruler") {
            addPath(
                pathData = PathParser().parsePathString("M17.6568 2.10043L21.8994 6.34308C22.6805 7.12412 22.6805 8.39045 21.8994 9.1715L9.1715 21.8994C8.39045 22.6805 7.12412 22.6805 6.34308 21.8994L2.10044 17.6568C1.31939 16.8757 1.31939 15.6094 2.10044 14.8284L14.8284 2.10043C15.6094 1.31939 16.8757 1.31939 17.6568 2.10043ZM20.4852 7.75729L16.2426 3.51465L3.51465 16.2426L7.75729 20.4852L9.13156 19.1109L6.99928 16.9787L8.4135 15.5645L10.5458 17.6967L11.2529 16.9896L10.5348 16.2716L11.949 14.8573L12.6671 15.5754L13.3742 14.8683L11.2419 12.736L12.6561 11.3218L14.7884 13.4541L15.4955 12.747L14.7775 12.0289L16.1917 10.6147L16.9097 11.3328L17.6168 10.6257L15.4846 8.49339L16.8988 7.07917L19.0311 9.21145L20.4852 7.75729Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
