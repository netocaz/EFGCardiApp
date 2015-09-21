package com.example.netocaz.cardiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mediciones extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediciones);

        View btnregistrarpulso = findViewById(R.id.btnregistrarpulso);
        View btnmeta = findViewById(R.id.btnmeta);
        btnregistrarpulso.setOnClickListener(this);
        btnmeta.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btnregistrarpulso) {
            Intent abrir = new Intent(this, MyActivity.class);
            startActivity(abrir);
        }else if(v.getId()==R.id.btnmeta){
            Intent abrir = new Intent(this, Meta.class);
            startActivity(abrir);
        }
    }
}
