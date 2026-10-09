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

public val Icons.Filled.Merge: ImageVector
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge =
            materialIcon(name = "Filled.Merge") {
            addPath(
                pathData = PathParser().parsePathString("M12.7075 3.70305C12.52 3.51551 12.2656 3.41016 12.0004 3.41016C11.7352 3.41016 11.4808 3.51551 11.2933 3.70305L7.75774 7.23858L9.17196 8.6528L11.0001 6.8247V10.686C11.0001 12.5424 10.2626 14.3228 8.94999 15.6355L4.99292 19.5929L6.40719 21.0071L10.3643 17.0497C11.0282 16.3857 11.5777 15.6286 12.0001 14.8091C12.4224 15.6286 12.9719 16.3858 13.6359 17.0498L17.5929 21.0071L19.0071 19.5929L15.0502 15.6357C13.7375 14.3229 13.0001 12.5424 13.0001 10.6858L13.0003 6.82427L14.8288 8.6528L16.243 7.23858L12.7075 3.70305Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _merge!!
    }

private var _merge: ImageVector? = null
