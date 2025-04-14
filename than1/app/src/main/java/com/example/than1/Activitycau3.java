package com.example.than1;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Activitycau3 extends AppCompatActivity {
    LandscapeAdapter landscapeAdapter;
    ArrayList<Landscape> recylerviewdata;
    RecyclerView recyclerViewlandscape;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitycau3);

        // Khởi tạo RecyclerView
        recyclerViewlandscape = findViewById(R.id.recyclerland);
        recylerviewdata = getdataforrecylerview();

        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewlandscape.setLayoutManager(layoutLinear);

        // Gọi đúng constructor của Adapter (Đổi thứ tự tham số)
        landscapeAdapter = new LandscapeAdapter(recylerviewdata, this);
        recyclerViewlandscape.setAdapter(landscapeAdapter);
    }


    ArrayList<Landscape> getdataforrecylerview() {
        ArrayList<Landscape> dsdulieu = new ArrayList<>();
        dsdulieu.add(new Landscape("meme1", "Cột cờ Hà Nội"));
        dsdulieu.add(new Landscape("meme2", "Cột cờ Sài Gòn"));
        dsdulieu.add(new Landscape("meme3", "Cột cờ Khánh Hòa"));

        return dsdulieu;
    }

}