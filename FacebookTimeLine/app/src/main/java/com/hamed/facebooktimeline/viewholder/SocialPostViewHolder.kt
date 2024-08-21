package com.hamed.facebooktimeline.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.hamed.facebooktimeline.model.SocialPost
import com.hamed.facebooktimeline.databinding.SocialPostBinding


class SocialPostViewHolder(val itemBinding: SocialPostBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(post: SocialPost) {

        itemBinding.userName.text = post.userName;
        itemBinding.numberOfLikes.text = post.likesCount
        itemBinding.postText.text = post.postTitle;
        itemBinding.postDecs.text = post.postDescription
//        itemBinding.userNameTextView.text = post.userName
//        itemView.postTimeTextView.text = post.postTime
//        itemView.privacyIconImageView.setImageResource(post.privacyIconResId)
//        itemView.postDescriptionTextView.text = post.postDescription
//
//        if (post.postLink != null) {
//            itemView.postLinkTextView.visibility = View.VISIBLE
//            itemView.postLinkTextView.text = post.postLink
//        } else {
//            itemView.postLinkTextView.visibility = View.GONE
//        }
//
//        itemView.postImageView.setImageResource(post.postImageResId)
//        itemView.likesCountTextView.text = post.likesCount.toString()
//        itemView.sharesCountTextView.text = post.sharesCount
//
//        itemView.likeButton.setCompoundDrawablesWithIntrinsicBounds(post.likeButtonIconResId, 0, 0, 0)
//        itemView.commentButton.setCompoundDrawablesWithIntrinsicBounds(post.commentButtonIconResId, 0, 0, 0)
//        itemView.shareButton.setCompoundDrawablesWithIntrinsicBounds(post.shareButtonIconResId, 0, 0, 0)
    }
}
