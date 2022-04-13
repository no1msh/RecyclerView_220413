package com.devmoon.recyclerview_220413.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.devmoon.recyclerview_220413.R
import com.devmoon.recyclerview_220413.datas.ToDoData

class ToDoRecyclerVIewAdapter(
    val mContext : Context,
    val mList : List<ToDoData>,
) : RecyclerView.Adapter<ToDoRecyclerVIewAdapter.MyViewHolder>() {

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val txtToDo = view.findViewById<TextView>(R.id.txt_list_item_toDo)
        val checkBoxToDoDid = view.findViewById<CheckBox>(R.id.checkbox_list_item_toDo_did)
        fun bind(data: ToDoData) {
            txtToDo.text = data.toDo
            checkBoxToDoDid.isChecked = data.toDoDid
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(mContext).inflate(R.layout.todo_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]

        holder.bind(data)
    }

    override fun getItemCount() = mList.size

}