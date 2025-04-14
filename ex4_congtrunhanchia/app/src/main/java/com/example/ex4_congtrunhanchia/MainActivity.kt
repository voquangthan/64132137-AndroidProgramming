package com.example.ex4_congtrunhanchia

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
        val a= findViewById<EditText>(R.id.input1)
        val b= findViewById<EditText>(R.id.input2)
        val BtnCong= findViewById<Button>(R.id.btncong)
        val BtnTru= findViewById<Button>(R.id.btntru)
        val BtnNhan= findViewById<Button>(R.id.btnn)
        val BtnChia= findViewById<Button>(R.id.btnchia)
        val KQ= findViewById<TextView>(R.id.kq)
        BtnCong.setOnClickListener{
            TinhTong(a, b, KQ)
        }
        BtnTru.setOnClickListener{
            Tru(a, b, KQ)
        }
        BtnNhan.setOnClickListener{
            Nhan(a, b, KQ)
        }
        BtnChia.setOnClickListener{
            Chia(a, b, KQ)
        }


    }
    private fun TinhTong(a:EditText,b:EditText,KQ:TextView){
        val soa=a.text.toString().toInt()
        val sob=b.text.toString().toInt()
        val sum=soa+sob
        KQ.text="kết quả cộng là: $sum"
    }
    private fun Tru(a:EditText,b:EditText,KQ:TextView){
        val soa=a.text.toString().toInt()
        val sob=b.text.toString().toInt()
        val hieu=soa-sob
        KQ.text="kết quả trừ là: $hieu"
    }
    private fun Nhan(a:EditText,b:EditText,KQ:TextView){
        val soa=a.text.toString().toInt()
        val sob=b.text.toString().toInt()
        val tich=soa*sob
        KQ.text="kết quả nhân là: $tich"
    }
    private fun Chia(a:EditText,b:EditText,KQ:TextView){
        val soa=a.text.toString().toInt()
        val sob=b.text.toString().toInt()
        val thuong=soa-sob
        KQ.text="kết quả chia là: $thuong"
    }
}