package com.bigbang.testingapplication.network

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.bigbang.testingapplication.model.GitResult
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class GitViewModel(application: Application): AndroidViewModel(application) {

    private val gitRetrofitInstance = GitRetrofitInstance()

    fun getRepositories(userName: String) : Observable<List<GitResult>> {
        return gitRetrofitInstance.getResults(userName)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
    }

}