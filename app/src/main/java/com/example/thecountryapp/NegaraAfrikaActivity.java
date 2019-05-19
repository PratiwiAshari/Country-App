package com.example.thecountryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class NegaraAfrikaActivity extends AppCompatActivity {
    List<NegaraAfrika> lstAfrika ;
    TextView namaNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        namaNegara = findViewById(R.id.negara);
        namaNegara.setText("Negara Benua Afrika");

        lstAfrika = new ArrayList<>();
        lstAfrika.add(new NegaraAfrika("Algeria","Ibukota: Aljir","Mata Uang: Dinar Aljazair" +
                "Lagu Kebangsaan: Aljazair" +
                "Bahasa Nasional: bahasa Arab dan bahasa Berber" +
                "Semboyan: Oleh rakyat dan untuk rakyat" +
                "Aljazair resminya Republik Demokratik Rakyat Aljazair, merupakan sebuah negara di pesisir Laut Tengah, Afrika Utara. Nama negara ini yang berarti kepulauan (al-jazā’ir, dalam bahasa Arab) mungkin mengacu kepada 4 buah pulau yang terletak berdekatan dengan ibu kota sekaligus pusat pemerintahan negara ini, Aljir. Aljazair adalah republik semi-presidensial yang terdiri dari 48 provinsi dan 1.541 komune. Dengan jumlah penduduk lebih dari 37 juta jiwa,[10] Aljazair merupakan negara berpenduduk terbanyak ke-34 di Bumi. Dengan ekonomi yang mengandalkan sumber-sumber minyak, sektor manufaktur telah menderita penyakit Belanda.Sonatrach, perusahaan minyak nasional, merupakan perusahaan terbesar di Afrika. Aljazair memiliki tentara terbesar kedua dengan anggaran pertahanan terbesar di Afrika. Aljazair memiliki Program Nuklir damai sejak dasawarsa 1990-an",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/2000px-Flag_of_Algeria.svg.png","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Algiers_Montage.png/1200px-Algiers_Montage.png"));
        lstAfrika.add(new NegaraAfrika("Angola","Ibukota: Luanda","Mata Uang: Kwanza Angola " +
                "Lagu Kebangsaan: Angola Avante!" +
                "Bahasa Nasional: Portugis" +
                "Semboyan: orang yang beraneka ragam bersatu" +
                "Republik Angola adalah sebuah negara yang terletak di Afrika bagian barat daya. Luas wilayah Angola hampir dua kali luas pulau Borneo; menempati peringkat ke-22 sedunia (setelah Niger dan sebelum Mali). Negara ini merupakan salah satu produsen kopi utama di dunia dan termasuk negara terkaya di Afrika berkat sumber alamnya, terutama bijih besi, intan, dan tembaga.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Flag_of_Angola.svg/1280px-Flag_of_Angola.svg.png","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Luanda_Collage.png/300px-Luanda_Collage.png"));
        lstAfrika.add(new NegaraAfrika("Chad","Ibukota: N'Djamena","Mata Uang: Franc CFA Afrika Tengah" +
                "Lagu Kebangsaan: La Tchadienne" +
                "Bahasa Nasional: Prancis dan Arab" +
                "Semboyan: Persatuan, Karya, Kemajuan" +
                "Republik Chad adalah sebuah negara di Afrika Tengah yang terkurung daratan. Disebabkan oleh jaraknya dan kebanyakan kawasannya yang beriklim gurun, negara ini sering disebut sebagai 'jantung mati Afrika.' Di utara ada Pegunungan Tibesti, pegunungan paling besar di gurun Sahara. Chad adalah bekas Persekutuan Afrika Perancis Khatulistiwa.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Flag_of_Chad.svg/2000px-Flag_of_Chad.svg.png","https://upload.wikimedia.org/wikipedia/commons/0/0c/KampalaSkyline.jpg"));
        lstAfrika.add(new NegaraAfrika("Kenya","Ibukota: Nairobi","Mata Uang: Shilling Kenya"+
                "Lagu Kebangsaan: Ee Mungu Nguvu Yetu" +
                "Bahasa Nasional: Swahili dan Inggris" +
                "Semboyan: Mari bekerja bersam" +
                "Kenya atau Republik Kenya atau Jumhuriye Kenya adalah sebuah negara yang terletak di kawasan Afrika Timur. Pada tahun 2010, Negara ini memiliki populasi penduduk keseluruhan sebanyak 34.341.000 jiwa. kota terbesarnya adalah Nairobi, yang juga sekaligus sebagai merupakan ibukotanya",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/2000px-Flag_of_Kenya.svg.png","https://media.timeout.com/images/102077765/630/472/image.jpg"));
        lstAfrika.add(new NegaraAfrika("Liberie","Ibukota: Monvoria","Mata Uang: Dolar Liberia"+
                "Lagu Kebangsaan: All Hail, Liberia, Hail!" +
                "Bahasa Nasional: Inggris" +
                "Semboyan: Semua untuk negara kita" +
                "Republik Liberia merupakan sebuah negara yang berada di pesisir barat Afrika yang berbatasan dengan Sierra Leone, Guinea, dan Pantai Gading. Liberia adalah salah satu dari dua negara modern di Sub-Sahara Afrika tanpa berakar di kolonisasi Eropa Afrika. Ibukota negara ini adalah Monrovia.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Flag_of_Liberia.svg/2000px-Flag_of_Liberia.svg.png","https://silversea-h.assetsadobe2.com/is/image/content/dam/silversea-com/ports/m/monrovia/silversea-africa-monrovia.jpg?wid=1200&hei=1200&fit=constrain"));
        lstAfrika.add(new NegaraAfrika("Mesir","Ibukota: Kairo","Mata Uang: Pound Mesir"+
                "Lagu Kebangsaan: Biladi" +
                "Bahasa Nasional: Arab" +
                "Semboyan: jutaan martir akan menuju Al Quds" +
                "esir atau dalam bahasa Inggris disebut dengan Egypt adalah sebuah negara yang terletak di dua benua (trans-benua) yaitu benua Afrika dan benua Asia. Negara dengan nama lengkap Republik Arab Mesir ini sebagian besar wilayahnya terletak di bagian timur laut Afrika sehingga sering digolongkan sebagai negara yang berada di benua Afrika. Berbagai media dan organisasi internasional juga sering menggolongkan Mesir sebagai negara yang berada di kawasan Timur Tengah.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1200px-Flag_of_Egypt.svg.png","http://www.setangkai.com/wp-content/uploads/2015/11/kota-kairo.jpg"));
        lstAfrika.add(new NegaraAfrika("Nigeria","Ibukota: Abuja","Mata Uang: Naira Nigeria"+
                "Lagu Kebangsaan: Arise" +
                "Bahasa Nasional: Hausa; Igbo; Yoruba; Inggris" +
                "Semboyan: Persaudaraan, Kerja, Kemajuan" +
                "Luas wilayah 923.768 km2. Nigeria memiliki hutan hujan tropis dan hutan bakau di selatan, sabana dan padang rumput di utara. Negara ini kering karena sistem pengairan Sungai Niger dan Benue.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/2000px-Flag_of_Nigeria.svg.png","https://www.africa.com/wp-content/uploads/2017/10/Abuja-Nigeria.jpg"));
        lstAfrika.add(new NegaraAfrika("Rwanda","Ibukota: Kigali","Mata Uang: Franc Rwanda"+
                "Lagu Kebangsaan: " +
                "Bahasa Nasional: Perancis, Inggris, Bahasa Kinyarwanda, Bahasa Swahili" +
                "Semboyan: " +
                "Rwanda adalah sebuah pembantaian 800.000 suku Tutsi dan Hutu moderat oleh sekelompok ekstremis Hutu yang dikenal sebagai Interahamwe yang terjadi dalam periode 100 hari pada tahun 1994.\n" +
                "\n" +
                "Rwanda sendiri adalah sebuah negeri berpenduduk 7,4 juta jiwa dan merupakan negara terpadat di Afrika Tengah.\n" +
                "\n" +
                "Peristiwa ini bermula pada tanggal 6 April 1994, ketika Presiden Rwanda, Juvenal Habyarimana menjadi korban penembakan saat berada di dalam pesawat terbang. Beberapa sumber menyebutkan Juvenal Habyarimana tengah berada di dalam sebuah helikopter pemberian pemerintah Prancis. Saat itu, Habyarimana yang berasal dari etnis Hutu berada dalam satu heli dengan presiden Burundi, Cyprien Ntarymira. Mereka baru saja menghadiri pertemuan di Tanzania untuk membahas masalah Burundi. Sebagian sumber menyebutkan pesawat yang digunakan bukanlah helikopter melainkan pesawat jenis jet kecil Dassault Falcon.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Flag_of_Rwanda.svg/2000px-Flag_of_Rwanda.svg.png","https://upload.wikimedia.org/wikipedia/commons/8/83/Kigali2018Cropped.jpg"));
        lstAfrika.add(new NegaraAfrika("Somalia","Ibukota: Mogadishu","Mata Uang: Dolar Amerika Serikat, Shilling Somalia"+
                "Lagu Kebangsaan: Qolobaa Calankeed" +
                "Bahasa Nasional: Bahasa Somali, Arab, Bahasa Arab standar modern" +
                "Semboyan: " +
                "Somalia adalah sebuah negara yang terletak di benua Afrika, tepatnya di Afrika Timur. Kawasan dimana tempat Somalia berada ini sering disebut dengan tanduk Afrika yaitu sebuah semenanjung yang yang menonjol ke Laut Arabia dan terletak di sepanjang bagian selatan Teluk Aden. Somalia yang secara astronomisnya berada diantara  12°LU-39°LS dan 41°BT-51°BT berbatasan darat dengan Etiopia di sebelah Barat, Kenya di barat daya dan Djibouti di barat laut. Sedangkan di utaranya adalah Teluk Aden dan di sebelah timurnya adalah Samudera Hindia.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Flag_of_Somalia.svg/2000px-Flag_of_Somalia.svg.png","http://farm2.static.flickr.com/1090/842005324_04f5c8f718_o.jpg"));

        showRecycler();
    }

    private void showRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        NegaraAfrikaAdapter adapterAfrika = new NegaraAfrikaAdapter(this, lstAfrika);
        recyclerView.setAdapter(adapterAfrika);
    }
}