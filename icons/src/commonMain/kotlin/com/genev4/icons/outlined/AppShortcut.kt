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

public val Icons.Outlined.AppShortcut: ImageVector
    get() {
        if (_appShortcut != null) {
            return _appShortcut!!
        }
        _appShortcut =
            materialIcon(name = "Outlined.AppShortcut") {
            addPath(
                pathData = PathParser().parsePathString("M7 3.99963H17V6.99963H19V3.99963C19 2.89506 18.1046 1.99963 17 1.99963H7C5.89543 1.99963 5 2.89506 5 3.99963V19.9996C5 21.1042 5.89543 21.9996 7 21.9996H17C18.1046 21.9996 19 21.1042 19 19.9996V16.9996H17V19.9996H7L7 3.99963Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.2905 11.2952L17.0014 7.99384L15.5845 9.40541L17.1742 11.001H12C10.8954 11.001 10 11.8964 10 13.001V16.001H12V13.001H17.1712L15.5852 14.5901L17.0008 16.0029L20.2898 12.7074C20.6792 12.3173 20.6795 11.6856 20.2905 11.2952Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _appShortcut!!
    }

private var _appShortcut: ImageVector? = null
