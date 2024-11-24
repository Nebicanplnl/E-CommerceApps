package com.example.e_commerceapps.ui.screens.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.e_commerceapps.R
import com.example.e_commerceapps.adapter.IntroAdapter
import com.example.e_commerceapps.databinding.FragmentIntroBinding
import com.google.android.material.tabs.TabLayoutMediator


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

        TabLayoutMediator(binding.tabLayout, binding.introVP) { tab, position ->
            tab.setIcon(R.drawable.tab_unselected)
        }.attach()

        binding.introVP.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                for (i in 0 until binding.tabLayout.tabCount) {
                    val tab = binding.tabLayout.getTabAt(i)
                    if (i == position) {
                        tab?.setIcon(R.drawable.tab_selected)
                    } else {
                        tab?.setIcon(R.drawable.tab_unselected)
                    }
                }
            }
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}