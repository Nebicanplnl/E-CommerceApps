package com.example.e_commerceapps.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.e_commerceapps.R
import com.example.e_commerceapps.adapters.ProfileAdapter
import com.example.e_commerceapps.databinding.FragmentProfileBinding
import com.example.e_commerceapps.model.ProfileItem

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val profileItems = listOf(
        ProfileItem("My orders", "Already have 12 orders"),
        ProfileItem("Shipping addresses", "3 addresses"),
        ProfileItem("Payment methods", "Visa **34"),
        ProfileItem("Promocodes", "You have special promocodes"),
        ProfileItem("My reviews", "Reviews for 4 items"),
        ProfileItem("Settings", "Notifications, password")
    )

    private lateinit var profileAdapter : ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        profileAdapter = ProfileAdapter(profileItems)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        onItemClick()
    }

    private fun onItemClick() {
        profileAdapter.onItemClick = {item ->
            Toast.makeText(requireContext(), "${item.title} clicked!", Toast.LENGTH_LONG).show()
        }
    }

    private fun setupRecyclerView() {
        binding.rvProfileItems.layoutManager = LinearLayoutManager(requireContext())
        binding.rvProfileItems.adapter = profileAdapter
    }

}