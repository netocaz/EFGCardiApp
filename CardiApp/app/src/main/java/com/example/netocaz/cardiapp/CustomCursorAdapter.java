package com.example.netocaz.cardiapp;

/**
 * Created by NeToCaZ on 19/09/2015.
 */
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;


public class CustomCursorAdapter extends CursorAdapter {

    public CustomCursorAdapter(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // when the view will be created for first time,
        // we need to tell the adapters, how each item will look
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View retView = inflater.inflate(R.layout.single_row_item, parent, false);

        return retView;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // here we are setting our data
        // that means, take the data from the cursor and put it in views

        TextView textViewPersonName = (TextView) view.findViewById(R.id.tv_person_name);
        textViewPersonName.setText("Fecha: " + cursor.getString(cursor.getColumnIndex(cursor.getColumnName(1))));

        TextView textViewPersonPIN = (TextView) view.findViewById(R.id.tv_person_pin);
        textViewPersonPIN.setText("Presión Arterial (Sistólica/Diastólica):\n" + cursor.getString(cursor.getColumnIndex(cursor.getColumnName(2)))+"/"+
                cursor.getString(cursor.getColumnIndex(cursor.getColumnName(3)))+ " mmHg");

       // TextView textViewPersonPINdos = (TextView) view.findViewById(R.id.tv_person_pindos);
       // textViewPersonPINdos.setText("Diastólica: " + cursor.getString(cursor.getColumnIndex(cursor.getColumnName(3)))+" mmHg");

        TextView textViewPersonPINtres = (TextView) view.findViewById(R.id.tv_person_pintres);
        textViewPersonPINtres.setText("Pulso: "+ cursor.getString(cursor.getColumnIndex(cursor.getColumnName(4))));
    }
}