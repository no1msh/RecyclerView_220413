package com.devmoon.recyclerview_220413

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
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

        mList.add(ToDoData("집안일 하기",false))
        mList.add(ToDoData("집안일 하기",false))
        mList.add(ToDoData("병원 가기",false))
        mList.add(ToDoData("집안일 하기",true))
        mList.add(ToDoData("집안일 하기",true))
        mList.add(ToDoData("백신 맞기",true))
        mList.add(ToDoData("집안일 하기",true))
        mList.add(ToDoData("헤더 부분 수정",false))
        mList.add(ToDoData("집안일 하기",false))
        mList.add(ToDoData("집안일 하기",true))
        mList.add(ToDoData("1 커밋 하기",true))
        mList.add(ToDoData("집안일 하기",false))
        mList.add(ToDoData("그외 등등",false))

        mAdapter = ToDoRecyclerViewAdapter(applicationContext,mList)
        mAdapter.notifyDataSetChanged()
        binding.mainRecyclerview.adapter = mAdapter
        binding.mainRecyclerview.layoutManager = GridLayoutManager(applicationContext, 2)
    }


}