package com.example.e_commerceapps.ui.screens.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.e_commerceapps.R
import com.example.e_commerceapps.adapter.IntroAdapter
import com.example.e_commerceapps.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private var _binding : FragmentIntroBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIntroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList = listOf(
            FirstVP(),
            SecondVP(),
            ThirdVP()
        )
        val adapter = IntroAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)
        binding.introVP.adapter = adapter

        binding.getStartedBtn.setOnClickListener {
            findNavController().navigate(
                R.id.signUpFragment,
                null,
                NavOptions.Builder()
                    .setPopUpTo(R.id.introFragment, true)
                    .build()
            )
        }

    }


}