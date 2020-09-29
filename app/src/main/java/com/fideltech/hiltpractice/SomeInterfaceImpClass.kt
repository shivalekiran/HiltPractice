package com.fideltech.hiltpractice

import javax.inject.Inject


class SomeInterfaceImpClass @Inject constructor(
//    private val constraintLayout: ConstraintLayout  //you dont own this constraint layout so you cant inject this
)  {
    fun dosomeOtherthing() {
        println("do some other thing")
    }

}
