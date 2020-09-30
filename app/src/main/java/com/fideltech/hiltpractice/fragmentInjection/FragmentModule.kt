package com.fideltech.hiltpractice.fragmentInjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Qualifier

@InstallIn(ApplicationComponent::class)
@Module
object FragmentModule {
    @Provides
    @FragmentName
    fun provideFragmentName(): String {
        return "Main Fragment"
    }
}


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FragmentName