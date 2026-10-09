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

public val Icons.Outlined.AlarmOn: ImageVector
    get() {
        if (_alarmOn != null) {
            return _alarmOn!!
        }
        _alarmOn =
            materialIcon(name = "Outlined.AlarmOn") {
            addPath(
                pathData = PathParser().parsePathString("M1.74707 5.92889L5.98971 1.68625L7.40392 3.10046L3.16128 7.3431L1.74707 5.92889Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.5964 3.10049L20.839 7.34313L22.2533 5.92892L18.0106 1.68628L16.5964 3.10049Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.182 10.0251L10.9393 14.2678L8.81802 12.1464L7.40381 13.5607L10.2322 16.3891C10.6228 16.7796 11.2559 16.7796 11.6465 16.3891L16.5962 11.4393L15.182 10.0251Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M21.0001 12.9996C21.0001 17.9702 16.9707 21.9996 12.0001 21.9996C7.02955 21.9996 3.00012 17.9702 3.00012 12.9996C3.00012 8.02907 7.02955 3.99963 12.0001 3.99963C16.9707 3.99963 21.0001 8.02907 21.0001 12.9996ZM19.0001 12.9996C19.0001 16.8656 15.8661 19.9996 12.0001 19.9996C8.13412 19.9996 5.00012 16.8656 5.00012 12.9996C5.00012 9.13364 8.13412 5.99963 12.0001 5.99963C15.8661 5.99963 19.0001 9.13364 19.0001 12.9996Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _alarmOn!!
    }

private var _alarmOn: ImageVector? = null
