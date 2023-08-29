package com.rajbagri.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rajbagri.recordkeeper.databinding.FragmentCyclingBinding

class CyclingFragment : Fragment() {

    private lateinit var binding: FragmentCyclingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.containerLongestRideHeading.setOnClickListener { launchingCyclingRecordScreen() }
        binding.containerBiggestClimb.setOnClickListener { launchingCyclingRecordScreen() }
        binding.containerBestAverageSpeed.setOnClickListener { launchingCyclingRecordScreen() }
    }

    private fun launchingCyclingRecordScreen() {
        val intent = Intent(context, EditCyclingRecordActivity::class.java)
        startActivity(intent)
    }
}