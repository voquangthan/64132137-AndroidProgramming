package com.example.ex7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mh2Activity extends AppCompatActivity {
    final String  tendangnhap="voquangthan";
    final  String  pass="123";
    EditText Edit1;
    EditText Edit2;
    EditText Edit3;
    Button Btn2;
    void Dieukhien(){
        Edit1=findViewById(R.id.edit1);
        Edit2=findViewById(R.id.edit2);
        Edit3=findViewById(R.id.edit3);
        Btn2=findViewById(R.id.btn2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mh2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Dieukhien();
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuly();
            }
        });

    }
    void Xuly(){
        String name1=Edit1.getText().toString();
        String name2=Edit2.getText().toString();
        String name3=Edit3.getText().toString();
        if (name1.equals(tendangnhap) && name2.equals(pass)){
            Intent Itnmh2= new Intent(Mh2Activity.this,MH3Activity.class);
            Itnmh2.putExtra("USERNAME",name1);
            startActivity(Itnmh2);
        }
        else {
            Toast.makeText(this, "Đăng nhập thất bại!", Toast.LENGTH_SHORT).show();

          }
        }
    }
