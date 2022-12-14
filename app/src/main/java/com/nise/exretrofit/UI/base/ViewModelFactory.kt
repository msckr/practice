package com.nise.exretrofit.UI.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nise.exretrofit.Data.api.ApiHelper
import com.nise.exretrofit.Data.repository.MainRepository
import com.nise.exretrofit.UI.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}
