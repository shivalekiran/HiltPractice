package com.fideltech.hiltpractice

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


@InstallIn(ApplicationComponent::class)
@Module
abstract class MyModule {
    //need at-least one parameter to method to create object
    @Binds
    abstract fun provideMeStudent(college: College): Student

    //bind didn't work for 3rd party class sol- in @MyObjProviderModule
    //we need to use @Provides and create Object of that dependency obj
    //it create error: [Dagger/DependencyCycle] Found a dependency cycle: so commenting it n just provide it in @MyObjProviderModule
//    @Binds
//    abstract fun provideMeConstraintLayout(constraintLayout: ConstraintLayout): ConstraintLayout
}


@InstallIn(ApplicationComponent::class)// injecting in application level scope
@Module
class MyObjProviderModule {

    //@ApplicationContext provides context
    //below dagger know how to create @ConstraintLayout so it can be injected
    @Provides
    fun provideMeConstraintLayout(@ApplicationContext context: Context): ConstraintLayout {
        return ConstraintLayout(context)
    }

}


class Management @Inject constructor(private val student: Student) {
    fun totalStudent() {
        println("Total Student ${student.needThisCountForCollege()}")
    }
}

class College @Inject constructor() : Student {
    fun studentCount(): Int {
        return 0;
    }

    override fun needThisCountForCollege() {
        println("Student count $studentCount");
    }
}

interface Student {
    public val studentCount: Int
        get() = 40

    fun needThisCountForCollege()
}