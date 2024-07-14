package com.example.mvvmapplicationexamp.domain

import com.example.mvvmapplicationexamp.data.QuoteRepository
import com.example.mvvmapplicationexamp.data.model.QuoteModel

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()
    operator fun invoke(): QuoteModel?{
        repository.quotes = response
    }
}