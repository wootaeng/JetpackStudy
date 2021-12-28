package com.ws.skelton.navdemo2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.ws.skelton.navdemo2.databinding.FragmentHomBinding


class HomFragment : Fragment() {

    private lateinit var binding: FragmentHomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_hom, container, false)

        binding.TermsBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homFragment_to_termsFragment)
        }

        binding.SignBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homFragment_to_signNameFragment)
        }

        return binding.root
    }


}