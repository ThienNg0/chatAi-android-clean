package com.example.chatbot.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigator
import androidx.navigation.fragment.findNavController
import com.example.chatbot.R
import com.example.chatbot.databinding.FragmentLoginBinding

class LoginFragment:Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvSignUp.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
    }

}