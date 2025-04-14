package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Ánh xạ ListView
        listView = findViewById(R.id.listView);

        // 2. Chuẩn bị dữ liệu (ArrayList)
        dataList = new ArrayList<>();
        dataList.add("Android");
        dataList.add("iOS");
        dataList.add("Windows");
        dataList.add("MacOS");
        dataList.add("Linux");

        // 3. Tạo Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,  // Layout có sẵn
                dataList
        );

        // 4. Gắn Adapter vào ListView
        listView.setAdapter(adapter);

        // 5. Xử lý sự kiện click vào ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy giá trị phần tử được chọn
                String selectedItem = dataList.get(position);

                // Hiển thị thông báo
                Toast.makeText(MainActivity.this, "Bạn chọn: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
