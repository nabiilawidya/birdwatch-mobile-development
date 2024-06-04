package com.capstonebangkit.birdwatch.view.ui.analyze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.capstonebangkit.birdwatch.databinding.FragmentAnalyzeBinding

class AnalyzeFragment : Fragment() {

    private var _binding: FragmentAnalyzeBinding? = null
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val analyzeViewModel =
            ViewModelProvider(this).get(AnalyzeViewModel::class.java)

        _binding = FragmentAnalyzeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}