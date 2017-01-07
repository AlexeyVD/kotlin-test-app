package com.avd.kotlin_test_app.api

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by Aleksey Dementyev on 07.01.2017.
 */

interface FootballApi {

    @GET("competitions/?season={year}")
    fun getCompetitions (@Path("year") year : Int) : Observable<Any>
}