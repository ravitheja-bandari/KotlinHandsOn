package com.rt.kotlinhandson

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.rt.kotlinhandson.TopicsAdapter.TopicViewHolder
import com.rt.kotlinhandson.databinding.ItemTopicBinding
import com.rt.kotlinhandson.responses.Topics

class TopicsAdapter : Adapter<TopicViewHolder>() {

    var topics: List<Topics>? = null
        set(value) {
            field = value
            Log.d("TopicsAdapter","SetValue")
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = TopicViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_topic,
            parent,
            false
        )
    )

    override fun getItemCount()= topics?.size ?: 0

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        Log.d("TopicsAdapter","onBindViewHolder")

        holder.binding.topic = topics!![position]
    }

    inner class TopicViewHolder(val binding: ItemTopicBinding ) :
        RecyclerView.ViewHolder(binding.root)
}
