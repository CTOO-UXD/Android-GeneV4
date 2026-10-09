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

public val Icons.Filled.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star =
            materialIcon(name = "Filled.Star") {
            addPath(
                pathData = PathParser().parsePathString("M12.8855 1.72553C13.2799 1.92019 13.5991 2.23944 13.7938 2.63387L15.9679 7.03903L20.8293 7.74543C21.9224 7.90427 22.6797 8.91915 22.5209 10.0122C22.4576 10.4475 22.2527 10.8498 21.9377 11.1568L18.42 14.5858L19.2504 19.4275C19.4371 20.5162 18.7059 21.5501 17.6173 21.7368C17.1837 21.8112 16.7378 21.7405 16.3485 21.5359L12.0003 19.2499L7.65217 21.5359C6.67448 22.0499 5.46523 21.674 4.95122 20.6963C4.74655 20.307 4.67592 19.861 4.75027 19.4275L5.58069 14.5858L2.06296 11.1568C1.27199 10.3858 1.25581 9.11959 2.02681 8.32862C2.33383 8.01366 2.73611 7.80868 3.17139 7.74543L8.03278 7.03903L10.2069 2.63387C10.6957 1.64336 11.8949 1.23668 12.8855 1.72553Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _star!!
    }

private var _star: ImageVector? = null
