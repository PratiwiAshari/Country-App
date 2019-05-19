package com.example.thecountryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView asia, afrika, amerika, australia, eropa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asia = (ImageView) findViewById(R.id.asia);
        asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), NegaraAsiaActivity.class);
                startActivity(i);
            }
        });

        afrika = (ImageView) findViewById(R.id.afrika);
        afrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), NegaraAfrikaActivity.class);
                startActivity(i);
            }
        });

        amerika = (ImageView) findViewById(R.id.amerika);
        amerika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), NegaraAmerikaActivity.class);
                startActivity(i);
            }
        });

        australia = (ImageView) findViewById(R.id.australia);
        australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), NegaraAustraliaActivity.class);
                startActivity(i);
            }
        });

        eropa = (ImageView) findViewById(R.id.eropa);
        eropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), NegaraEropaActivity.class);
                startActivity(i);
            }
        });
    }
}
