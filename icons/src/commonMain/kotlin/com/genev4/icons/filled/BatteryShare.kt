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

public val Icons.Filled.BatteryShare: ImageVector
    get() {
        if (_batteryShare != null) {
            return _batteryShare!!
        }
        _batteryShare =
            materialIcon(name = "Filled.BatteryShare") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99902C9.94772 1.99902 9.5 2.44674 9.5 2.99902V3.49902H14.5V2.99902C14.5 2.44674 14.0523 1.99902 13.5 1.99902H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 3.99902C6.89543 3.99902 6 4.89445 6 5.99902V19.999C6 21.1036 6.89543 21.999 8 21.999H16C17.1046 21.999 18 21.1036 18 19.999V17.8394L17.4167 18.4227C16.6357 19.2038 15.3694 19.2038 14.5883 18.4227L13.8718 17.7062C13.5864 18.4623 12.856 19.0001 12 19.0001H10C9.46957 19.0001 8.96086 18.7894 8.58579 18.4143C8.21071 18.0393 8 17.5306 8 17.0001V14.0006C8 11.7915 9.79086 10.0006 12 10.0006H12.1705L14.5858 7.5853C14.8829 7.28814 15.2504 7.10403 15.6346 7.03299C16.2624 6.91431 16.9361 7.09793 17.422 7.58383L18 8.16178V5.99902C18 4.89445 17.1046 3.99902 16 3.99902H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14.5936 10.4123L16.182 12.0006H12C10.8954 12.0006 10 12.896 10 14.0006V17.0001H12V14.0006H16.182L14.5883 15.5943L16.0025 17.0085L19.3033 13.7077C19.6938 13.3172 19.6938 12.684 19.3033 12.2935L16.0078 8.99805L14.5936 10.4123Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryShare!!
    }

private var _batteryShare: ImageVector? = null
