package com.hihusky.views

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var circleViewBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        circleViewBtn = findViewById<Button>(R.id.circle_view_button)
        circleViewBtn.setOnClickListener {
            val circleViewIntent: Intent =
                Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(circleViewIntent)
        }
    }
}
