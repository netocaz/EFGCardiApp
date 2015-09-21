package com.example.netocaz.cardiapp;

/**
 * Created by NeToCaZ on 20/09/2015.
 */
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.sax.RootElement;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;



public class EjercicioCustomeArrayAdapter extends ArrayAdapter<String>{
    Context context;
    ArrayList<String> arrString;


    private LayoutInflater inflater;

    EjercicioCustomeArrayAdapter(Activity context,
                        ArrayList<String> arrString) {
        super(context, R.layout.single_item, arrString);
        this.context = context;
        this.arrString = arrString;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



    }

    @Override
    public Context getContext() {
        return super.getContext();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public View getView(final int position,View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.single_item, null);
        TextView tv= (TextView)convertView.findViewById(R.id.tv);
        ImageView img = (ImageView)convertView.findViewById(R.id.imageView1);
        tv.setText(arrString.get(position));


        return convertView;

    }
}