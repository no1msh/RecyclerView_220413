package com.devmoon.recyclerview_220413

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("드라마 보기", true))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("컴퓨터 하기", true))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("그래픽 카드 사기", true))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("넷플릭스 구독하기", true))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("강아지 산책 시키기", true))
        mList.add(ToDoData("장보기", true))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("장보기", true))
        mList.add(ToDoData("장보기", false))
        mList.add(ToDoData("장보기", false))

        mAdapter = ToDoRcyAdapter(applicationContext, mList) // mAdapter에 ToDoRcyAdapter() 생성자로 대입
        mAdapter.notifyDataSetChanged() // mAdapter에 데이터 수정 알리기
        binding.mainRcyTodo.adapter = mAdapter // 리사이클러뷰에 어댑터 연결
        binding.mainRcyTodo.layoutManager = GridLayoutManager(applicationContext,4,GridLayoutManager.HORIZONTAL,false) // 리사이클러뷰의 아이템이 어떻게 표시될지 결정
    }


}