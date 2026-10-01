package com.example.intentdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etInputData = findViewById<EditText>(R.id.etInputData)
        val btnSend = findViewById<Button>(R.id.btnSend)

        btnSend.setOnClickListener {
            val dataText = etInputData.text.toString()

            val intent = Intent(this, DetailActivity::class.java)

            // Đóng gói dữ liệu vào Bundle
            val bundle = Bundle().apply {
                putString("EXTRA_TEXT", dataText)
            }

            // Truyền Bundle vào Intent
            intent.putExtras(bundle)

            startActivity(intent)
        }
    }
}