/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aioutlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiOutlined.UploadPictures: ImageVector
    get() {
        if (_uploadPictures != null) {
            return _uploadPictures!!
        }
        _uploadPictures =
            materialIcon(name = "AiOutlined.UploadPictures") {
            addPath(
                pathData = PathParser().parsePathString("M24 19H21V23H19V19H16L20 15L24 19ZM21.0078 3C21.5555 3 21.9999 3.44482 22 3.99316V13H20V5H4V18.999L14 9L17 12V14.8291L14 11.8281L6.82715 19H14V21H2.99219C2.44451 21 2.00013 20.5552 2 20.0068V3.99316C2.00013 3.44463 2.45577 3 2.99219 3H21.0078ZM8 7C9.10457 7 10 7.89543 10 9C10 10.1046 9.10457 11 8 11C6.89543 11 6 10.1046 6 9C6 7.89543 6.89543 7 8 7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _uploadPictures!!
    }

private var _uploadPictures: ImageVector? = null
