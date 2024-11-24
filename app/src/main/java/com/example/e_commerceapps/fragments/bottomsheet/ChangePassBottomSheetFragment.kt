package com.example.e_commerceapps.fragments.bottomsheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerceapps.R
import com.example.e_commerceapps.databinding.FragmentChangePassBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ChangePassBottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentChangePassBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentChangePassBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

}