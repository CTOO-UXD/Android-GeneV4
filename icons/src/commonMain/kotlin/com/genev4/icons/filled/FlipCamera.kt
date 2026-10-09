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

public val Icons.Filled.FlipCamera: ImageVector
    get() {
        if (_flipCamera != null) {
            return _flipCamera!!
        }
        _flipCamera =
            materialIcon(name = "Filled.FlipCamera") {
            addPath(
                pathData = PathParser().parsePathString("M21.9999 11.9528C22.0123 14.6032 20.983 17.1591 19.0711 19.0711C15.1658 22.9763 8.83418 22.9763 4.92893 19.0711L4.71604 18.8484L4.7152 20.5H2.7152V15.5221C2.7152 14.4328 4.20979 14.1286 4.63562 15.1311C5.03289 16.0665 5.60768 16.9214 6.34315 17.6569C9.46734 20.781 14.5327 20.781 17.6569 17.6569C19.1875 16.1262 20.0099 14.0842 19.9999 11.9622L21.9999 11.9528ZM12 8C14.2091 8 16 9.79086 16 12C16 14.2091 14.2091 16 12 16C9.79086 16 8 14.2091 8 12C8 9.79086 9.79086 8 12 8ZM19.0711 4.92893L19.284 5.15162L19.2848 3.5H21.2848V8.47793C21.2848 9.56719 19.7902 9.87144 19.3644 8.86887C18.9671 7.9335 18.3923 7.07862 17.6569 6.34315C14.5327 3.21895 9.46734 3.21895 6.34315 6.34315C4.81248 7.87381 3.99014 9.91582 4.00009 12.0378L2.00011 12.0472C1.98768 9.39683 3.01701 6.84086 4.92893 4.92893C8.83418 1.02369 15.1658 1.02369 19.0711 4.92893Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _flipCamera!!
    }

private var _flipCamera: ImageVector? = null
