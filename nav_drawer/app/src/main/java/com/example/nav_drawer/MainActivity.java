package com.example.nav_drawer;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
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
        bottomNavigationView=findViewById(R.id.botnav1);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int duocchon= item.getItemId();
                if(duocchon==R.id.menu_home){
                    Toast.makeText(MainActivity.this,"đây là home",Toast.LENGTH_SHORT).show();
                }
                else  if(duocchon==R.id.menu_search){
                    Toast.makeText(MainActivity.this,"đây là search",Toast.LENGTH_SHORT).show();
                }
                else  if(duocchon==R.id.menu_profile){
                    Toast.makeText(MainActivity.this,"đây là profile",Toast.LENGTH_SHORT).show();
                }
                else {
                    return false;
                }
                return true;
            }
        });
    }
}