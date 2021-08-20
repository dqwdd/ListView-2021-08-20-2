package com.example.listview_2021_08_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_2021_08_20.adapters.StudentAdapter
import com.example.listview_2021_08_20.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter : StudentAdapter
//    멤버변수니까 m으로 이름 짓기


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mStudentList.add( StudentData("유병재", 1995, "경기도 부천 상동"))
        mStudentList.add( StudentData("권유진", 1996, "서울시 강남구"))
        mStudentList.add( StudentData("김경윤", 1997, "경기도 파주시"))
        mStudentList.add( StudentData("김현우", 1996, "서울시 마포구"))
        mStudentList.add( StudentData("김현지", 1995, "서울시 은평구"))
        mStudentList.add( StudentData("김희섭", 1989, "서울시 관악구"))


//      StudentAdapter(어디서, 어떤 모양으로 쓸지, 어떤 목록을 뿌릴지 순서로 데이터 넣음)
        mAdapter = StudentAdapter( this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

    }
}