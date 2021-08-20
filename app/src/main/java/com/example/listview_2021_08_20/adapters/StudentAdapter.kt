package com.example.listview_2021_08_20.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listview_2021_08_20.R
import com.example.listview_2021_08_20.datas.StudentData

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList){


    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var tempRow = convertView

        if (tempRow==null) {
            tempRow = mInflater.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        return row

    }

}