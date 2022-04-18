package com.devmoon.recyclerview_220413

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.devmoon.recyclerview_220413.adapters.ToDoRcyAdapter
import com.devmoon.recyclerview_220413.databinding.ActivityMainBinding
import com.devmoon.recyclerview_220413.datas.ToDoData

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mAdapter : ToDoRcyAdapter

    val mList = ArrayList<ToDoData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mList.add(ToDoData("강아지 산책 시키기", false))
        mList.add(ToDoData("강아지 목욕 시키기", true))
        mList.add(ToDoData("강아지 산책 시키기", false))
        mList.add(ToDoData("강아지 산책 시키기", true))
        mList.add(ToDoData("설거지 하기", true))
        mList.add(ToDoData("강아지 산책 시키기", false))
        mList.add(ToDoData("공부 하기", true))
        mList.add(ToDoData("강아지 산책 시키기", false))
        mList.add(ToDoData("체조하기", true))
        mList.add(ToDoData("강아지 산책 시키기", false))
        mList.add(ToDoData("강아지 산책 시키기", false))
        mList.add(ToDoData("강아지 산책 시키기", true))
        mList.add(ToDoData("강아지 산책 시키기", false))

        mAdapter = ToDoRcyAdapter(applicationContext,mList)
        mAdapter.notifyDataSetChanged()
        binding.mainRcyTodo.adapter = mAdapter
        binding.mainRcyTodo.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)

    }


}