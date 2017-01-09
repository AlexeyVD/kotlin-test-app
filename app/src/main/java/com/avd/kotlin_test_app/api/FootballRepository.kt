package com.avd.kotlin_test_app.api

import com.avd.kotlin_test_app.model.Competition
import rx.Observable

/**
 * Created by Alexey.Dementyev on 09.01.2017.
 */

interface FootballRepository {
    fun getCompetitions (year : Int) : Observable<List<Competition>>
}