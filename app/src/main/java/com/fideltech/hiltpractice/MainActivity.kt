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


    //Scoping
    @Inject
    lateinit var dmeoScope: DemoScope
    //if it injected compile time error
//    @Inject
//    lateinit var demoFragmentScope: DemoFragmentScope


    //injecting management
    //its depends on student interface so it cant be instantiate -sol use Module to inject
    @Inject
    lateinit var management: Management

    //now i want to inject 3rd party object
    @Inject
    lateinit var constaintLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        someClass.printLn()
        someClass.doSomeOtherthing()
        dmeoScope.demoMethod()
//        demoFragmentScope.demoMethod()

        management.totalStudent()
    }
}


//fragment
@AndroidEntryPoint
class MyFragment : Fragment() {
    //injection scoped object to same scope as define in document.
    @Inject
    lateinit var demoFragmentScope: DemoFragmentScope
}

//injection interface
//Scene 1: you cant inject interface from constructor
//Scene 2: you cant inject 3rd party class or object in class, can create object for 3rd party
