package com.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.fragmentexample.databinding.FragmentFirstBinding
import com.example.fragmentexample.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.previousbutton.setOnClickListener {
            it?.findNavController()?.navigate(R.id.action_secondFragment_to_firstFragment)
            //view?.findNavController()?.navigate(R.id.action_secondFragment_to_firstFragment)
        }

        val args = SecondFragmentArgs.fromBundle(requireArguments())

        //在fragment裡面第一個參數this要改為context!!!!
        Toast.makeText(context, "Name : ${args.name} , Age : ${args.age}", Toast.LENGTH_SHORT).show()

        return binding.root
    }

}