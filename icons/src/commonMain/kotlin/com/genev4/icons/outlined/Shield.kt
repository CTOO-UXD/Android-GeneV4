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

public val Icons.Outlined.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield =
            materialIcon(name = "Outlined.Shield") {
            addPath(
                pathData = PathParser().parsePathString("M4.56841 4.87279C3.9233 5.13013 3.45789 5.70373 3.33898 6.38801C3.18766 7.25875 3.02637 8.47036 3.02637 9.67844C3.02637 17.409 8.8954 20.7591 11.1943 21.7709C11.7076 21.9968 12.2923 21.9968 12.8056 21.7709C15.1045 20.7591 20.9735 17.409 20.9735 9.67844C20.9735 8.49098 20.81 7.26878 20.6577 6.38814C20.5392 5.70321 20.0736 5.12892 19.428 4.87138L12.741 2.20387C12.2652 2.01407 11.7347 2.01407 11.2589 2.20387L4.56841 4.87279ZM5.02637 9.67844C5.02637 16.1771 9.91462 19.0225 12 19.9403C14.0853 19.0225 18.9735 16.1771 18.9735 9.67844C18.9735 8.65306 18.8301 7.55681 18.6869 6.72903L12 4.06152L5.30944 6.73044C5.16818 7.54335 5.02637 8.63016 5.02637 9.67844Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _shield!!
    }

private var _shield: ImageVector? = null
