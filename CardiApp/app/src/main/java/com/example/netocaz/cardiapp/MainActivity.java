package com.example.netocaz.cardiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btntip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btn = findViewById(R.id.btn1);
        View btntip = findViewById(R.id.btntip);
        View btnhta = findViewById(R.id.btnhta);
        View btnvideos =findViewById(R.id.btnvideos);
        View btnbuencomer =findViewById(R.id.btnbuencomer);
        View btnejercicio = findViewById(R.id.btnejercicio);
        btn.setOnClickListener(this);
        btntip.setOnClickListener(this);
        btnhta.setOnClickListener(this);
        btnvideos.setOnClickListener(this);
        btnbuencomer.setOnClickListener(this);
        btnejercicio.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn1) {
            Intent abrir = new Intent(this, Mediciones.class);
            startActivity(abrir);
        }else if (v.getId()==R.id.btntip){
            Intent abrir = new Intent(this, Tips.class);
            startActivity(abrir);
        }else if(v.getId()==R.id.btnhta){
            Intent abrir = new Intent(this, HTA.class);
            startActivity(abrir);
        }else if(v.getId()==R.id.btnvideos){
            Intent abrir = new Intent(this, Videos.class);
            startActivity(abrir);
        }
        else if(v.getId()==R.id.btnbuencomer){
            //Intent abrir = new Intent(this, BuenComer.class);
            // startActivity(abrir);
            Toast.makeText(this, "bUEN COMER", Toast.LENGTH_LONG).show();
        }

        else if(v.getId()==R.id.btnejercicio) {
            Intent abrir = new Intent(this, EjercicioMainActivity.class);
            startActivity(abrir);

        }
    }
}
