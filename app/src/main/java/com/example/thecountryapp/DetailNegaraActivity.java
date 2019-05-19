package com.example.thecountryapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailNegaraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("Title") && getIntent().hasExtra("Description") && getIntent().hasExtra("ibuKota")){

            String Title = getIntent().getStringExtra("Title");
            String Description = getIntent().getStringExtra("Description");
            String Thumbnail = getIntent().getStringExtra("ibuKota");
            setData(Title,Description,Thumbnail);
        }
    }

    private void setData(String Title, String Description, String Thumbnail){
        TextView namaNegaraDetail = findViewById(R.id.namaNegaradtl);
        namaNegaraDetail.setText(Title);
        TextView deskNegara = findViewById(R.id.deskripsiNegara);
        deskNegara.setText(Description);

        ImageView gambarNegaraDetail = findViewById(R.id.imgdetail);
        Glide.with(this)
                .asBitmap()
                .load(Thumbnail)
                .into(gambarNegaraDetail);
    }
}
