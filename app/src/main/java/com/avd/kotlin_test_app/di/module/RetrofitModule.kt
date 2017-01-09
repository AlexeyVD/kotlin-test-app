package com.avd.kotlin_test_app.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import rx.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by Alexey.Dementyev on 09.01.2017.
 */

@Module
class RetrofitModule {
    val TIMEOUT_SECONDS : Long = 30L

    @Provides
    @Singleton
    fun provideTimeout() : Long = TIMEOUT_SECONDS

    @Provides
    @Singleton
    fun provideOkHttpClient(timeout: Long) : OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(timeout, TimeUnit.SECONDS)
                .readTimeout(timeout, TimeUnit.SECONDS)
                .writeTimeout(timeout, TimeUnit.SECONDS)
                .build();
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, apiUrl: String) : Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(apiUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build()
    }
}