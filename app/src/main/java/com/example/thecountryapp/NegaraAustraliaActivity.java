package com.example.thecountryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class NegaraAustraliaActivity extends AppCompatActivity {
    List<NegaraAustralia> lstAustralia ;
    TextView namaNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        namaNegara = findViewById(R.id.negara);
        namaNegara.setText("Negara Benua Australia");

        lstAustralia = new ArrayList<>();
        lstAustralia.add(new NegaraAustralia("Australia","Ibukota: Canberra", "Mata Uang: Dolar Australia" +
                "Lagu Kebangsaan: Advance Australia Fair " +
                "Bahasa Nasional: Inggris" +
                "Semboyan: -" +
                "Australia, resminya Persemakmuran Australia, adalah sebuah negara di belahan selatan yang terdiri dari daratan utama benua Australia, Pulau Tasmania, dan berbagai pulau kecil di Samudra Hindia, dan Samudra Pasifik. Negara-negara yang bertetangga dengannya adalah Indonesia, Timor Leste, dan Papua Nugini di utara; Kepulauan.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/1280px-Flag_of_Australia.svg.png",
                "http://letsexchangeplates.com/images/portfolio_content/aus.jpg"));

        showRecycler();
    }

    private void showRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        NegaraAustraliaAdapter adapterAustralia = new NegaraAustraliaAdapter(this, lstAustralia);
        recyclerView.setAdapter(adapterAustralia);
    }
}