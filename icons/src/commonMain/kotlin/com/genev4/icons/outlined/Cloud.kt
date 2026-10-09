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

public val Icons.Outlined.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud =
            materialIcon(name = "Outlined.Cloud") {
            addPath(
                pathData = PathParser().parsePathString("M11.5 4C13.8987 4 16.0157 5.20654 17.277 7.04586C19.493 7.30975 21.367 8.68882 22.3219 10.6061C22.7559 11.4776 23 12.4603 23 13.5C23 16.9215 20.3564 19.7256 17.0003 19.981L17 20H6C3.23858 20 1 17.7614 1 15C1 12.7447 2.49317 10.8382 4.54484 10.2151C4.93371 6.71852 7.89938 4 11.5 4ZM19.929 10.5857C20.5984 11.3738 21 12.3937 21 13.5L20.995 13.713C20.8893 15.9727 19.1111 17.8146 16.8485 17.9868L16.665 18H6C4.34315 18 3 16.6569 3 15C3 13.6698 3.87396 12.509 5.12606 12.1287L6.38693 11.7458L6.53259 10.4361C6.81207 7.92309 8.94769 6 11.5 6L11.7495 6.00614C12.8892 6.06232 13.9505 6.50179 14.7842 7.22887C12.0269 7.98153 10 10.5041 10 13.5C10 14.0523 10.4477 14.5 11 14.5C11.5523 14.5 12 14.0523 12 13.5C12 11.0147 14.0147 9 16.5 9C17.8736 9 19.1035 9.61548 19.929 10.5857Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _cloud!!
    }

private var _cloud: ImageVector? = null
