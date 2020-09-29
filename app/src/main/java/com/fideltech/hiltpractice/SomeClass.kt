package com.fideltech.hiltpractice

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


//step 6: Scoping
//@Singleton  //used for application level only one object live in memory which is annotated by this
@ActivityScoped //change form Singleton to ActivityScope and it will work fine
//change @Singleton to @ActivityScope
//step 3: create dependencies for injection by creating constructor
//note: cant inject lover Scope to upper scope.
class SomeClass @Inject constructor(
    //step 5: constructor injection
    //constructor injection bcz we are not creating object for @SomeOtherClass it pass in constructor
    private val someOtherClass: SomeInterfaceImpClass  // you can't inject interface in constructor
) {

    fun printLn() {
        println("inside println of Some class")
    }

    fun doSomeOtherthing() {
        someOtherClass.dosomeOtherthing()
    }
}