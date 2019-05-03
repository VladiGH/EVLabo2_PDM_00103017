package com.proyecto.evlabo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proyecto.evlabo2.fragments.MainFragment

class MainActivity : AppCompatActivity(), MainFragment.changeImage {

    lateinit var listImage: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addImage(){
        listImage.add()
    }

    override fun changeFragmentImageRight() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun changeFragmentImageLeft() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
