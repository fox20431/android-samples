package com.hihusky.views

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class ListViewActivity: AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        listView = findViewById(R.id.list_view)

        // 创建数据源
        val data = arrayOf("item1", "item2", "item3", "item4")

        // 创建适配器
        val adapter = ArrayAdapter(this, R.layout.list_item, data)

        // 设置适配器

        // 设置适配器
        listView.adapter = adapter
    }
}