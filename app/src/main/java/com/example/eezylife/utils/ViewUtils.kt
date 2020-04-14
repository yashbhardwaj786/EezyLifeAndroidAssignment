package com.example.eezylife.utils

import java.text.SimpleDateFormat
import java.util.*

enum class DateFormat {
    USER_READABLE_WITH_DAY, TWENTY_FOUR_HOURS
}

fun getSimpleDateFormat(dateFormat: DateFormat): SimpleDateFormat? {
    var simpleDateFormat: SimpleDateFormat? = null
    if (dateFormat == DateFormat.USER_READABLE_WITH_DAY) {
        simpleDateFormat =
            SimpleDateFormat("EEE dd, MMMM yyyy", Locale.ENGLISH)
    } else if (dateFormat == DateFormat.TWENTY_FOUR_HOURS) {
        simpleDateFormat =
            SimpleDateFormat(
                "HH:mm",
                Locale.ENGLISH
            )
    }
    return simpleDateFormat
}
