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

public val Icons.Filled.VideocamOff: ImageVector
    get() {
        if (_videocamOff != null) {
            return _videocamOff!!
        }
        _videocamOff =
            materialIcon(name = "Filled.VideocamOff") {
            addPath(
                pathData = PathParser().parsePathString("M16.5848 19.4132L19.7781 22.6066L21.1923 21.1924L2.80757 2.80762L1.39336 4.22183L1.96182 4.79029C1.38514 5.14121 1 5.77566 1 6.50008V17.5001C1 18.6046 1.89543 19.5001 3 19.5001H16C16.2034 19.5001 16.3998 19.4697 16.5848 19.4132ZM7.6716 10.5001L5.6716 8.50008H5V10.5001H7.6716ZM21.5211 17.1934L18.221 15.3927L7.3284 4.50008H16C17.1046 4.50008 18 5.39551 18 6.50008V8.72608L21.5211 6.80672C22.006 6.54226 22.6134 6.72092 22.8779 7.20577C22.958 7.35265 23 7.5173 23 7.68462V16.3155C23 16.8678 22.5523 17.3155 22 17.3155C21.8327 17.3155 21.668 17.2736 21.5211 17.1934Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _videocamOff!!
    }

private var _videocamOff: ImageVector? = null
