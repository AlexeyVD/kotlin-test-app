package com.avd.kotlin_test_app.di.component

import com.avd.kotlin_test_app.di.module.AppContextModule
import com.avd.kotlin_test_app.di.module.ServiceModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Aleksey Dementyev on 07.01.2017.
 */

@Singleton
@Component(modules = arrayOf(
        AppContextModule::class,
        ServiceModule::class))
interface AppComponent {

    fun plus() : ActivityComponent
}