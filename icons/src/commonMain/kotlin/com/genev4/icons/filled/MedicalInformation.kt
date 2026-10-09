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

public val Icons.Filled.MedicalInformation: ImageVector
    get() {
        if (_medicalInformation != null) {
            return _medicalInformation!!
        }
        _medicalInformation =
            materialIcon(name = "Filled.MedicalInformation") {
            addPath(
                pathData = PathParser().parsePathString("M11 4H13V9H11V4ZM9 4C9 2.89543 9.89543 2 11 2H13C14.1046 2 15 2.89543 15 4V7H20C21.1046 7 22 7.89543 22 9V20C22 21.1046 21.1046 22 20 22H4C2.89543 22 2 21.1046 2 20V9C2 7.89543 2.89543 7 4 7H9V4ZM7 12V14H5V16H7V18H9V16H11V14H9V12H7ZM19 14.5H13V13H19V14.5ZM13 17.5V16H17V17.5H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _medicalInformation!!
    }

private var _medicalInformation: ImageVector? = null
