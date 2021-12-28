package com.ws.skelton.navdemo2

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.ws.skelton.navdemo2.databinding.FragmentSignNameBinding


/**
 * A simple [Fragment] subclass.
 * Use the [SignNameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignNameFragment : Fragment() {


    private lateinit var binding: FragmentSignNameBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_name, container, false)
        binding.NextBtn.setOnClickListener {
            if (!TextUtils.isEmpty(binding.editTextName.text.toString())) {
                val bundle: Bundle =
                    bundleOf("user_input" to binding.editTextName.text.toString())
                it.findNavController()
                    .navigate(R.id.action_signNameFragment_to_signEmailFragment, bundle)
            }else{
                Toast.makeText(activity, "입력을 해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }


}