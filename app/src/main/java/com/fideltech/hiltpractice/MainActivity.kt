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

    /*
   //    Interface issue
       //below statement raise issue becouse @InterfaceInjectionClass class need interface in constructor.
       @Inject
       lateinit var interfaceInjectionImpl: InterfaceInjectionClass
   */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        someClass.printLn()
        someClass.doSomeOtherthing()
        dmeoScope.demoMethod()
//        demoFragmentScope.demoMethod()
        //
//        interfaceInjectionImpl.someMethod()
    }
}


//fragment
@AndroidEntryPoint
class MyFragment : Fragment() {
    //injection scoped object to same scope as define in document.
    @Inject
    lateinit var demoFragmentScope: DemoFragmentScope
}

