package com.Newsapp.ui

import androidx.lifecycle.ViewModel
import com.Newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository : NewsRepository
    ): ViewModel() {

}