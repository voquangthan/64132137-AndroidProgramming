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
        val Chieucao = findViewById<EditText>(R.id.input1)
        val Cannang = findViewById<EditText>(R.id.input2)
        val btn = findViewById<Button>(R.id.btn)
        val Kq = findViewById<TextView>(R.id.kq)

        btn.setOnClickListener{
            TinhToan(
                Chieucao, Cannang, Kq,
            )
        }
    }
    private fun TinhToan(Chieucao:EditText,Cannang:EditText,Kq:TextView){
                val a=Chieucao.text.toString().toDouble()
                val b=Cannang.text.toString().toDouble()
                val BMI=b/(a*a)
                val KetQua= when{
                    BMI < 18.5 -> "cân nặng thấp gầy"
                    BMI in 18.5..24.9 -> "bình thường"
                    BMI in 25.0..29.9 ->"tiền béo phì"
                    BMI in 30.0..34.9 ->"béo phì 1"
                    BMI in 35.0..39.9 ->"béo phì 2"
                    BMI >=40.0 ->"béo phì 3"
                    else -> "ko xác định"
                }
            Kq.text="Kết quả là:$KetQua"

    }
}