package voquangthan.bai5

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
        val Soa= findViewById<EditText>(R.id.input1)
        val Sob= findViewById<EditText>(R.id.input2)
        val Cong= findViewById<Button>(R.id.btncong)
        val Tru= findViewById<Button>(R.id.btntru)
        val Chia= findViewById<Button>(R.id.btnchia)
        val KQ= findViewById<TextView>(R.id.kq)
       Tru.setOnClickListener(){
            Tong(Soa,Sob,KQ)
       }
        Cong.setOnClickListener(){
            Hieu(Soa,Sob,KQ)

        }
        Chia.setOnClickListener(){
            Tich(Soa,Sob,KQ)

        }



    }
    private fun Tong(Soa:EditText,Sob:EditText,KQ:TextView){
        val A=Soa.text.toString().toInt()
        val B=Sob.text.toString().toInt()
        val rs=A+B
        KQ.text="KQ là:$rs"
    } private fun Hieu(Soa:EditText,Sob:EditText,KQ:TextView){
        val A=Soa.text.toString().toInt()
        val B=Sob.text.toString().toInt()
        val rs=A-B
        KQ.text="KQ là:$rs"
    } private fun Tich(Soa:EditText,Sob:EditText,KQ:TextView){
        val A=Soa.text.toString().toInt()
        val B=Sob.text.toString().toInt()
        val rs=A*B
        KQ.text="KQ là:$rs"
    }
}