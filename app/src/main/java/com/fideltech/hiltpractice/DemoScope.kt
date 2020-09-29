package com.fideltech.hiltpractice

import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject
import javax.inject.Singleton

//this class only can be injected in @Singleton annotated class
@Singleton
class DemoScope @Inject constructor() {
    fun demoMethod(): String {
        return "Demo method return string"
    }
}

//this class only injected in @FragmentScoped annotated class  or In Fragment
@FragmentScoped
class DemoFragmentScope @Inject constructor() {
    fun demoMethod(): String {
        return "Demo method return string"
    }
}