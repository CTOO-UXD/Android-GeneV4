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

public val Icons.Outlined.BluetoothDisabled: ImageVector
    get() {
        if (_bluetoothDisabled != null) {
            return _bluetoothDisabled!!
        }
        _bluetoothDisabled =
            materialIcon(name = "Outlined.BluetoothDisabled") {
            addPath(
                pathData = PathParser().parsePathString("M2.80752 2.80761L11.5963 11.597L16.9999 16.999L21.1923 21.1924L19.7781 22.6066L15.5853 18.414L11.9999 22H10.9999V14.4L6.39991 19L4.99991 17.6L9.88531 12.714L1.39331 4.22183L2.80752 2.80761ZM12.9993 15.828L12.9999 18.15L14.1753 17.004L12.9993 15.828ZM11.9999 2L17.6999 7.7L14.1139 11.286L10.9999 8.172V2H11.9999ZM12.9999 5.85V9.6L14.8999 7.7L12.9999 5.85Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
