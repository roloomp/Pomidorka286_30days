package com.example.pomidorka286_30days.ui.theme

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

    )
}
