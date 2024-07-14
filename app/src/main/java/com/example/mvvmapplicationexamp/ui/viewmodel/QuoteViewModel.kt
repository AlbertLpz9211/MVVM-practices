package com.example.mvvmapplicationexamp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmapplicationexamp.data.model.QuoteModel
import com.example.mvvmapplicationexamp.data.model.QuoteProvider
import com.example.mvvmapplicationexamp.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    var getQuotesUseCase = GetQuotesUseCase()
    val isLoading = MutableLiveData<Boolean>()
    fun onCeate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result: List<QuoteModel>? = getQuotesUseCase()
            if (!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun ramdomQuote() {

    }
}