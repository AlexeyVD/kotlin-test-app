package com.avd.kotlin_test_app.di.module

import com.avd.kotlin_test_app.BuildConfig
import com.avd.kotlin_test_app.api.FootballRepository
import com.avd.kotlin_test_app.api.retrofit.FootballApi
import com.avd.kotlin_test_app.api.retrofit.FootballRetrofitRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by Aleksey Dementyev on 07.01.2017.
 */

@Module
class ServiceModule {

    @Provides
    @Singleton
    fun provideFootballRepository(footballApi: FootballApi) : FootballRepository =
            FootballRetrofitRepository(footballApi)

    @Provides
    @Singleton
    fun provideFootballApi(retrofit: Retrofit) : FootballApi = retrofit.create(FootballApi::class.java)

    @Provides
    @Singleton
    fun provideApiUrl() : String = BuildConfig.API_URL
}