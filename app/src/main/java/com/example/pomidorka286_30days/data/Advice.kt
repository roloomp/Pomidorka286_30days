package com.example.pomidorka286_30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.pomidorka286_30days.R

data class Advice(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val description: Int
)
object AdvicesRepository {
    val advices = listOf(
        Advice(R.drawable._adv, R.string.advice1, R.string.adv1_d),
        Advice(R.drawable.adv2, R.string.advice2, R.string.adv2_d),
        Advice(R.drawable.adv3, R.string.advice3, R.string.adv3_d),
        Advice(R.drawable.adv4, R.string.advice4, R.string.adv4_d),
        Advice(R.drawable.adv5, R.string.advice5, R.string.adv5_d),
        Advice(R.drawable.adv6, R.string.advice6, R.string.adv6_d),
        Advice(R.drawable.adv7, R.string.advice7, R.string.adv7_d),
        Advice(R.drawable.adv8, R.string.advice8, R.string.adv8_d),
        Advice(R.drawable.adv9, R.string.advice9, R.string.adv9_d),
        Advice(R.drawable.adv10, R.string.advice10, R.string.adv10_d),
        Advice(R.drawable.adv11, R.string.advice11, R.string.adv11_d),
        Advice(R.drawable.adv12, R.string.advice12, R.string.adv12_d),
        Advice(R.drawable.adv13, R.string.advice13, R.string.adv13_d),
        Advice(R.drawable.adv14, R.string.advice14, R.string.adv14_d),
        Advice(R.drawable.adv15, R.string.advice15, R.string.adv15_d),
        Advice(R.drawable.adv16, R.string.advice16, R.string.adv16_d),
        Advice(R.drawable.adv17, R.string.advice17, R.string.adv17_d),
        Advice(R.drawable.adv18, R.string.advice18, R.string.adv18_d),
        Advice(R.drawable.adv19, R.string.advice19, R.string.adv19_d),
        Advice(R.drawable.adv20, R.string.advice20, R.string.adv20_d),
        Advice(R.drawable.adv21, R.string.advice21, R.string.adv21_d),
        Advice(R.drawable.adv22, R.string.advice22, R.string.adv22_d),
        Advice(R.drawable.adv23, R.string.advice23, R.string.adv23_d),
        Advice(R.drawable.adv24, R.string.advice24, R.string.adv24_d),
        Advice(R.drawable.adv25, R.string.advice25, R.string.adv25_d),
        Advice(R.drawable.adv26, R.string.advice26, R.string.adv26_d),
        Advice(R.drawable.adv27, R.string.advice27, R.string.adv27_d),
        Advice(R.drawable.adv28, R.string.advice28, R.string.adv28_d),
        Advice(R.drawable.adv29, R.string.advice29, R.string.adv29_d),
        Advice(R.drawable.adv30, R.string.advice30, R.string.adv30_d),

    )
}
