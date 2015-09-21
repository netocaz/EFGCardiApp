package com.example.netocaz.cardiapp;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Meta extends Activity implements OnClickListener {

    CheckBox checkBox;
    EditText metaeditText;
    Button buttonmeta;
    EditText metaeditText2;
    String sistolica;
    String diastolica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meta);


        metaeditText = (EditText) findViewById(R.id.metaeditText1);
        metaeditText2 = (EditText) findViewById(R.id.metaeditText2);
        buttonmeta = (Button) findViewById(R.id.buttonsavemeta);
        buttonmeta.setOnClickListener(this);
        loadSavedPreferences();
    }

    private void loadSavedPreferences() {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(this);
        SharedPreferences sp2= PreferenceManager
                .getDefaultSharedPreferences(this);

        sistolica = sp.getString("NAME", "0");
        diastolica = sp2.getString("NAME2", "0");



        metaeditText.setText(sistolica);
        metaeditText2.setText(diastolica);

    }

    private void savePreferences(String key, boolean value) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(this);
        SharedPreferences sp2 = PreferenceManager
                .getDefaultSharedPreferences(this);

        Editor edit = sp.edit();
        Editor edit2 = sp2.edit();

        edit.putBoolean(key, value);
        edit.commit();
        edit2.putBoolean(key, value);
        edit2.commit();
    }

    private void savePreferences(String key, String value) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(this);
        Editor edit = sp.edit();
        edit.putString(key, value);
        edit.commit();
        SharedPreferences sp2 = PreferenceManager
                .getDefaultSharedPreferences(this);
        Editor edit2 = sp2.edit();
        edit2.putString(key, value);
        edit2.commit();
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        savePreferences("NAME", metaeditText.getText().toString());
        savePreferences("NAME2", metaeditText2.getText().toString());
        Intent abrir = new Intent(this, Meta.class);
        abrir.putExtra("valor", sistolica);
        abrir.putExtra("valor2", diastolica);
        startActivity(abrir);
        Toast.makeText(this, "Guardado", Toast.LENGTH_LONG).show();




    }

}