package com.fideltech.hiltpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

//2. step to annotate activity with @AndroidEntryPoint
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //step 4 Inject created dependencies in activity
    //its call field injection
    @Inject
    lateinit var someClass: SomeClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        someClass.printLn()
        someClass.doSomeOtherthing()
    }
}


/*
//fragment
@AndroidEntryPoint
class MyFragment : Fragment() {
}*/

//injection interface
//Scene 1: you cant inject interface from constructor
//Scene 2: you cant inject 3rd party class or object in class, can create object for 3rd party
