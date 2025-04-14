package voquangthan64132137.tinhtong

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
        val Inputa= findViewById<EditText>(R.id.inputa)
        val Inputb= findViewById<EditText>(R.id.inputb)
        val Button1= findViewById<Button>(R.id.btn1)
        val Result= findViewById<TextView>(R.id.result)
        Button1.setOnClickListener{
            TinhTong(Inputa,Inputb,Result)

        }

    }
    private  fun TinhTong(Inputa:EditText,Inputb:EditText,Result:TextView){
        val a=Inputa.text.toString().toInt()
        val b=Inputb.text.toString().toInt()
        val sum=a+b;
        Result.text="kết quả là : $sum"
    }
}