package com.example.bottomnavigationview;

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
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int menuduocchon=item.getItemId();
                if(menuduocchon == R.id.btn_home ){
                    Toast.makeText(MainActivity.this,"thay home",Toast.LENGTH_SHORT).show();
                }
                else if(menuduocchon==R.id.btn_profile){
                    Toast.makeText(MainActivity.this,"thay profile",Toast.LENGTH_SHORT).show();

                }
                else if(menuduocchon==R.id.btn_search){
                    Toast.makeText(MainActivity.this,"thay search",Toast.LENGTH_SHORT).show();

                }
                else{
                    return false;
                }
                return false;
            }
        });
    }
}