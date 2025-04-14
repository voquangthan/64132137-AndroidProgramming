package com.example.autocompletetv;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView Auto1= findViewById(R.id.auto1);
        ArrayList<String> mang1=new ArrayList<>();
        mang1.add("AAAAA");
        mang1.add("ABBBB");
        mang1.add("ACCCC");
        mang1.add("ADDDD");
        mang1.add("AEEEE");
        // b3 tao
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,mang1);
        //b4
        Auto1.setAdapter(adapter);
    }
}
