package com.example.mvvmapplicationexamp.domain

import com.example.mvvmapplicationexamp.data.QuoteRepository
import com.example.mvvmapplicationexamp.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? {
        return repository.getAllQuotes()
    }
}