package com.avd.kotlin_test_app.di.module

import android.content.Context
import com.avd.kotlin_test_app.FootballApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Aleksey Dementyev on 07.01.2017.
 */

@Module
class AppContextModule {

    @Provides
    @Singleton
    fun provideContext() : Context = FootballApplication.instance
}