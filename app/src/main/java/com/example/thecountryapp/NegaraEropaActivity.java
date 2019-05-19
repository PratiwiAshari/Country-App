package com.example.thecountryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class NegaraEropaActivity extends AppCompatActivity {
    List<NegaraEropa> lstEropa ;
    TextView namaNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        namaNegara = findViewById(R.id.negara);
        namaNegara.setText("Negara Benua Eropa");

        lstEropa = new ArrayList<>();
        lstEropa.add(new NegaraEropa("Finlandia","Ibukota: Helsinki   ","Mata Uang: Euro " +
                "Lagu Kebangsaan: Maamme " +
                "Bahasa Nasional:  Finlandia dan Swedia " +
                "Semboyan: -" +
                "Republik Finlandia adalah sebuah negara Nordik yang terletak di Eropa Utara, serta anggota dari Uni Eropa. Finlandia memiliki perbatasan darat dengan Swedia di barat, Norwegia di utara, dan Rusia di timur sedangkan batas lautnya adalah Laut Baltik di barat daya, Teluk Finlandia di selatan, dan Teluk Bothnia di barat. Finlandia merupakan bagian dari kawasan geografi Fennoscandia, yang di dalamnya juga termasuk Skandinavia dan sebagian Rusia. ",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Finland.svg/2000px-Flag_of_Finland.svg.png",
                "https://muslimobsession.com/wp-content/uploads/2019/03/Finlandia.jpg"));
        lstEropa.add(new NegaraEropa("Irlandia","Ibukota: Dublin ","Mata Uang: Euro " +
                "Lagu Kebangsaan: Amhrán na bhFiann " +
                "Bahasa Nasional:Irlandia " +
                "Semboyan:- " +
                "Irlandia ialah sebuah pulau di Eropa lepas pesisir barat benua Eropa. Di baratnya Samudra Atlantik; di timur Irlandia, di seberang Laut Irlandia, ialah pulau Britania Raya. Pulau ini terbagi atas 32 county.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Flag_of_Ireland.svg/1280px-Flag_of_Ireland.svg.png",
                "https://cdn0-production-images-kly.akamaized.net/03KGxJ8j58XiqHzLHmDswn1ITgM=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1324519/original/034030900_1471856740-Dublin-cityscape-dusk.jpg"));
        lstEropa.add(new NegaraEropa("Islandia","Ibukota: Reykjavík","Mata Uang: Króna Islandia " +
                "Lagu Kebangsaan: Lofsöngur " +
                "Bahasa Nasional: Islandia " +
                "Semboyan:- " +
                "Islandia yang secara resmi bernama Republik Islandia, adalah sebuah negara Nordik yang terletak di sebelah barat laut Eropa dan sebelah utara Samudera Atlantik, yang terdiri dari Pulau Islandia dan beberapa pulau kecil disekitarnya. Islandia terletak 300 kilometer di sebelah timur Greenland dan 1.000 kilometer dari Norwegia. Negara memiliki populasi sebanyak 332.529 penduduk dan luas 103.000 km persegi, menjadikannya negara dengan penduduk terjarang di Eropa.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Iceland.svg/2000px-Flag_of_Iceland.svg.png",
                "https://awsimages.detik.net.id/visual/2017/03/22/d790a472-5339-42f0-9aab-29985c7837fe_169.jpeg?w=650"));
        lstEropa.add(new NegaraEropa("Kroasia","Ibukota: Zagreb ","Mata Uang: Kuna " +
                "Lagu Kebangsaan: Lijepa naša domovino " +
                "Bahasa Nasional: Kroasia " +
                "Semboyan:- " +
                "Kroasia adalah negara berbentuk bulan sabit di Eropa berbatasan dengan Balkan di tenggara. Ibu kotanya adalah Zagreb. Dalam sejarahnya, negara ini merupakan negara republik untuk Republik Sosialis Federal Yugoslavia. Negara ini melepaskan diri dan memperoleh kemerdekaan pada 1991 dan merupakan kandidat dari anggota Uni Eropa.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Flag_of_Croatia.svg/2000px-Flag_of_Croatia.svg.png",
                "https://handluggageonly.co.uk/wp-content/uploads/2018/01/Hand-Luggage-Only-9-14.jpg"));
        lstEropa.add(new NegaraEropa("Denmark","Ibukota: Kopenhagen ","Mata Uang: Krona Denmark " +
                "Lagu Kebangsaan: Der er et yndigt land " +
                "Bahasa Nasional: Denmark " +
                "Semboyan:- " +
                "Kerajaan Denmark (bahasa Denmark: Kongeriget Danmark) adalah negara Nordik yang paling kecil, dan paling selatan. Denmark terletak di sebelah barat daya dari Swedia dan selatan dari Norwegia. Negara ini terletak di Skandinavia, Eropa Utara sehingga termasuk Uni Eropa namun tidak berada di Semenanjung Skandinavia",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Denmark.svg/2000px-Flag_of_Denmark.svg.png",
                "https://img.theculturetrip.com/x/smart/wp-content/uploads/2015/11/Denmark-%C2%A9-Sean-Pavone-Shutterstock.jpg"));
        lstEropa.add(new NegaraEropa("Polandia","Ibukota: Warsawa ","Mata Uang: Złoty  " +
                "Lagu Kebangsaan: Mazurek Dąbrowskiego " +
                "Bahasa Nasional: Polandia " +
                "Semboyan:- " +
                "Polandia adalah sebuah negara republik di Eropa Tengah yang berbatasan dengan Jerman di sebelah barat Perbatasan Oder-Neisse, Ceko dan Slowakia di sebelah selatan, Rusia (Kaliningrad), Lituania di sebelah timur laut dan Belarus serta Ukraina di sebelah barat (Garis Curzon).",
                "http://tr.country-flags.net/big/Poland.png",
                "https://www.worldatlas.com/r/w728-h425-c728x425/upload/0f/94/e0/shutterstock-584292832-min.jpg"));
        lstEropa.add(new NegaraEropa("Norwegia","Ibukota: Oslo ","Mata Uang: Krona Norwegia  " +
                "Lagu Kebangsaan: Ja, vi elsker dette landet " +
                "Bahasa Nasional: Norwegia " +
                "Semboyan: Alt for Norge " +
                "Norwegia adalah sebuah negara Nordik di Semenanjung Skandinavia bagian ujung barat yang berbatasan dengan Swedia, Finlandia, dan Rusia. Pantainya yang berada di Samudera Atlantik Utara dan Laut Barents adalah lokasi dari fyord terkenal. Svalbard dan Jan Mayen berada di bawah kedaulatan Norwegia berdasarkan Traktat Svalbard. Norwegia memiliki sebuah pulau bernama Bouvet yang terletak di Samudera Atlantik.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Norway.svg/2000px-Flag_of_Norway.svg.png",
                "https://www.technojobs.co.uk/info/sites/www.technojobs.co.uk/files/styles/article_image_large/public/article-images/it-jobs-in-norway.jpg?itok=U2z-xAV7"));
        lstEropa.add(new NegaraEropa("Portugal","Ibukota: Lisbon ","Mata Uang: Euro " +
                "Lagu Kebangsaan: A Portuguesa " +
                "Bahasa Nasional: Portugis " +
                "Semboyan: Esta é a ditosa pátria, minha amada  " +
                "Portugal, kependekan dari Republik Portugal merupakan sebuah negara di Eropabagian barat daya. Negara ini berbatasan dengan Spanyol di sebelah utara, dan timur. Di sebelah barat berbatasan dengan Samudra Atlantik. Selain itu, Portugal juga mempunyai daerah di Madeira, Azores dan Kepulauan Selvagens. Portugal mengklaim sebuah daerah kecil bernama Olivença yang dikuasai Spanyol sejak Kongres Wina. Nama lama atau latin dari negara ini adalah Lusitania.",
                "http://flagpedia.net/data/flags/ultra/pt.png",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/06/26/18/porto-main.jpg?w968h681"));
        lstEropa.add(new NegaraEropa("Spanyol","Ibukota: Madrid ","Mata Uang: Euro " +
                "Lagu Kebangsaan: Marcha Real  " +
                "Bahasa Nasional: Spanyol  " +
                "Semboyan: Plus Ultra " +
                "Spanyol  secara resmi dikenal dengan sebutan Kerajaan Spanyol  adalah sebuah negara di Eropa barat daya yang, bersama Portugal, terdapat di Semenanjung Iberia. Batas darat Spanyol dengan Eropa adalah Pegunungan Pirenia dengan Perancis dan Andorra. Wilayahnya terdiri dari kota Ceuta dan Melilla di Afrika Utara, Kepulauan Canary di Samudra Atlantik, dan berbagai pulau di Laut Tengah",
                "https://upload.wikimedia.org/wikipedia/en/thumb/9/9a/Flag_of_Spain.svg/1280px-Flag_of_Spain.svg.png",
                "https://ehef.id/storage/app/uploads/public/592/e4c/f99/592e4cf99a7c1453889848.jpg"));
        lstEropa.add(new NegaraEropa("Swedia","Ibukota: Stockholm ","Mata Uang: Krona Swedia  " +
                "Lagu Kebangsaan: Du gamla, Du fria " +
                "Bahasa Nasional: Swedia " +
                "Semboyan: För Sverige, i tiden " +
                "Swedia adalah sebuah negara Nordik di Skandinavia, Eropa Utara. Negara ini berbatasan dengan Norwegia di barat dan Finlandia di timur laut, Selat Skagerrak dan Selat Kattegat di barat daya, serta Laut Baltik dan Teluk Bothnia di timur. Swedia terhubung dengan Denmarkmelalui sebuah jembatan-terowongan melewati Öresund.",
                "https://upload.wikimedia.org/wikipedia/en/thumb/4/4c/Flag_of_Sweden.svg/1200px-Flag_of_Sweden.svg.png",
                "https://bitocto.com/wp-content/uploads/2019/04/sunset-over-riddarholmen-chruch-in-old-town-stockholm-city-sweden-855564060-5ad546a404d1cf0037fbf9b3.jpg"));

        showRecycler();
    }

    private void showRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        NegaraEropaAdapter adapterEropa = new NegaraEropaAdapter(this, lstEropa);
        recyclerView.setAdapter(adapterEropa);
    }
}