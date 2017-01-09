package com.avd.kotlin_test_app

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.avd.kotlin_test_app.api.FootballRepository
import com.avd.kotlin_test_app.model.Competition
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    public lateinit var context: Context;

    @Inject
    public lateinit var repository: FootballRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FootballApplication.appComponent.plus().inject(this)
        testRepository()
    }

    private fun testRepository() {
        repository.getCompetitions(2016)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    competitions -> printResult(competitions)
                }, {
                    error -> Log.e("MainActivity", error.message)
                })
    }

    private fun printResult(competitions: List<Competition>) {
        competitions.forEach { competition -> Log.i("MainActivity", competition.caption) }
    }
}
