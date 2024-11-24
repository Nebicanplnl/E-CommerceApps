package com.example.e_commerceapps.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerceapps.databinding.ItemLayoutUserInfoBinding
import com.example.e_commerceapps.model.ProfileItem

class ProfileViewHolder(
    val binding: ItemLayoutUserInfoBinding,
    private val onItemClick: (ProfileItem) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProfileItem){
        binding.root.setOnClickListener {
            onItemClick(item)
        }
        binding.tvTitle.text = item.title
        binding.tvSubtitle.text = item.subTitle
    }

}