package com.example.android.newsapiclient

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.newsapiclient.databinding.ActivityMainBinding
import com.example.android.newsapiclient.presentation.viewmodel.NewsViewModel
import com.example.android.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var factory: NewsViewModelFactory
    lateinit var viewModel: NewsViewModel
    private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnvNews.setupWithNavController(
            fragment.findNavController()
        )

        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
    }
}