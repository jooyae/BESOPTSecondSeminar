package org.sopt.besoptsecondseminar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.besoptsecondseminar.databinding.ItemFollowUserBinding

class FollowingListAdapter : RecyclerView.Adapter<FollowingListAdapter.FollowingUserViewHolder>() {

    val userList = mutableListOf<FollowingUserInfo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowingListAdapter.FollowingUserViewHolder {
        val binding = ItemFollowUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
        )
        return FollowingUserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FollowingListAdapter.FollowingUserViewHolder, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int =userList.size


    class FollowingUserViewHolder(
            private val binding: ItemFollowUserBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(followingUserInfo: FollowingUserInfo){
            binding.textviewRepositoryName.text = followingUserInfo.repository_name
            binding.textviewRepositoryExplanation.text = followingUserInfo.repository_explanation
            binding.textviewRepositoryLangauge.text = followingUserInfo.repository_language
        }
    }

}