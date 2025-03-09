package com.example.ex6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button Btn1;
    Button Btn2;
    void Dieukhien(){
         Btn1= findViewById(R.id.btn1);
         Btn2= findViewById(R.id.btn2);
    }
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
        Dieukhien();
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent 1 mang hinh hientai, 2 la button
                Intent IntentMH2= new Intent(MainActivity.this,MHH2Activity2.class);
                startActivity(IntentMH2);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentMH3= new Intent(MainActivity.this,MH3Activity.class);
                startActivity(IntentMH3);
            }
        });

    }


}