package com.percobaan.mynavigationdrawerapplication.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sent Fragment"
    }
    val text: LiveData<String> = _text
}