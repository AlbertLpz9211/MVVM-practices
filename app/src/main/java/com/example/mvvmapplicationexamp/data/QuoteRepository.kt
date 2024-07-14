package com.example.mvvmapplicationexamp.data

import com.example.mvvmapplicationexamp.data.model.QuoteModel
import com.example.mvvmapplicationexamp.data.model.QuoteProvider
import com.example.mvvmapplicationexamp.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response: List<QuoteModel> = api.getQuote()
        QuoteProvider.quotes = response
        return response
    }
}