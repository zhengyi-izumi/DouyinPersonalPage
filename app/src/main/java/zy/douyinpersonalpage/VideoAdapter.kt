package zy.douyinpersonalpage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter(val list:List<Video>) : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {
    inner class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
        val imageView = view.findViewById<ImageView>(R.id.video_item_ImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_item, parent, false)
        val viewHolder = ViewHolder(view)

        viewHolder.imageView.setOnClickListener {
            Toast.makeText(parent.context,"click me",Toast.LENGTH_SHORT)
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].src)
    }

    override fun getItemCount() = list.size
}