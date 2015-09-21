package com.example.netocaz.cardiapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Videos extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_videos);
        View btnvid1 =findViewById(R.id.btnvid1);
        btnvid1.setOnClickListener(this);
        View btnvid2 =findViewById(R.id.btnvid2);
        btnvid2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnvid1) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=ppuWqpUPLy8"));
            startActivity(intent);
        }else if (v.getId()==R.id.btnvid2){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=jCeePk43VNE"));
            startActivity(intent);
        }

    }
}
