package com.example.myapplication4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication4.R;

import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.ItemLandholder> {
    Context context;
    ArrayList<Landscape> lstData;

    public LandscapeAdapter(ArrayList<Landscape> lstData, Context context) {
        this.lstData = lstData;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemLandholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom= LayoutInflater.from(context);
        View vitem= cai_bom.inflate(R.layout.item_land,parent,false);
        ItemLandholder hodercreated= new ItemLandholder(vitem);

        return hodercreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandholder holder, int position) {
        Landscape landscapehienthi= lstData.get(position);
        String caption= landscapehienthi.getLandcation();
        String tenanh= landscapehienthi.getLandimage();
        holder.tvcaption.setText(caption);
        String packageName=holder.itemView.getContext().getPackageName();
        int imageId=holder.itemView.getResources().getIdentifier(tenanh,"mipmap",packageName);
        holder.imageviewlandscape.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandholder extends RecyclerView.ViewHolder{
        TextView tvcaption;
        ImageView imageviewlandscape;

        public ItemLandholder(@NonNull View itemView) {
            super(itemView);
            tvcaption=itemView.findViewById(R.id.textviewcaption);
            imageviewlandscape=itemView.findViewById(R.id.imageViewland);

        }
    }
}
