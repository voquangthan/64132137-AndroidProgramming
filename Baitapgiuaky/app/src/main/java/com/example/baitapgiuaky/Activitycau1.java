package com.example.baitapgiuaky;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activitycau1 extends AppCompatActivity {
    EditText Edit1;
    EditText Edit2;
    EditText Edit3;
    Button Btntinhtong;
    TextView Kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitycau1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Edit1=findViewById(R.id.edit1);
        Edit2=findViewById(R.id.edit2);
        Edit3=findViewById(R.id.edit3);
        Btntinhtong=findViewById(R.id.btntinhtong);
        Kq=findViewById(R.id.kq1);
        Btntinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1=Edit1.getText().toString();
                String text2=Edit2.getText().toString();
                int t1=Integer.parseInt(text1);
                int t2=Integer.parseInt(text2);
                int kq=t1+t2;
                Edit3.setText("kết quả là:"+kq);
            }
        });
    }
}