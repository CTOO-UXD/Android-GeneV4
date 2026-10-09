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

public val Icons.Filled.Display: ImageVector
    get() {
        if (_display != null) {
            return _display!!
        }
        _display =
            materialIcon(name = "Filled.Display") {
            addPath(
                pathData = PathParser().parsePathString("M13.4141 2.10056L15.3136 3.99977L17.9999 4.00005C19.1045 4.00005 19.9999 4.89548 19.9999 6.00005L19.9996 8.68677L21.8994 10.5858C22.6805 11.3669 22.6805 12.6332 21.8994 13.4143L19.9996 15.3128L19.9999 18.0001C19.9999 19.1046 19.1045 20.0001 17.9999 20.0001L15.3126 19.9998L13.4141 21.8995C12.6331 22.6806 11.3668 22.6806 10.5857 21.8995L8.68665 19.9998L5.99993 20.0001C4.89536 20.0001 3.99993 19.1046 3.99993 18.0001L3.99965 15.3138L2.10043 13.4143C1.31939 12.6332 1.31939 11.3669 2.10043 10.5858L3.99965 8.68577L3.99993 6.00005C3.99993 4.89548 4.89536 4.00005 5.99993 4.00005L8.68565 3.99977L10.5857 2.10056C11.3668 1.31951 12.6331 1.31951 13.4141 2.10056ZM16.9999 12.0001C16.9999 9.23863 14.7614 7.00005 11.9999 7.00005V17.0001C14.7614 17.0001 16.9999 14.7615 16.9999 12.0001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _display!!
    }

private var _display: ImageVector? = null
