package com.capstonebangkit.birdwatch.view.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.capstonebangkit.birdwatch.R
import com.capstonebangkit.birdwatch.databinding.FragmentHomeBinding
import com.capstonebangkit.birdwatch.view.ui.bird.Bird
import com.capstonebangkit.birdwatch.view.ui.bird.BirdAdapter

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var birdAdapter: BirdAdapter
    private val birdList = listOf(
        Bird("Alap-alap kawah", "Peregrine Falcon", R.drawable.peregrine_falcon),
        Bird("Angsa Hitam", "Black Swan", R.drawable.black_swan),
        // Add more birds as needed
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        birdAdapter = BirdAdapter(birdList)
        recyclerView.adapter = birdAdapter

        return view
    }
}