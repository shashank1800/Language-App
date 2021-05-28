package com.shahankbhat.myapp.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.shahankbhat.myapp.R
import com.shahankbhat.myapp.databinding.ActivityMainBinding
import com.shahankbhat.myapp.databinding.AdapterSampleDataBinding
import com.shahankbhat.myapp.model.Tutorial
import com.shahankbhat.myapp.viewmodel.MainViewModel
import com.shahankbhat.recyclergenericadapter.RecyclerGenericAdapter
import com.shahankbhat.myapp.BR

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    val mainViewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel.getSampleData()

        val adapter = RecyclerGenericAdapter<AdapterSampleDataBinding, Tutorial>(
            R.layout.adapter_sample_data,  // layout for adapter
            BR.model
        )
        binding.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvList.adapter = adapter


        mainViewModel.arrayListSampleData.observe(this, {
            if(it != null && it.size != 0){
                Log.i("size", "${it.size}")

                adapter.submitList(it)
            }
        })



    }
}