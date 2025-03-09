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

public class MH3Activity extends AppCompatActivity {
    Button Btn4;
    void Dieukhien(){
        Btn4=findViewById(R.id.btn4);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mh3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Dieukhien();
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent 1 mang hinh hientai, 2 la button
                Intent IntentMH3= new Intent(MH3Activity.this,MainActivity.class);
                startActivity(IntentMH3);
            }
        });

    }
}