package com.fideltech.hiltpractice.fragmentInjection

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject

class MainFragmentFactory @Inject constructor(
    @FragmentName private val fragmentName: String
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            MainFragment::class.java.name -> {
                MainFragment(fragmentName)
            }
            else ->
                return super.instantiate(classLoader, className)
        }

    }
}