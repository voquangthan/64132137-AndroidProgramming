package com.example.thunghiem100;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandscapeAdapter landscapeAdapter;
    ArrayList<Landscape> recylerviewdata;
    RecyclerView recyclerViewlandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

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
        dsdulieu.add(new Landscape("login", "Cột cờ Hà Nội"));
        dsdulieu.add(new Landscape("a2", "ảnh a2"));
        dsdulieu.add(new Landscape("a1", "ảnh a1"));

        return dsdulieu;
    }
}
