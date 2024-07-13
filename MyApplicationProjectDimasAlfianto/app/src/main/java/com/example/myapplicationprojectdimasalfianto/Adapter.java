package com.example.myapplicationprojectdimasalfianto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter{
    LayoutInflater layoutInflater;
    Context context;
    ArrayList<Data_mahasiswa> model;

    Adapter(Context context, ArrayList<Data_mahasiswa> model)
    {
        this.context=context;
        this.layoutInflater=LayoutInflater.from(context);
        this.model=model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int index) {
        return model.get(index);
    }

    @Override
    public long getItemId(int posision) {
        return posision;
    }

    TextView nama,nim;
    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        View view1=layoutInflater.inflate(R.layout.list_item,viewGroup,false);
        nama=view1.findViewById(R.id.nama);
        nim=view1.findViewById(R.id.nim);

        nama.setText(model.get(index).getNama());
        nim.setText(model.get(index).getNim());
        return view1;



    }

}
