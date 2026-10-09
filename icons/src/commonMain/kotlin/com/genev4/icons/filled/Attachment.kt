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

public val Icons.Filled.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment =
            materialIcon(name = "Filled.Attachment") {
            addPath(
                pathData = PathParser().parsePathString("M9.67943 18.364C8.50785 19.5355 6.60836 19.5355 5.43679 18.364C4.26521 17.1924 4.26521 15.2929 5.43679 14.1213L13.215 6.34315L14.6292 7.75737L6.851 15.5355C6.46047 15.9261 6.46047 16.5592 6.851 16.9498C7.24152 17.3403 7.87469 17.3403 8.26521 16.9498L17.8112 7.40381C18.7875 6.4275 18.7875 4.84459 17.8112 3.86828C16.8348 2.89197 15.2519 2.89197 14.2756 3.86828L4.72968 13.4142C3.16758 14.9763 3.16758 17.509 4.72968 19.0711C6.29178 20.6332 8.82444 20.6332 10.3865 19.0711L17.4576 12L18.8718 13.4142L11.8007 20.4853C9.4576 22.8284 5.65861 22.8284 3.31546 20.4853C0.972319 18.1421 0.972319 14.3432 3.31546 12L12.8614 2.45407C14.6188 0.696707 17.468 0.696707 19.2254 2.45407C20.9827 4.21143 20.9827 7.06067 19.2254 8.81803L9.67943 18.364Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _attachment!!
    }

private var _attachment: ImageVector? = null
