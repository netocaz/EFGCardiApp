package com.example.netocaz.cardiapp;
/**
 * Created by NeToCaZ on 19/09/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.Date;

public class EnterDataActivity extends Activity {

    EditText editTextPersonName;
    EditText editTextPersionPIN;
    EditText editTextPersionPINdos;
    EditText editTextPersionPINtres;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_data);


        EditText timetext = (EditText) findViewById(R.id.et_person_name);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());
        timetext.setText(currentDateandTime);


        editTextPersonName = (EditText) findViewById(R.id.et_person_name);
        editTextPersionPIN = (EditText) findViewById(R.id.et_person_pin);
        editTextPersionPINdos = (EditText) findViewById(R.id.et_person_pindos);
        editTextPersionPINtres = (EditText) findViewById(R.id.et_person_pintres);
    }

    public void onClickAdd (View btnAdd) {

        String personName = editTextPersonName.getText().toString();
        String personPIN = editTextPersionPIN.getText().toString();
        String personPINdos = editTextPersionPINdos.getText().toString();
        String personPINtres = editTextPersionPINtres.getText().toString();

        if ( personName.length() != 0 && personPIN.length() != 0 && personPINdos.length() != 0 && personPINtres.length() != 0   ) {

            Intent newIntent = getIntent();
            newIntent.putExtra("tag_person_name", personName);
            newIntent.putExtra("tag_person_pin", personPIN);
            newIntent.putExtra("tag_person_pindos", personPINdos);
            newIntent.putExtra("tag_person_pintres", personPINtres);

            this.setResult(RESULT_OK, newIntent);
            Toast.makeText(this, "GUARDADO", Toast.LENGTH_LONG).show();
            finish();
        }
    }
}