package com.bigbang.testingapplication.network

import com.bigbang.testingapplication.model.GitResult
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class GitRetrofitInstance {

    var gitService: GitService

    init {
        gitService = createGitService(createRetrofitInstance())
    }


    private fun createRetrofitInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    private fun createGitService(retrofit: Retrofit) :GitService{
        return  retrofit.create(GitService::class.java)
    }

    fun getResults(userName : String): Observable<List<GitResult>> {
        return gitService.getUsers(userName)
    }
}