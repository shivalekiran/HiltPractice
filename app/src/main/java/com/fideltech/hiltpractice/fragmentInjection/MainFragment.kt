package com.fideltech.hiltpractice.fragmentInjection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fideltech.hiltpractice.R

class MainFragment
constructor(
    private val fragmentName: String
) : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("Inside main fragment, name: $fragmentName")
    }
}