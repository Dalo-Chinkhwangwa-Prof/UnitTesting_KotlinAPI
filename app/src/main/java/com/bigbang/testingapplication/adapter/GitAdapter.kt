package com.bigbang.testingapplication.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bigbang.testingapplication.R
import com.bigbang.testingapplication.model.GitResult
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.git_item_layout.view.*

class GitAdapter(val gitList: List<GitResult>) : RecyclerView.Adapter<GitAdapter.GitItemViewHolder>(){

    inner class GitItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) //ViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.git_item_layout, parent, false)
        return GitItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return gitList.size
    }

    override fun onBindViewHolder(holder: GitItemViewHolder, position: Int) {
        holder.itemView.apply {

            gitList[position].apply {

                Glide.with(context)
                    .applyDefaultRequestOptions(RequestOptions().circleCrop())
                    .load(owner.avatarUrl)
                    .into(image_view)

                repo_name_textview.text = name
            }


        }

    }
}