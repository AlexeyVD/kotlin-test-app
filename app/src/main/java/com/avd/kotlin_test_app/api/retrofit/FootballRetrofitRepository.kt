package com.avd.kotlin_test_app.api.retrofit

import com.avd.kotlin_test_app.api.FootballRepository
import com.avd.kotlin_test_app.model.Competition
import rx.Observable
import javax.inject.Inject

/**
 * Created by Alexey.Dementyev on 09.01.2017.
 */

class FootballRetrofitRepository : FootballRepository {

    val footballApi: FootballApi

    @Inject
    constructor(footballApi: FootballApi) {
        this.footballApi = footballApi
    }

    override fun getCompetitions(year: Int): Observable<List<Competition>> {
        return footballApi.getCompetitions(year)
    }
}