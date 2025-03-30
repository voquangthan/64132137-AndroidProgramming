package com.example.testluyentap;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ActivityCau2 extends AppCompatActivity {
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    lv1=findViewById(R.id.lv1);
    ArrayList<String> mang= new ArrayList<>();
    mang.add("xin chào 1");
    mang.add("xin chào 2");
    mang.add("xin chào 3");
    mang.add("xin chào 4");
    mang.add("xin chào 5");
    ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,mang);
    lv1.setAdapter(adapter);
    lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String a=  mang.get(position);
            Toast.makeText(ActivityCau2.this,"bạn đã chọn :"+a,Toast.LENGTH_SHORT).show();

        }
    });
    }
}