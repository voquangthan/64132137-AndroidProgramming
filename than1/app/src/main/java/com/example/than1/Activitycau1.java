package com.example.than1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activitycau1 extends AppCompatActivity {
    EditText  Edit1;
    EditText  Edit2;
    EditText  Edit3;
    Button Btntinhtong;
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
        Btntinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a1=Edit1.getText().toString();
                String a2=Edit2.getText().toString();
                Integer aa1=Integer.parseInt(a1);
                Integer aa2=Integer.parseInt(a2);
                Integer kq=aa1+aa2;
                Edit3.setText("kết quả là:"+kq);
            }
        });
    }
}