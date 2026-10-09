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

public val Icons.Filled.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb =
            materialIcon(name = "Filled.Lightbulb") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C16.1421 2 19.5 5.35786 19.5 9.5C19.5 11.9535 18.3219 14.1319 16.5005 15.5002L16.5 17C16.5 18.1046 15.6046 19 14.5 19H9.5C8.39543 19 7.5 18.1046 7.5 17L7.50051 15.5009C5.67855 14.1326 4.5 11.954 4.5 9.5C4.5 5.35786 7.85786 2 12 2ZM15.5 22V20H8.5V22H15.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
