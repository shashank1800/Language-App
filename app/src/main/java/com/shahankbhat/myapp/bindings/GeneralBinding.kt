package com.shahankbhat.myapp.bindings

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.shahankbhat.myapp.R
import com.shahankbhat.myapp.model.Tutorial

object GeneralBinding {


    @JvmStatic
    @BindingAdapter(value = ["bindImageUrlWithImageView"])
    fun bindImageUrlWithImageView(imageView: ImageView, model: Tutorial){

        Glide.with(imageView.context)
            .load(model.imageurl)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(imageView)
    }
}