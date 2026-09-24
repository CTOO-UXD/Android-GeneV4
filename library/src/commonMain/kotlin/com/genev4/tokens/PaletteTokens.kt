/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Gene4.0 Color Guidance Palettes (Figma) + Compose surface extras (Neutral 4/6/12/…).
package com.genev4.tokens

import androidx.compose.ui.graphics.Color

internal object PaletteTokens {
    val Primary0 = Color(red = 0, green = 0, blue = 0) // #000000
    val Primary5 = Color(red = 22, green = 0, blue = 65) // #160041
    val Primary10 = Color(red = 35, green = 0, blue = 92) // #23005C
    val Primary15 = Color(red = 47, green = 0, blue = 118) // #2F0076
    val Primary20 = Color(red = 59, green = 0, blue = 145) // #3B0091
    val Primary25 = Color(red = 71, green = 19, blue = 161) // #4713A1
    val Primary30 = Color(red = 83, green = 38, blue = 173) // #5326AD
    val Primary35 = Color(red = 95, green = 53, blue = 185) // #5F35B9
    val Primary40 = Color(red = 108, green = 67, blue = 198) // #6C43C6
    val Primary50 = Color(red = 133, green = 94, blue = 225) // #855EE1
    val Primary60 = Color(red = 159, green = 121, blue = 253) // #9F79FD
    val Primary70 = Color(red = 184, green = 155, blue = 255) // #B89BFF
    val Primary80 = Color(red = 208, green = 188, blue = 255) // #D0BCFF
    val Primary90 = Color(red = 233, green = 221, blue = 255) // #E9DDFF
    val Primary95 = Color(red = 246, green = 237, blue = 255) // #F6EDFF
    val Primary98 = Color(red = 254, green = 247, blue = 255) // #FEF7FF
    val Primary99 = Color(red = 255, green = 251, blue = 255) // #FFFBFF
    val Primary100 = Color(red = 255, green = 255, blue = 255) // #FFFFFF

    val Secondary0 = Color(red = 0, green = 0, blue = 0) // #000000
    val Secondary5 = Color(red = 0, green = 15, blue = 49) // #000F31
    val Secondary10 = Color(red = 0, green = 25, blue = 71) // #001947
    val Secondary15 = Color(red = 0, green = 34, blue = 92) // #00225C
    val Secondary20 = Color(red = 0, green = 44, blue = 113) // #002C71
    val Secondary25 = Color(red = 0, green = 54, blue = 136) // #003688
    val Secondary30 = Color(red = 0, green = 65, blue = 159) // #00419F
    val Secondary35 = Color(red = 0, green = 75, blue = 183) // #004BB7
    val Secondary40 = Color(red = 1, green = 86, blue = 207) // #0156CF
    val Secondary50 = Color(red = 53, green = 113, blue = 234) // #3571EA
    val Secondary60 = Color(red = 90, green = 140, blue = 255) // #5A8CFF
    val Secondary70 = Color(red = 135, green = 169, blue = 255) // #87A9FF
    val Secondary80 = Color(red = 177, green = 197, blue = 255) // #B1C5FF
    val Secondary90 = Color(red = 218, green = 226, blue = 255) // #DAE2FF
    val Secondary95 = Color(red = 238, green = 240, blue = 255) // #EEF0FF
    val Secondary98 = Color(red = 250, green = 248, blue = 255) // #FAF8FF
    val Secondary99 = Color(red = 254, green = 251, blue = 255) // #FEFBFF
    val Secondary100 = Color(red = 255, green = 255, blue = 255) // #FFFFFF

    val Tertiary0 = Color(red = 0, green = 0, blue = 0) // #000000
    val Tertiary5 = Color(red = 44, green = 0, blue = 4) // #2C0004
    val Tertiary10 = Color(red = 65, green = 0, blue = 8) // #410008
    val Tertiary15 = Color(red = 84, green = 0, blue = 13) // #54000D
    val Tertiary20 = Color(red = 104, green = 0, blue = 18) // #680012
    val Tertiary25 = Color(red = 125, green = 0, blue = 24) // #7D0018
    val Tertiary30 = Color(red = 146, green = 0, blue = 30) // #92001E
    val Tertiary35 = Color(red = 164, green = 19, blue = 40) // #A41328
    val Tertiary40 = Color(red = 181, green = 35, blue = 50) // #B52332
    val Tertiary50 = Color(red = 216, green = 61, blue = 72) // #D83D48
    val Tertiary60 = Color(red = 251, green = 87, blue = 95) // #FB575F
    val Tertiary70 = Color(red = 255, green = 136, blue = 137) // #FF8889
    val Tertiary80 = Color(red = 255, green = 179, blue = 177) // #FFB3B1
    val Tertiary90 = Color(red = 255, green = 218, blue = 216) // #FFDAD8
    val Tertiary95 = Color(red = 255, green = 237, blue = 235) // #FFEDEB
    val Tertiary98 = Color(red = 255, green = 248, blue = 247) // #FFF8F7
    val Tertiary99 = Color(red = 255, green = 251, blue = 255) // #FFFBFF
    val Tertiary100 = Color(red = 255, green = 255, blue = 255) // #FFFFFF

    val Error0 = Color(red = 0, green = 0, blue = 0) // #000000
    val Error5 = Color(red = 45, green = 0, blue = 1) // #2D0001
    val Error10 = Color(red = 65, green = 0, blue = 2) // #410002
    val Error15 = Color(red = 84, green = 0, blue = 3) // #540003
    val Error20 = Color(red = 105, green = 0, blue = 5) // #690005
    val Error25 = Color(red = 126, green = 0, blue = 7) // #7E0007
    val Error30 = Color(red = 147, green = 0, blue = 10) // #93000A
    val Error35 = Color(red = 168, green = 7, blue = 16) // #A80710
    val Error40 = Color(red = 186, green = 26, blue = 26) // #BA1A1A
    val Error50 = Color(red = 222, green = 55, blue = 48) // #DE3730
    val Error60 = Color(red = 255, green = 84, blue = 73) // #FF5449
    val Error70 = Color(red = 255, green = 137, blue = 125) // #FF897D
    val Error80 = Color(red = 255, green = 180, blue = 171) // #FFB4AB
    val Error90 = Color(red = 255, green = 218, blue = 214) // #FFDAD6
    val Error95 = Color(red = 255, green = 237, blue = 234) // #FFEDEA
    val Error98 = Color(red = 255, green = 248, blue = 247) // #FFF8F7
    val Error99 = Color(red = 255, green = 251, blue = 255) // #FFFBFF
    val Error100 = Color(red = 255, green = 255, blue = 255) // #FFFFFF

    val Neutral0 = Color(red = 0, green = 0, blue = 0) // #000000
    val Neutral4 = Color(red = 15, green = 14, blue = 14) // #0F0E0E
    val Neutral5 = Color(red = 17, green = 17, blue = 17) // #111111
    val Neutral6 = Color(red = 20, green = 19, blue = 19) // #141313
    val Neutral10 = Color(red = 28, green = 27, blue = 27) // #1C1B1B
    val Neutral12 = Color(red = 32, green = 31, blue = 31) // #201F1F
    val Neutral15 = Color(red = 38, green = 38, blue = 37) // #262625
    val Neutral17 = Color(red = 43, green = 42, blue = 42) // #2B2A2A
    val Neutral20 = Color(red = 49, green = 48, blue = 48) // #313030
    val Neutral22 = Color(red = 54, green = 52, blue = 52) // #363434
    val Neutral24 = Color(red = 58, green = 57, blue = 57) // #3A3939
    val Neutral25 = Color(red = 60, green = 59, blue = 59) // #3C3B3B
    val Neutral30 = Color(red = 72, green = 70, blue = 70) // #484646
    val Neutral35 = Color(red = 83, green = 82, blue = 82) // #535252
    val Neutral40 = Color(red = 95, green = 94, blue = 94) // #5F5E5E
    val Neutral50 = Color(red = 120, green = 119, blue = 118) // #787776
    val Neutral60 = Color(red = 146, green = 144, blue = 144) // #929090
    val Neutral70 = Color(red = 173, green = 170, blue = 170) // #ADAAAA
    val Neutral80 = Color(red = 202, green = 198, blue = 194) // #CAC6C2
    val Neutral87 = Color(red = 231, green = 226, blue = 221) // #E7E2DD (= Neutral90 / Surface Dim)
    val Neutral90 = Color(red = 231, green = 226, blue = 221) // #E7E2DD
    val Neutral92 = Color(red = 231, green = 226, blue = 221) // #E7E2DD (= Surface Container High)
    val Neutral94 = Color(red = 243, green = 240, blue = 238) // #F3F0EE (= Neutral95 / Surface Container)
    val Neutral95 = Color(red = 243, green = 240, blue = 238) // #F3F0EE
    val Neutral96 = Color(red = 251, green = 249, blue = 247) // #FBF9F7 (= Neutral98 / Surface Container Low)
    val Neutral98 = Color(red = 251, green = 249, blue = 247) // #FBF9F7
    val Neutral99 = Color(red = 254, green = 252, blue = 250) // #FEFCFA
    val Neutral100 = Color(red = 255, green = 255, blue = 255) // #FFFFFF

    val NeutralVariant0 = Color(red = 0, green = 0, blue = 0) // #000000
    val NeutralVariant5 = Color(red = 18, green = 16, blue = 23) // #121017
    val NeutralVariant10 = Color(red = 29, green = 26, blue = 34) // #1D1A22
    val NeutralVariant15 = Color(red = 39, green = 36, blue = 45) // #27242D
    val NeutralVariant20 = Color(red = 50, green = 47, blue = 55) // #322F37
    val NeutralVariant25 = Color(red = 61, green = 58, blue = 67) // #3D3A43
    val NeutralVariant30 = Color(red = 73, green = 69, blue = 78) // #49454E
    val NeutralVariant35 = Color(red = 85, green = 81, blue = 90) // #55515A
    val NeutralVariant40 = Color(red = 97, green = 93, blue = 102) // #615D66
    val NeutralVariant50 = Color(red = 122, green = 117, blue = 127) // #7A757F
    val NeutralVariant60 = Color(red = 148, green = 143, blue = 153) // #948F99
    val NeutralVariant70 = Color(red = 175, green = 169, blue = 180) // #AFA9B4
    val NeutralVariant80 = Color(red = 202, green = 196, blue = 207) // #CAC4CF
    val NeutralVariant90 = Color(red = 231, green = 224, blue = 235) // #E7E0EB
    val NeutralVariant95 = Color(red = 245, green = 238, blue = 250) // #F5EEFA
    val NeutralVariant98 = Color(red = 254, green = 247, blue = 255) // #FEF7FF
    val NeutralVariant99 = Color(red = 255, green = 251, blue = 255) // #FFFBFF
    val NeutralVariant100 = Color(red = 255, green = 255, blue = 255) // #FFFFFF

    val Black = Color(red = 0, green = 0, blue = 0) // #000000
    val White = Color(red = 255, green = 255, blue = 255) // #FFFFFF
}
