package com.devmoon.recyclerview_220413

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.devmoon.recyclerview_220413.adapters.ToDoRecyclerVIewAdapter
import com.devmoon.recyclerview_220413.databinding.ActivityMainBinding
import com.devmoon.recyclerview_220413.datas.ToDoData

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val mToDoList = ArrayList<ToDoData>()

    lateinit var mAdapter : ToDoRecyclerVIewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        mToDoList.add(ToDoData("집안일 하기",false))
        mToDoList.add(ToDoData("산책 하기",true))
        mToDoList.add(ToDoData("강아지 목욕 시키기",false))
        mToDoList.add(ToDoData("집안일 하기",false))
        mToDoList.add(ToDoData("집안일 하기",false))
        mToDoList.add(ToDoData("집안일 하기",false))
        mToDoList.add(ToDoData("집안일 하기",false))
        mToDoList.add(ToDoData("집안일 하기",false))
        mToDoList.add(ToDoData("집안일 하기",false))
        mToDoList.add(ToDoData("집안일 하기",false))

        mAdapter = ToDoRecyclerVIewAdapter(applicationContext , mToDoList)
        mAdapter.notifyDataSetChanged()

        binding.recyclerViewToDo.adapter = mAdapter

        binding.recyclerViewToDo.layoutManager = LinearLayoutManager(applicationContext)


    }



}