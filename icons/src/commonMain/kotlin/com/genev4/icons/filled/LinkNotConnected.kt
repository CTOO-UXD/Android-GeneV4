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

public val Icons.Filled.LinkNotConnected: ImageVector
    get() {
        if (_linkNotConnected != null) {
            return _linkNotConnected!!
        }
        _linkNotConnected =
            materialIcon(name = "Filled.LinkNotConnected") {
            addPath(
                pathData = PathParser().parsePathString("M6.34304 9.17146L4.22171 11.2928C1.87857 13.6359 1.87857 17.4349 4.22171 19.7781C6.56486 22.1212 10.3639 22.1212 12.707 19.7781L14.8283 17.6567L13.4141 16.2425L11.2928 18.3639C9.73069 19.9259 7.19803 19.9259 5.63593 18.3639C4.07383 16.8018 4.07383 14.2691 5.63593 12.707L7.75725 10.5857L6.34304 9.17146ZM17.6567 14.8283L19.7781 12.707C22.1212 10.3639 22.1212 6.56486 19.7781 4.22171C17.4349 1.87857 13.6359 1.87857 11.2928 4.22171L9.17146 6.34304L10.5857 7.75725L12.707 5.63593C14.2691 4.07383 16.8018 4.07383 18.3639 5.63593C19.9259 7.19803 19.9259 9.73069 18.3639 11.2928L16.2425 13.4141L17.6567 14.8283Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _linkNotConnected!!
    }

private var _linkNotConnected: ImageVector? = null
