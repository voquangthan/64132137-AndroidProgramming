package com.example.tinhbmi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Chieucao = findViewById<TextView>(R.id.input1)
        val Cannang = findViewById<TextView>(R.id.input2)
        val btn = findViewById<Button>(R.id.btn)
        val Kq = findViewById<EditText>(R.id.kq)

        btn.setOnClickListener{

        }
    }
    private fun TinhToan(Chieucao:TextView,Cannang:TextView,Kq:EditText){
                val a=Chieucao.text.toString().toDouble()
                val b=Cannang.text.toString().toDouble()
                if()
    }
}