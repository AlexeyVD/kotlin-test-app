package com.avd.kotlin_test_app.api.retrofit

import com.avd.kotlin_test_app.model.Competition
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by Aleksey Dementyev on 07.01.2017.
 */

interface FootballApi {

    @GET("competitions")
    fun getCompetitions (@Query("season") year : Int) : Observable<List<Competition>>
}