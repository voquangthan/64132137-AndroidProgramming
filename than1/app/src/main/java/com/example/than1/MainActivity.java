package com.example.than1;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
=======
import android.os.Bundle;
>>>>>>> acc72e5386ff2e307414f2dcba25a26eabaae0a5

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
<<<<<<< HEAD
    Button Btn1;
    Button Btn2;
    Button Btn3;
    Button Btn4;
=======

>>>>>>> acc72e5386ff2e307414f2dcba25a26eabaae0a5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
<<<<<<< HEAD
        Btn1=findViewById(R.id.btn1);
        Btn2=findViewById(R.id.btn2);
        Btn3=findViewById(R.id.btn3);
        Btn4=findViewById(R.id.btn4);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Activitycau1.class);
                startActivity(intent);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Activitycau2.class);
                startActivity(intent);
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Activitycau3.class);
                startActivity(intent);
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Activitycau4.class);
                startActivity(intent);
            }
        });

=======
>>>>>>> acc72e5386ff2e307414f2dcba25a26eabaae0a5
    }
}