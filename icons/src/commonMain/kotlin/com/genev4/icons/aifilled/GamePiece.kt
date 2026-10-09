/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.GamePiece: ImageVector
    get() {
        if (_gamePiece != null) {
            return _gamePiece!!
        }
        _gamePiece =
            materialIcon(name = "AiFilled.GamePiece") {
            addPath(
                pathData = PathParser().parsePathString("M3 22V2.58333C3.6375 2.43519 4.275 2.30093 4.9125 2.18056C5.55 2.06019 6.20625 2 6.88125 2C7.8 2 8.71875 2.13426 9.6375 2.40278C10.5563 2.6713 11.4469 3.05556 12.3094 3.55556C13.1906 4.07407 14.1047 4.46759 15.0516 4.73611C15.9984 5.00463 16.9688 5.13889 17.9625 5.13889C18.4688 5.13889 18.975 5.11111 19.4813 5.05556C19.9875 5 20.4937 4.9537 21 4.91667V18.4444C20.4937 18.4815 19.9828 18.5278 19.4672 18.5833C18.9516 18.6389 18.45 18.6667 17.9625 18.6667C16.9688 18.6667 16.0031 18.537 15.0656 18.2778C14.1281 18.0185 13.2375 17.6389 12.3938 17.1389C11.55 16.6389 10.6641 16.2593 9.73594 16C8.80781 15.7407 7.86563 15.6111 6.90938 15.6111C6.64688 15.6111 6.38438 15.625 6.12188 15.6528C5.85938 15.6806 5.56875 15.713 5.25 15.75V22H3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _gamePiece!!
    }

private var _gamePiece: ImageVector? = null
