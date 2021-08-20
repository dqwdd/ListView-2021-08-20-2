package com.example.listview_2021_08_20.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listview_2021_08_20.datas.StudentData

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList){
}