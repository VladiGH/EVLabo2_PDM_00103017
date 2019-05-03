package com.proyecto.evlabo2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.proyecto.evlabo2.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_image.view.*

class ImageFragment: Fragment() {


    companion object{
        fun newInstance(image: Int){
            val newFragment = ImageFragment()
            newFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view =inflater.inflate(R.layout.fragment_image, container, false)

        BindImage(view)
        return view
    }


    fun BindImage(view: View){
        Picasso.with(this.context)
            .load("")
            .resize((this.resources.displayMetrics.widthPixels/this.resources.displayMetrics.density).toInt(),256)
            .centerCrop()
            .into(view.iv_image)
    }
}