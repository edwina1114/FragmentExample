package com.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.fragmentexample.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.nextbutton.setOnClickListener {
            it?.findNavController()?.navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment("Edwina",21))
            //view?.findNavController()?.navigate(R.id.action_firstFragment_to_secondFragment)
        }


        return binding.root
    }

}