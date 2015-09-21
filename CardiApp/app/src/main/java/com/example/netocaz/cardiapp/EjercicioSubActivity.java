package com.example.netocaz.cardiapp;

/**
 * Created by NeToCaZ on 20/09/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

public class EjercicioSubActivity extends Activity{

    TextView tv;
    TextView tvdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        setContentView(R.layout.sub_activity);
        super.onCreate(savedInstanceState);
        tv =(TextView)findViewById(R.id.tv);
        tvdesc =(TextView)findViewById(R.id.tvdesc);
        Intent intent = getIntent();
        String text = intent.getExtras().getString("thanhcs");
        String textdesc = intent.getExtras().getString("HOL");
        ArrayList<Integer> imagen = intent.getIntegerArrayListExtra("IMA");
        int p = intent.getExtras().getInt("valor");
        tv.setText(text);
        tvdesc.setText(textdesc);

        ImageView img2 = (ImageView)findViewById(R.id.imageView2);
        img2.setImageResource(imagen.get(p));






    }
}