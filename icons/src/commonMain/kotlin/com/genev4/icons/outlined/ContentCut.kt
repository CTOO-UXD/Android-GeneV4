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

public val Icons.Outlined.ContentCut: ImageVector
    get() {
        if (_contentCut != null) {
            return _contentCut!!
        }
        _contentCut =
            materialIcon(name = "Outlined.ContentCut") {
            addPath(
                pathData = PathParser().parsePathString("M15.182 10.9388L21.7071 4.41372C21.9024 4.21845 21.9024 3.90187 21.7071 3.70661C20.7308 2.7303 19.1479 2.7303 18.1716 3.70661L13.0607 8.81752L15.182 10.9388Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 13.9995C6.55427 13.9995 7.08221 14.1122 7.56214 14.316L9.87867 11.9995L7.56215 9.68298C7.08222 9.88678 6.55427 9.99951 6 9.99951C3.79086 9.99951 2 8.20865 2 5.99951C2 3.79037 3.79086 1.99951 6 1.99951C8.20914 1.99951 10 3.79037 10 5.99951C10 6.55379 9.88726 7.08173 9.68347 7.56166L21.7071 19.5853C21.9024 19.7806 21.9024 20.0971 21.7071 20.2924C20.7308 21.2687 19.1479 21.2687 18.1716 20.2924L12 14.1208L9.68346 16.4374C9.88726 16.9173 10 17.4452 10 17.9995C10 20.2087 8.20914 21.9995 6 21.9995C3.79086 21.9995 2 20.2087 2 17.9995C2 15.7904 3.79086 13.9995 6 13.9995ZM6 19.9995C7.10457 19.9995 8 19.1041 8 17.9995C8 16.8949 7.10457 15.9995 6 15.9995C4.89543 15.9995 4 16.8949 4 17.9995C4 19.1041 4.89543 19.9995 6 19.9995ZM8 5.99951C8 7.10408 7.10457 7.99951 6 7.99951C4.89543 7.99951 4 7.10408 4 5.99951C4 4.89494 4.89543 3.99951 6 3.99951C7.10457 3.99951 8 4.89494 8 5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _contentCut!!
    }

private var _contentCut: ImageVector? = null
