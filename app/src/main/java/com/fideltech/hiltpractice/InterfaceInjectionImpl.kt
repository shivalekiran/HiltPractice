package com.fideltech.hiltpractice

import androidx.constraintlayout.widget.ConstraintLayout
import javax.inject.Inject
//Comment this class it has inteface injection issue
//solution in next bind/provide branch

//Scene for injecting interface or 3rd party class
//injection interface
//Scene 1: you cant inject interface from constructor
//Scene 2: you cant inject 3rd party class or object in class, can create object for 3rd party

/*
//Uncomment this for checking Interface issue.


//created for injection of Interface in any class
class InterfaceInjectionClass
@Inject constructor(
    //injection interface
//    private val interfaceInjectionImpl: SomeInterface,       //this will raise the compile time error
    private val constraintLayout: ConstraintLayout             //3rd party class cant be install
) {
    fun someMethod() {
//        interfaceInjectionImpl.someInterfaceMethod()
    }
}


class InterfaceInjectionImpl @Inject constructor() : SomeInterface {
    override fun someInterfaceMethod(): String {
        return "Returning form imp method"
    }
}

interface SomeInterface {
    fun someInterfaceMethod(): String
}*/
