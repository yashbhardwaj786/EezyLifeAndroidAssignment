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
    var buttonClicked = MutableLiveData<String>()

    fun acceptedClick(){
        buttonClicked.postValue("Accepted")
    }

    fun declinedClick() {
        buttonClicked.postValue("Declined")
    }
}