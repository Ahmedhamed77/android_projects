package com.hamed.facebooktimeline.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hamed.facebooktimeline.R
import com.hamed.facebooktimeline.model.SocialPost
import com.hamed.facebooktimeline.viewholder.SocialPostViewHolder
import com.hamed.facebooktimeline.databinding.SocialPostBinding

class SocialPostAdapter(private val posts: List<SocialPost>) :
    RecyclerView.Adapter<SocialPostViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SocialPostViewHolder {
        val binding = SocialPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SocialPostViewHolder(binding)
    }


    override fun onBindViewHolder(holder: SocialPostViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    override fun getItemCount(): Int = posts.size
}