package com.example.bestpro.jetpack

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.base.BaseFragment
import com.example.bestpro.databinding.FragmentMainBinding

class MainFragment : BaseFragment() {

    private lateinit var binding: FragmentMainBinding

    private  val TAG = "MainFragment"

    private val myViewModel by activityViewModels<MyViewHolder>()

    companion object{
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myViewModel.testLiveData.observe(viewLifecycleOwner){
            Log.e(TAG, "onViewCreated:=${it} " )
            binding.tvContent.text = it
        }
        binding.btnRequest.setOnClickListener {
            val random = (1 .. 100).random().toString()
            myViewModel.getTestData("我来了$random")
        }


    }
}