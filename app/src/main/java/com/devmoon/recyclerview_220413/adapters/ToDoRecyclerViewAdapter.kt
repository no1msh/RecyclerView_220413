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

class ToDoRecyclerViewAdapter(
    val mContext : Context,
    val mList : List<ToDoData>,
) : RecyclerView.Adapter<ToDoRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val txtToDo = view.findViewById<TextView>(R.id.txt_list_item_todo)
        val cbToDoDid = view.findViewById<CheckBox>(R.id.cb_list_item_todo_did)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.todo_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.txtToDo.text = mList[position].toDo
        holder.cbToDoDid.isChecked = mList[position].toDoDid
    }

    override fun getItemCount() = mList.size
}