package com.example.viewmodelejemplo

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var number = 0

    fun addOne() {
        number++
    }

    fun getNumber():Int{
        return this.number
    }
}