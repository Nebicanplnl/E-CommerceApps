package com.example.e_commerceapps.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerceapps.R
import com.example.e_commerceapps.databinding.FragmentSettingsBinding
import com.example.e_commerceapps.fragments.bottomsheet.ChangePassBottomSheetFragment

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.tvChangePassword.setOnClickListener {
            val bottomSheet = ChangePassBottomSheetFragment()
            bottomSheet.show(parentFragmentManager, "ChangePassBottomSheet")
        }

    }

}