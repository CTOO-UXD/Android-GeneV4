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

public val Icons.Outlined.LiveMessage: ImageVector
    get() {
        if (_liveMessage != null) {
            return _liveMessage!!
        }
        _liveMessage =
            materialIcon(name = "Outlined.LiveMessage") {
            addPath(
                pathData = PathParser().parsePathString("M2 7.0893C2 4.59285 4.87124 3.18857 6.84182 4.72124L10.1582 7.30063C11.2415 8.14322 12.7585 8.14322 13.8418 7.30063L17.1582 4.72124C19.1288 3.18857 22 4.59285 22 7.0893V20H20V7.0893C20 6.25715 19.0429 5.78905 18.3861 6.29994L15.0697 8.87933C13.2641 10.2837 10.7358 10.2837 8.9303 8.87933L5.61394 6.29994C4.95708 5.78905 4 6.25715 4 7.0893V17.2299C4 18.0778 4.98886 18.5409 5.64018 17.9982L11.3598 13.2318L12.6402 14.7682L6.92055 19.5346C4.96657 21.1629 2 19.7734 2 17.2299V7.0893Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _liveMessage!!
    }

private var _liveMessage: ImageVector? = null
