package com.fideltech.hiltpractice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Qualifier

/**
goal is to inject same type of Object in
issue - cant inject same type of Obj - ( java.lang.String is bound multiple times:)
solution - use annotation for provide methods
 */
@InstallIn(ApplicationComponent::class)
@Module
class MyString {

    @Provides
    @ApplicationName    //user annotation for distinguish same return type and use this same annotation at injection time
    fun getApplicationName(): String {
        return "MyApplication"
    }

    @Provides
    @ActivityName
    fun getActivityMainName(): String {
        return "Main Activity"
    }
}

//creating annotation for same type of injection

//annotation for application Name
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApplicationName


//annotation for activity Name
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ActivityName
