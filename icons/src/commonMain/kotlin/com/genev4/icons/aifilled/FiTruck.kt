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

public val Icons.AiFilled.FiTruck: ImageVector
    get() {
        if (_fiTruck != null) {
            return _fiTruck!!
        }
        _fiTruck =
            materialIcon(name = "AiFilled.FiTruck") {
            addPath(
                pathData = PathParser().parsePathString("M17 8H20L23 11V16H17V8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 3H1V16H14V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8.96387 18C8.98723 18.1633 9 18.3302 9 18.5C9 20.433 7.433 22 5.5 22C3.567 22 2 20.433 2 18.5C2 18.3302 2.01277 18.1633 2.03613 18H8.96387ZM21.9639 18C21.9872 18.1633 22 18.3302 22 18.5C22 20.433 20.433 22 18.5 22C16.567 22 15 20.433 15 18.5C15 18.3302 15.0128 18.1633 15.0361 18H21.9639Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _fiTruck!!
    }

private var _fiTruck: ImageVector? = null
