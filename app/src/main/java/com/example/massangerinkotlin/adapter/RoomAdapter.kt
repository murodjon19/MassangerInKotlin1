package com.example.massangerinkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.massangerinkotlin.R
import com.example.massangerinkotlin.model.Room
import com.google.android.material.imageview.ShapeableImageView

class RoomAdapter(var context: Context, var items:ArrayList<Room>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_room_view,parent,false)
            return RoomViewHolders(view)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val room = items[position]

            if (holder is RoomViewHolders) {
                var iv_profile = holder.iv_profile
                var tv_fullname = holder.tv_fullname
                iv_profile.setImageResource(room.profile)
                tv_fullname.text = room.fullname

            }
        }

        override fun getItemCount(): Int {
            return items.size
        }
    }

    class RoomViewHolders(view: View):RecyclerView.ViewHolder(view) {
        var iv_profile : ShapeableImageView
        var tv_fullname : TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile1)
            tv_fullname = view.findViewById(R.id.fullname)
        }

}