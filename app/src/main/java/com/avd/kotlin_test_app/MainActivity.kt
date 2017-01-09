package com.avd.kotlin_test_app

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.net.ContentHandler
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    public lateinit var context: Context;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FootballApplication.appComponent.plus().inject(this)
    }

    override fun onResume() {
        super.onResume()
    }
}
