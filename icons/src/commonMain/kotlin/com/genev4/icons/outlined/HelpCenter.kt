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

public val Icons.Outlined.HelpCenter: ImageVector
    get() {
        if (_helpCenter != null) {
            return _helpCenter!!
        }
        _helpCenter =
            materialIcon(name = "Outlined.HelpCenter") {
            addPath(
                pathData = PathParser().parsePathString("M15.4866 10C15.4866 8.067 13.9196 6.5 11.9866 6.5C10.3565 6.5 8.95332 7.623 8.5813 9.18874L10.5271 9.65107C10.6862 8.98177 11.2881 8.5 11.9866 8.5C12.815 8.5 13.4866 9.17157 13.4866 10C13.4866 10.7146 12.9826 11.3264 12.2927 11.4689L12.1647 11.4974L11.8699 11.5067C11.3726 11.5645 10.9866 11.9872 10.9866 12.5V14.5387H12.9866L12.9862 13.353L13.0618 13.3316C14.4855 12.8732 15.4866 11.5395 15.4866 10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.9866 17.5387V15.5387H10.9866V17.5387H12.9866Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3 6.99951C3 4.79037 4.79086 2.99951 7 2.99951H17C19.2091 2.99951 21 4.79037 21 6.99951V16.9995C21 19.2087 19.2091 20.9995 17 20.9995H7C4.79086 20.9995 3 19.2087 3 16.9995V6.99951ZM7 4.99951H17C18.1046 4.99951 19 5.89494 19 6.99951V16.9995C19 18.1041 18.1046 18.9995 17 18.9995H7C5.89543 18.9995 5 18.1041 5 16.9995V6.99951C5 5.89494 5.89543 4.99951 7 4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _helpCenter!!
    }

private var _helpCenter: ImageVector? = null
