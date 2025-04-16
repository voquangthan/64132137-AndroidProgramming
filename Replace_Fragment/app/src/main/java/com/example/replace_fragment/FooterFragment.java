package com.example.replace_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FooterFragment extends Fragment {


    public FooterFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_footer,container,false);
        //
        Button Btn1=v.findViewById(R.id.btn1);
        Button Btn2=v.findViewById(R.id.btn2);
        Button Btn3=v.findViewById(R.id.btn3);

        //
        FragmentManager fragmentManager= getParentFragmentManager();
        //
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,new Fragmentone())
                        .commit();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,new Fragmentwo())
                        .commit();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,new Fragmenthree())
                        .commit();
            }
        });
        return v;
    }
}