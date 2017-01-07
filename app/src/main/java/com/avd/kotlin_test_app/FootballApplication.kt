package com.avd.kotlin_test_app

import android.app.Application

/**
 * Created by Aleksey Dementyev on 07.01.2017.
 */

class FootballApplication : Application() {

    companion object {
        @JvmStatic lateinit var instance: FootballApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this;
    }
}
