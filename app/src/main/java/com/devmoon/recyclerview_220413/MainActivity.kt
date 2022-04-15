package com.devmoon.recyclerview_220413

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.devmoon.recyclerview_220413.adapters.ToDoRecyclerViewAdapter
import com.devmoon.recyclerview_220413.databinding.ActivityMainBinding
import com.devmoon.recyclerview_220413.datas.ToDoData

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mAdapter : ToDoRecyclerViewAdapter

    val mList = ArrayList<ToDoData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("산책 하기", true))
        mList.add(ToDoData("강아지 목욕 시키기", true))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("마감 정리 하기", false))
        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("집안일 하기", true))
        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("집안일 하기", false))
        mList.add(ToDoData("집안일 하기", false))

        mAdapter = ToDoRecyclerViewAdapter(applicationContext, mList)
        mAdapter.notifyDataSetChanged()
        binding.mainRecyclerView.adapter = mAdapter
        binding.mainRecyclerView.layoutManager = LinearLayoutManager(applicationContext)

    }


}