package com.devmoon.recyclerview_220413

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.devmoon.recyclerview_220413.adapters.TodayToDoRecyclerViewAdapter
import com.devmoon.recyclerview_220413.databinding.ActivityMainBinding
import com.devmoon.recyclerview_220413.datas.TodayToDoData

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    val mTodayToDoList = ArrayList<TodayToDoData>()

    lateinit var mAdapter : TodayToDoRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mTodayToDoList.add(TodayToDoData("집 청소하기", false))
        mTodayToDoList.add(TodayToDoData("문제 풀기", true))
        mTodayToDoList.add(TodayToDoData("집 청소하기", false))
        mTodayToDoList.add(TodayToDoData("집 청소하기", true))
        mTodayToDoList.add(TodayToDoData("집 청소하기", false))
        mTodayToDoList.add(TodayToDoData("집 청소하기", true))
        mTodayToDoList.add(TodayToDoData("집 청소하기", false))
        mTodayToDoList.add(TodayToDoData("집 청소하기", true))
        mTodayToDoList.add(TodayToDoData("집 청소하기", false))
        mAdapter = TodayToDoRecyclerViewAdapter(applicationContext,mTodayToDoList)
        mAdapter.notifyDataSetChanged()

        binding.recyclerViewTodayTodo.adapter = mAdapter
        binding.recyclerViewTodayTodo.layoutManager = LinearLayoutManager(applicationContext)

    }



}