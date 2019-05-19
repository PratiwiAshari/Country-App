package com.example.thecountryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class NegaraAmerikaActivity extends AppCompatActivity {
    List<NegaraAmerika> lstAmerika ;
    TextView namaNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        namaNegara = findViewById(R.id.negara);
        namaNegara.setText("Negara Benua Amerika");

        lstAmerika = new ArrayList<>();
        lstAmerika.add(new NegaraAmerika("Amerika Serikat","Ibukota: Washington, D.C","Mata Uang: Dollar Amerika Serikat" +
                "Lagu Kebangsaan: The Star-Spangled Banner" +
                "Bahasa Nasional: Inggris" +
                "Semboyan: In God We Trust" +
                "Amerika Serikat, disingkat dengan AS (bahasa Inggris: United States of America/U.S.A. disingkat United States/US), atau secara umum dikenal dengan Amerika saja adalah sebuah negara republik konstitusional federal yang terdiri dari lima puluh negara bagian dan sebuah distrik federal. Negara ini terletak di bagian tengah Amerika Utara, yang menjadi lokasi dari empat puluh delapan negara bagian yang saling bersebelahan, beserta distrik ibu kota Washington, D.C.. Amerika Serikat diapit oleh Samudra Pasifik dan Atlantik di sebelah barat dan timur, berbatasan dengan Kanada di sebelah utara, dan Meksiko di sebelah selatan. Dua negara bagian lainnya, yaitu Alaska dan Hawaii, terletak terpisah dari dataran utama Amerika Serikat. Negara bagian Alaska terletak di sebelah ujung barat laut Amerika Utara, berbatasan dengan Kanada di sebelah timur dan Rusia di sebelah barat, yang dipisahkan oleh Selat Bering. ",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Flag_of_the_United_States.svg/1280px-Flag_of_the_United_States.svg.png",
                "http://2.bp.blogspot.com/-ATgm89YSLy8/Uh72r3ZjEBI/AAAAAAAAM-U/YK8CGXi2g6k/s1600/paket+tour+amerika+serikat.jpg"));
        lstAmerika.add(new NegaraAmerika("Argentina","Ibukota: Buenos Aires","Mata Uang: Peso Argentina" +
                "Lagu Kebangsaan: Himno Nacional Argentino" +
                "Bahasa Nasional: spanyol" +
                "Semboyan: n Unión y Libertad" +
                "Republik Argentina (bahasa Spanyol: República Argentina), lebih dikenal sebagai Argentina, merupakan sebuah negaraAmerika Latin yang terletak di bagian selatan benua Amerika Selatan. Posisinya berada di antara Pegunungan Andes di barat dan Samudra Atlantik di selatan. Lokasi ini membuat Argentina dikenal sebagai 'negara paling selatan di selatan' (bahasa Spanyol: \"Sur del sur\").",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2000px-Flag_of_Argentina.svg.png",
                "http://www.wisataku.id/wp-content/uploads/2018/01/1.-Boenos-Aires.jpg "));
        lstAmerika.add(new NegaraAmerika("Bolivia","Ibukota: Sucre","Mata Uang: Boliviano" +
                "Lagu Kebangsaan: Himno Nacional de Bolivia" +
                "Bahasa Nasional: Spanyol, Quechua, Aymara" +
                "Semboyan: La Unión es la Fuerza" +
                "Bolivia, atau secara resminya Negara Plurinasional Bolivia (bahasa Spanyol: Estado Plurinacional de Bolivia), adalah sebuah negara di Amerika Selatan yang berbatasan dengan Brasil di sebelah utara dan timur, Paraguay dan Argentina di selatan, serta Chili dan Peru di barat. Di antara negara-negara di Amerika Selatan, wilayah Bolivia merupakan yang tertinggi dan terpencil. Negara ini adalah salah satu penghasil koka dan timah terbesar di dunia.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Flag_of_Bolivia_%28military%29.svg/1280px-Flag_of_Bolivia_%28military%29.svg.png",
                "http://tempathits.com/wp-content/uploads/2016/12/lapaz-bolivia-nigh_3463661b.jpg"));
        lstAmerika.add(new NegaraAmerika("Brazil","Ibukota: Brasilia","Mata Uang: Real " +
                "Lagu Kebangsaan: Hino Nacional Brasileiro " +
                "Bahasa Nasional: Portugis " +
                "Semboyan: Ordem e Progresso " +
                "Republik Federatif Brasil atau Republik Federal Brasil (bahasa Portugis: República Federativa do Brasil, bahasa Inggris: Federative Republic of Brazil, bahasa Latin: Respublica Foederativa Brasiliae) adalah negara paling besar dan paling banyak penduduknya(204.5 juta jiwa pada tahun 2017) di Amerika Selatan. Negara ini merupakan negara paling timur di Benua Amerika dan berbatasan dengan Pegunungan Andes dan Samudra Atlantik. Nama Brasil diambil dari nama Kayu Brasil, sejenis kayu lokal. Brasil merupakan tempat pertanian ekstensif dan hutan hujan tropis.",
                "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/1280px-Flag_of_Brazil.svg.png",
                "https://www.kitamuda.id/wp-content/uploads/2017/05/3brazil.jpg"));
        lstAmerika.add(new NegaraAmerika("Britania Raya","Ibukota: London  ","Mata Uang: Pound Sterling " +
                "Lagu Kebangsaan: God Save the Queen " +
                "Bahasa Nasional: Inggris " +
                "Semboyan: " +
                "Britania Raya, atau Inggris Raya, adalah sebuah negara berdaulat yang terletak di lepas pantai barat laut benua Eropa. Britania Raya adalah sebuah negara kepulauan yang terdiri dari Pulau Britania Raya, bagian timur laut Pulau Irlandia dan sejumlah pulau-pulau yang lebih kecil. Irlandia Utara adalah satu-satunya bagian dari Britania Raya yang berbagi perbatasan darat dengan negara berdaulat lain, yaitu Republik Irlandia Selebihnya, perbatasan darat Britania Raya dikelilingi oleh Samudera Atlantik, Laut Utara, Selat Inggris dan Laut Irlandia.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1280px-Flag_of_the_United_Kingdom.svg.png",
                "https://www.hipwee.com/wp-content/uploads/2018/03/hipwee-larangan-di-inggris-3-750x422.jpg "));
        lstAmerika.add(new NegaraAmerika("Chili","Ibukota: Santiago ","Mata Uang: Peso Chili " +
                "Lagu Kebangsaan: Himno Nacional de Chile " +
                "Bahasa Nasional: Spanyol " +
                "Semboyan: Por la razono la fuerza " +
                "Sebuah kota didefinisikan oleh Institute Statistik Nasional (INE) Chili sebagai suatu entitas perkotaan (urban) yang memiliki lebih dari 5.000 jiwa penduduk. Daftar ini dibuat menurut laporan Juni 2005 oleh INE, yang berdasarkan sensus 2002 yang mencatat terdapat sebanyak 239 kota di seluruh negeri iniz",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/2000px-Flag_of_Chile.svg.png",
                "https://1.bp.blogspot.com/--ouWDgSR6vk/WqaqSqBnPqI/AAAAAAAAGi8/t6zVGYS884EwIMV9bM6-ppQF_SQlkAA5QCEwYBhgL/s1600/villarica.png "));
        lstAmerika.add(new NegaraAmerika("Costa Rica","Ibukota: San Joe ","Mata Uang: Colon " +
                "Lagu Kebangsaan: Himno Nacional de Costa Rica " +
                "Bahasa Nasional: Spanyol " +
                "Semboyan: Vivan siempre el trabajo y la paz " +
                "Kosta Rika adalah negara terkecil ketiga setelah Belize dan El Salvador di Amerika Tengah yang berbatasan dengan Nikaragua di sebelah utara, Panama di selatan-tenggara, Samudra Pasifik di barat dan selatan, dan Laut Karibia di timur. Kosta Rika merupakan negara pengonsumsi gula terbanyak di dunia. Tahun 1980, konsumsi rata-rata per jiwa lebih dari 65 kg yang berarti tiap orang makan 1,7 ons gula per hari",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Costa_Rica_%28state%29.svg/1200px-Flag_of_Costa_Rica_%28state%29.svg.png",
                "https://media.keepo.me/keepo.me-costa-rica-travel.jpg "));
        lstAmerika.add(new NegaraAmerika("El Salvador","Ibukota: San Salvador ","Mata Uang: Dollar Amerika Serikat " +
                "Lagu Kebangsaan: Himno Nacional de El Salvador " +
                "Bahasa Nasional: Spanyol " +
                "Semboyan: Dios, Union, Libertad " +
                "Republik El Salvador adalah sebuah negara di Amerika Tengah yang berbatasan dengan Honduras dan Guatemala. Daerah ini dulunya disebut oleh orang Pipilsebagai \"Cuzhcatl\", dalam bahasa Spanyol \"Cuzcatlan\", yang dalam bahasa Nahuatl berarti \"tanah (tempat benda-benda yang) berharga",
                "http://flagpedia.net/data/flags/ultra/sv.png",
                "http://newyearseveblog.com/wp-content/uploads/2016/11/san-salvador-nye.jpg "));
        lstAmerika.add(new NegaraAmerika("Guatemala","Ibukota: Kota Guatemala ","Mata Uang: Quetzal " +
                "Lagu Kebangsaan: Himno Nacional de Guetemala " +
                "Bahasa Nasional: Spanyol " +
                "Semboyan: Libre Crezca Fecundo " +
                "Republik Guatemala adalah sebuah negara di Amerika Tengah, di selatan benua Amerika Utara, berbatasan dengan Samudra Pasifik dan Laut Karibia. Dia berbatasan dengan Meksiko di utara, Belize di barat laut, dan Honduras dan El Salvador di tenggara. Guatemala merupakan salah satu negara produsen kopi terbesar di dunia.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Flag_of_Guatemala.svg/2000px-Flag_of_Guatemala.svg.png",
                "http://agolf.xyz/wp-content/uploads/2018/05/guatemala-696x426.jpg "));
        lstAmerika.add(new NegaraAmerika("Kanada","Ibukota: Ottawa ","Mata Uang: Dolar Kanada " +
                "Lagu Kebangsaan: O Canada " +
                "Bahasa Nasional: Inggris, Prancis " +
                "Semboyan: A Mari Usque Ad Mare " +
                "Kanada, secara historis dikenal sebagai Dominion of Canada adalah negara paling utara di Amerika Utara. Merupakan federasi dari 10 provinsi dan 3 teritori dengan sistem desentralisasi dan pemerintahan berbentuk monarki konstitusional. Dibentuk tahun 1867 dengan undang-undang Konfederasi. Ibu kota Kanada adalah Ottawa tempat parlemen nasional, tempat tinggal Gubernur Jenderal dan Perdana Menteri. Merupakan bekas jajahan Prancis dan Britania Raya.",
                "https://upload.wikimedia.org/wikipedia/en/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png",
                "https://3.bp.blogspot.com/-xqCoC_iTJgs/WTEB0clMq2I/AAAAAAAADBI/VA25VVJafPErqHRneDZlEWlb6_4SSAswgCLcB/s1600/Snap%2B2017-06-02%2Bat%2B13.10.07.png "));

        showRecycler();
    }

    private void showRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        NegaraAmerikaAdapter adapterAmerika = new NegaraAmerikaAdapter(this, lstAmerika);
        recyclerView.setAdapter(adapterAmerika);
    }
}