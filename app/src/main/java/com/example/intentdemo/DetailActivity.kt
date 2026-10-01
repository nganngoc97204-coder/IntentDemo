package com.example.intentdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvReceivedData = findViewById<TextView>(R.id.tvReceivedData)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Nhận dữ liệu từ Bundle extras
        val bundle = intent.extras
        if (bundle != null) {
            val receivedText = bundle.getString("EXTRA_TEXT", "Không có dữ liệu")
            tvReceivedData.text = "Dữ liệu nhận được từ MH1:\n$receivedText"
        }

        // Đóng Activity này để back về Màn hình 1
        btnBack.setOnClickListener {
            finish()
        }
    }
}