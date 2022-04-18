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
    val mContext : Context,
    val mList : List<ToDoData>
) : RecyclerView.Adapter<ToDoRcyAdapter.MyViewHolder>(){

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val txtToDo : TextView = view.findViewById(R.id.rcy_list_item_txt_todo)
        val cbToDoDid : CheckBox = view.findViewById(R.id.rcy_list_item_cb_todo_did)

        init {
            view.setOnClickListener {
                val position : Int = adapterPosition
                Toast.makeText(mContext, "${position+1}번째 데이터입니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.rcy_todo_list_item , parent , false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        // 실제 데이터를 표시할 뷰에 데이터를 넣는 작업
        holder.txtToDo.text = mList[position].toDo
        holder.cbToDoDid.isChecked = mList[position].toDoDid

    }

    override fun getItemCount() = mList.size
}