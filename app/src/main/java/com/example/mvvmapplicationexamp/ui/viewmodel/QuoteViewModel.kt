package com.example.mvvmapplicationexamp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmapplicationexamp.data.model.QuoteModel
import com.example.mvvmapplicationexamp.data.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel =  MutableLiveData<QuoteModel>()
    fun ramdomQuote(){
        val currentQuote: QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}