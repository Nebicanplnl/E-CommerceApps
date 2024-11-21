package com.example.e_commerceapps.ui.screens.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerceapps.databinding.FragmentFirstVPBinding


class FirstVP : Fragment() {

    private var _binding: FragmentFirstVPBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstVPBinding.inflate(inflater, container, false)
        return binding.root
    }


}