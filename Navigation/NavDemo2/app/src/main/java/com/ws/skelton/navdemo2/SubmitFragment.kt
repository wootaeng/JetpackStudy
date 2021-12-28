package com.ws.skelton.navdemo2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.ws.skelton.navdemo2.databinding.FragmentSubmitBinding


/**
 * A simple [Fragment] subclass.
 * Use the [SubmitFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SubmitFragment : Fragment() {


    private lateinit var binding: FragmentSubmitBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_submit, container, false)

        var inputName:String? = requireArguments().getString("user_input")
        binding.textVName.text = inputName.toString()

        var inputEmail = requireArguments().getString("user_email")
        binding.textVEmail.text = inputEmail.toString()

        binding.TermsBtn2.setOnClickListener {
            it.findNavController().navigate(R.id.action_submitFragment_to_termsFragment)
        }

        return binding.root
    }


}