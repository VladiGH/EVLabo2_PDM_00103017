package com.proyecto.evlabo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.proyecto.evlabo2.fragments.MainFragment

class MainActivity : AppCompatActivity(), MainFragment.changeImage {

    lateinit var listImage: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addImagetoList()
        setContentView(R.layout.activity_main)
    }

    fun addImagetoList(){
        listImage.add(R.drawable.img7)
        listImage.add(R.drawable.img8)
        listImage.add(R.drawable.img9)
    }

    private fun changeFragment(id: Int, frag: Fragment){ supportFragmentManager.beginTransaction().replace(id, frag).commit() }

    override fun changeFragmentImageRight() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun changeFragmentImageLeft() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
