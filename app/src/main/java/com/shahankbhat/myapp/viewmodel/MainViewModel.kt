package com.shahankbhat.myapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shahankbhat.myapp.model.Tutorial
import com.shahankbhat.myapp.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {


    val arrayListSampleData = MutableLiveData<ArrayList<Tutorial>>()

    fun getSampleData(){

        val repository = MainRepository()

        viewModelScope.launch {
            val response = repository.getSampleData()
            withContext(Dispatchers.Main){
                Log.i("response", "${response.body()}")
                if(response.isSuccessful){
                    arrayListSampleData.value = response.body()?.tutorials
                }
            }
        }

    }

}