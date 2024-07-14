package com.example.mvvmapplicationexamp.data.network

import com.example.mvvmapplicationexamp.core.RetrofitHelper
import com.example.mvvmapplicationexamp.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getQuote(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response: Response<List<QuoteModel>> =
                retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}