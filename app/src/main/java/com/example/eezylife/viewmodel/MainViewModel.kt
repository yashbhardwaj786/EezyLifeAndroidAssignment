package com.example.eezylife.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val selectedDate = ObservableField<String>("")
    val cityName = ObservableField<String>("London, UK")
    val afterNoon = ObservableField<String>("Afternoon")
    val afterNoonTemp = ObservableField<String>("20°C")
    val morning = ObservableField<String>("Morning")
    val morningTemp = ObservableField<String>("15°C")
    val noon = ObservableField<String>("Noon")
    val noonTemp = ObservableField<String>("25°C")
    val evening = ObservableField<String>("Evening")
    val eveningTemp = ObservableField<String>("16°C")
    val night = ObservableField<String>("Night")
    val nightTemp = ObservableField<String>("19°C")
    val hostName = ObservableField<String>("Nicolas is the host:")
    val barName = ObservableField<String>("Piano Works")
    val barTime = ObservableField<String>("6:00 PM")
    val barItem = ObservableField<String>("Cocktail")
    val barAddress = ObservableField<String>("20 Queensberry \nSWT 2DR")
    val restaurantName = ObservableField<String>("Thai Square")
    val restaurantTime = ObservableField<String>("8:00 PM")
    val restaurantItem = ObservableField<String>("Thai")
    val restaurantAddress = ObservableField<String>("113 Perry Street \nEC1R 3BX")
    val commentAuthor = ObservableField<String>("Monkee")
    val commentTime = ObservableField<String>("5 Mins")
    val comment =
        ObservableField<String>("Kate, Listen, I know im greatbut  im just a virtual friend may be you should invite some real ones?")
    val commentCount = ObservableField<String>("6 Comments")
    var buttonClicked = MutableLiveData<String>()

    val morningSlotVisible = ObservableField<Boolean>(false)
    val noonSlotVisible = ObservableField<Boolean>(false)
    val afterNoonSlotVisible = ObservableField<Boolean>(false)
    val eveningSlotVisible = ObservableField<Boolean>(true)
    val nightSlotVisible = ObservableField<Boolean>(false)

    fun acceptedClick(type: String) {
        if (type == "bar")
            buttonClicked.postValue("bar-Accepted")
        else if (type == "rest")
            buttonClicked.postValue("rest-Accepted")
    }

    fun declinedClick(type: String) {
        if (type == "bar")
            buttonClicked.postValue("bar-Declined")
        else if (type == "rest")
            buttonClicked.postValue("rest-Declined")
    }

    fun morningSlotExpended(slot: String) {
        when (slot) {
            "Morning" -> {
                morningSlotVisible.set(true)
            }
            "Noon" -> {
                noonSlotVisible.set(true)
            }
            "Afternoon" -> {
                afterNoonSlotVisible.set(true)
            }
            "Night" -> {
                nightSlotVisible.set(true)
            }
            "Evening" -> {
                eveningSlotVisible.set(true)
            }
        }
    }

    fun morningSlotCollapsed(slot: String) {
        when (slot) {
            "Morning" -> {
                morningSlotVisible.set(false)
            }
            "Noon" -> {
                noonSlotVisible.set(false)
            }
            "Afternoon" -> {
                afterNoonSlotVisible.set(false)
            }
            "Night" -> {
                nightSlotVisible.set(false)
            }
            "Evening" -> {
                eveningSlotVisible.set(false)
            }
        }
    }
}