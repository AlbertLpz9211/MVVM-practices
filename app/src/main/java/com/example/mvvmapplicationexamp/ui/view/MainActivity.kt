package com.example.mvvmapplicationexamp.ui.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mvvmapplicationexamp.databinding.ActivityMainBinding
import com.example.mvvmapplicationexamp.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuotes.text = it.quote
            binding.tvAuthor.text = it.author
        })
        binding.viewConteiner.setOnClickListener {
            quoteViewModel.ramdomQuote()
        }
    }
}