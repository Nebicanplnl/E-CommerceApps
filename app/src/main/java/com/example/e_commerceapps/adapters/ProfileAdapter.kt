package com.example.e_commerceapps.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerceapps.databinding.ItemLayoutUserInfoBinding
import com.example.e_commerceapps.model.ProfileItem
import com.example.e_commerceapps.viewholders.ProfileViewHolder

class ProfileAdapter(private val items: List<ProfileItem>) :
    RecyclerView.Adapter<ProfileViewHolder>() {

        lateinit var onItemClick: ((ProfileItem) -> Unit)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val binding = ItemLayoutUserInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}
