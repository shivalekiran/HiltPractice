package com.fideltech.hiltpractice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


//step 1: create android application class and annotate with @HiltAndroidApp
@HiltAndroidApp
class HiltApplication: Application(){
}