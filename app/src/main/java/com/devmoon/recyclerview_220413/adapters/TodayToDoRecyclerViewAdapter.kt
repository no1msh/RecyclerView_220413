package com.devmoon.recyclerview_220413.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.devmoon.recyclerview_220413.R
import com.devmoon.recyclerview_220413.datas.TodayToDoData

// 1. RecyclerView.Adapter 상속받기
// 2. inner class로 RecyclerView.ViewHolder()를 상속 받기
// 3. 추상 메소드 onCreateViewHolder() , onBindViewHolder() , onItemCount() 구현
// 4. 필요 멤버변수 생성자로 받음 Context와 데이터를 받을 List<받을 데이터 클래스> 구현 (resId 는 받지 않아도 됨)
// 5. getItexCount() = mList.size
// 6. onCreateViewHolder() 구현
// 7. onBindViewHolder() 구현

class TodayToDoRecyclerViewAdapter(
    val mContext: Context,
    val mList: List<TodayToDoData> // ListView와는 다르게 ViewHolder를 사용하면 resId를 안받아도 됨
) : RecyclerView.Adapter<TodayToDoRecyclerViewAdapter.MyViewHolder>() {

    //    클래스 내부의 클래스 제작
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

//        멤버 변수로, view 변수 내부에서 실제 사용할 UI들을 가져와서 담아두자.

        val txtTodayTodo = view.findViewById<TextView>(R.id.txt_list_item_todo)
        val checkBoxTodoDid = view.findViewById<CheckBox>(R.id.checkbox_list_item_did)

//        함수로, 실 데이터를 넘겨받아서, 멤벼변수의 UI 태그들과 결합하는 기능 추가.
        fun bind(data : TodayToDoData) {
            txtTodayTodo.text = data.todayTodo
            checkBoxTodoDid.isChecked = data.did
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(mContext).inflate(R.layout.today_todo_list_item, parent, false)
        return MyViewHolder( view )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // 실제 출력할 데이터를 관리

        val data = mList[position]

        // MyViewHolder도 일종의 클래스 이기 떄문에 멤버변수와 함수를 가지고 있을 수 있다.

        holder.bind(data)
    }

    override fun getItemCount() = mList.size // 목록의 갯수가 리턴
}