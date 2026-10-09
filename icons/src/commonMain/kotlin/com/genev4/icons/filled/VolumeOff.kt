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

public val Icons.Filled.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff =
            materialIcon(name = "Filled.VolumeOff") {
            addPath(
                pathData = PathParser().parsePathString("M13 15.8285L19.7781 22.6066L21.1923 21.1924L2.80752 2.80762L1.39331 4.22183L4.6713 7.49982L3.99995 7.50006C2.89538 7.50006 1.99995 8.39549 1.99995 9.50006V14.5001C1.99995 15.6046 2.89538 16.5001 3.99995 16.5001L6.23295 16.4993L11.4057 20.3221C11.5777 20.4492 11.786 20.5178 12 20.5178C12.5522 20.5178 13 20.0701 13 19.5178V15.8285ZM19.3347 4.80299C22.469 8.43475 22.8372 13.6228 20.4482 17.62L18.9791 16.1509C20.6532 12.9484 20.2692 8.94685 17.8206 6.10971L19.3347 4.80299ZM15.8604 13.0321L17.4096 14.5813C18.4822 12.3489 18.0932 9.59022 16.2426 7.73961L14.8284 9.15382C15.879 10.2044 16.223 11.694 15.8604 13.0321ZM8.58789 5.75961L13 10.1717V4.48232C13 4.26839 12.9314 4.06011 12.8042 3.88805C12.476 3.44387 11.8499 3.34984 11.4057 3.67805L8.58789 5.75961Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
