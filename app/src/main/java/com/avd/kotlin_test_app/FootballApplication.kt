package com.avd.kotlin_test_app

import android.app.Application
import com.avd.kotlin_test_app.di.component.AppComponent
import com.avd.kotlin_test_app.di.component.DaggerAppComponent

/**
 * Created by Aleksey Dementyev on 07.01.2017.
 */

class FootballApplication : Application() {

    companion object {
        @JvmStatic lateinit var instance: FootballApplication
        @JvmStatic lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        instance = this;
        setupAppComponent();
    }

    private fun setupAppComponent() {
        appComponent = DaggerAppComponent.create()
    }
}
