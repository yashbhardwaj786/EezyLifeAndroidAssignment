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
    val hostName = ObservableField<String>("Nicolas is the host:")
    val barName = ObservableField<String>("Piano Works")
    val barTime = ObservableField<String>("6:00 PM")
    val barItem = ObservableField<String>("Cocktail")
    val barAddress = ObservableField<String>("20 Queensberry \nSWT 2DR")


    val restaurantName = ObservableField<String>("Thai Square")
    val restaurantTime = ObservableField<String>("8:00 PM")
    val restaurantItem = ObservableField<String>("Thai")
    val restaurantAddress = ObservableField<String>("113 Perry Street \nEC1R 3BX")
    var buttonClicked = MutableLiveData<String>()

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
}