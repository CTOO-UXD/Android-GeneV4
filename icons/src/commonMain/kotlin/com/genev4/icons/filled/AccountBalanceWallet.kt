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

public val Icons.Filled.AccountBalanceWallet: ImageVector
    get() {
        if (_accountBalanceWallet != null) {
            return _accountBalanceWallet!!
        }
        _accountBalanceWallet =
            materialIcon(name = "Filled.AccountBalanceWallet") {
            addPath(
                pathData = PathParser().parsePathString("M21 7C21 4.79086 19.2091 3 17 3H7C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21H17C19.2091 21 21 19.2091 21 17V16H14C11.7909 16 10 14.2091 10 12C10 9.79086 11.7909 8 14 8H21V7ZM21 10H14C12.9456 10 12.0818 10.8159 12.0055 11.8507L12 12C12 13.1046 12.8954 14 14 14H21V10ZM14 11H16V13H14V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _accountBalanceWallet!!
    }

private var _accountBalanceWallet: ImageVector? = null
