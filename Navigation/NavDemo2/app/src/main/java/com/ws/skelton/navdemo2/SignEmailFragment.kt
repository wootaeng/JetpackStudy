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
import com.ws.skelton.navdemo2.databinding.FragmentSignEmailBinding


/**
 * A simple [Fragment] subclass.
 * Use the [SignEmailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignEmailFragment : Fragment() {

    private lateinit var binding: FragmentSignEmailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_email, container, false)

        val name = requireArguments().getString("user_input")
        binding.submitBtn.setOnClickListener {
            if (!TextUtils.isEmpty(binding.editTextEmail.text.toString())) {
                val bundle: Bundle =
                    bundleOf("user_email" to binding.editTextEmail.text.toString(),
                    "user_input" to name)
                it.findNavController()
                    .navigate(R.id.action_signEmailFragment_to_submitFragment, bundle)
            }else{
                Toast.makeText(activity, "입력을 해주세요", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }


}