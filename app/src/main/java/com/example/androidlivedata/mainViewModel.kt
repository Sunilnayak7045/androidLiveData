package com.example.androidlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainViewModel: ViewModel() {


    // MutableLiveData = can be changed
    // LiveData = can't be changed (Read only)
   private val factsLiveDataObject= MutableLiveData<String>("This is A")
    // priv bcoz factsLiveDataObject contain mutable(can be changed) which is publicly exposed

    val factsLiveData : LiveData<String> // now factsLiveData is publicly exposed
    get() = factsLiveDataObject


    fun updateLiveData(){
        factsLiveDataObject.value = "This is B"

    }

}