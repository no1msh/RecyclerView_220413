package com.devmoon.recyclerview_220413.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.devmoon.recyclerview_220413.R
import com.devmoon.recyclerview_220413.datas.ToDoData

class ToDoRcyAdapter(
    val mContext: Context,
    val mList: List<ToDoData>
) : RecyclerView.Adapter<ToDoRcyAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    init {
        view.setOnClickListener {
            val position : Int = adapterPosition
            Toast.makeText(mContext, "${position+1}번째 todo 체크여부 : ${mList[position].toDoDid}", Toast.LENGTH_SHORT).show()
        }
    }
        val txtToDo: TextView = view.findViewById(R.id.txt_todo_list_item)
        val cbToDoDid: CheckBox = view.findViewById(R.id.cb_todo_list_item_did)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.rcy_todo_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.txtToDo.text = mList[position].toDo
        holder.cbToDoDid.isChecked = mList[position].toDoDid

    }

    override fun getItemCount() = mList.size
}