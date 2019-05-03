package com.proyecto.evlabo2.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.proyecto.evlabo2.R
import kotlinx.android.synthetic.main.fragment_layout.view.*

class MainFragment: Fragment() {

    private var listener: changeImage? = null

    companion object {
        fun newInstance(image: Int){
            val newInstance = MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view =inflater.inflate(R.layout.fragment_layout, container, false)

        initButtonIzq(view)
        initButtonDer(view)
        return view
    }

    interface changeImage{
        fun changeFragmentImageLeft()
        fun changeFragmentImageRight()
    }

    fun initButtonIzq(view: View) = view.boton_izq.setOnClickListener{

    }

    fun initButtonDer(view: View) = view.boton_der.setOnClickListener{

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is changeImage) {
            listener = context
        } else {
            throw RuntimeException(" must implement inteface")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}