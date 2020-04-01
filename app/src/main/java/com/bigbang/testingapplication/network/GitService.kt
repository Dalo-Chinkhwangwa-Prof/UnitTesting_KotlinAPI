package com.bigbang.testingapplication.network

import com.bigbang.testingapplication.model.GitResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface GitService {

    @GET("/users/{user_name}/repos")
    fun getUsers(@Path("user_name")userName: String): Observable<List<GitResult>>
}