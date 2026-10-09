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

public val Icons.Filled.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house =
            materialIcon(name = "Filled.House") {
            addPath(
                pathData = PathParser().parsePathString("M20 7.2495L22.601 9.20005L21.4011 10.8001L19.9989 9.748L19.9992 12.5298C19.9995 14.6866 19.9997 16.8433 19.9999 19.0001C19.9999 20.1046 19.1045 21.0001 17.9999 21.0001H5.9999C4.89533 21.0001 3.99991 20.1047 3.99985 19.0001C3.99974 16.822 3.99948 14.644 3.99922 12.466L3.9989 9.751L2.5999 10.8001L1.3999 9.20008L9.60001 3.05C11.0222 1.98338 12.9776 1.98333 14.3998 3.04986L17 4.99976V2.99951H20V7.2495ZM10 14.0001C10 12.8956 10.8954 12.0001 12 12.0001C13.1046 12.0001 14 12.8956 14 14.0001V19.0001L10 19.0001V14.0001ZM12 6.99951C10.8954 6.99951 10 7.89494 10 8.99951H14C14 7.89494 13.1046 6.99951 12 6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _house!!
    }

private var _house: ImageVector? = null
