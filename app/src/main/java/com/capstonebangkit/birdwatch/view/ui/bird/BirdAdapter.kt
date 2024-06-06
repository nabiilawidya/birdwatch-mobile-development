package com.capstonebangkit.birdwatch.view.ui.bird

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.capstonebangkit.birdwatch.R

class BirdAdapter(private val birdList: List<Bird>) :
    RecyclerView.Adapter<BirdAdapter.BirdViewHolder>() {

    class BirdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val birdImage: ImageView = itemView.findViewById(R.id.birdImage)
        val birdName: TextView = itemView.findViewById(R.id.birdName)
        val birdDescription: TextView = itemView.findViewById(R.id.birdDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BirdViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bird, parent, false)
        return BirdViewHolder(view)
    }

    override fun onBindViewHolder(holder: BirdViewHolder, position: Int) {
        val bird = birdList[position]
        holder.birdImage.setImageResource(bird.imageResource)
        holder.birdName.text = bird.name
        holder.birdDescription.text = bird.description
    }

    override fun getItemCount() = birdList.size
}
