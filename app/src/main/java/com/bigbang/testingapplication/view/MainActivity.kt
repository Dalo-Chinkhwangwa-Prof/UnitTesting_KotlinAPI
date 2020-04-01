package com.bigbang.testingapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.bigbang.testingapplication.R
import com.bigbang.testingapplication.adapter.GitAdapter
import com.bigbang.testingapplication.model.GitResult
import com.bigbang.testingapplication.network.GitViewModel
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val compositeDisposable = CompositeDisposable()
    private lateinit var viewModel: GitViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(GitViewModel::class.java)
        compositeDisposable.add(
            viewModel.getRepositories("Dalo-Chinkhwangwa-Prof")
                .subscribe({ results ->

                    displayResults(results)

                }, { throwable ->
                    Log.d("TAG_X", "Error ${throwable.localizedMessage}")
                })

        )

    }

    private fun displayResults(results: List<GitResult>) {

        val gitAdapter = GitAdapter(results)
        git_rv.adapter = gitAdapter
        git_rv.layoutManager = LinearLayoutManager(this)

    }
}
