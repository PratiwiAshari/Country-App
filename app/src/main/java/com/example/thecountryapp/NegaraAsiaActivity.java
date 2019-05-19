package com.example.thecountryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class NegaraAsiaActivity extends AppCompatActivity {
    List<NegaraAsia> lstAsia ;
    TextView namaNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        namaNegara = findViewById(R.id.negara);
        namaNegara.setText("Negara Benua Asia");

        lstAsia = new ArrayList<>();
        lstAsia.add(new NegaraAsia("Afghanistan","Ibukota: Kabul ","Mata Uang: Afgani " +
                "Lagu Kebangsaan: Milli Surood " +
                "Bahasa Nasional:Pashtun " +
                "Semboyan: Tiada Tuhan selain Allah, Muhammad adalah utusan Allah " +
                "Republik Islam Afganistan, adalah negara yang terkurung daratan yang terletak di Asia Selatan dan Asia Tengah. Memiliki penduduk sekitar 32 juta, menjadikannya negara paling padat penduduknya ke-42 di dunia. Negara ini berbatasan dengan Pakistan di selatan dan timur; Iran di barat; Turkmenistan,Uzbekistan, Tajikistan di utara; dan Tiongkok jauh di timur laut. Wilayahnya meliputi 652.000 km² (252.000 sq mi), menjadikannya negara terbesar ke-41 di dunia.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Afghanistan.svg/2000px-Flag_of_Afghanistan.svg.png",
                "https://cdn-2.tstatic.net/travel/foto/bank/images/big-ben_20161109_181104.jpg"));
        lstAsia.add(new NegaraAsia("Arab Saudi","Ibukota: Riyadh ","Mata Uang: Riyal Saudi " +
                "Lagu Kebangsaan: Aash Al Maleek " +
                "Bahasa Nasional: Arab " +
                "Semboyan: Tiada Tuhan selain Allah, Muhammad adalah utusan Allah " +
                "secara resmi di kenal sebagai Kerajaan Arab Saudiatau Kingdom of Saudi Arabia, Arab Saudi terkenal sebagai negara tempat kelahiran Nabi Muhammad serta tumbuh dan berkembangnya agama Islam sehingga pada benderanya terdapat dua kalimat syahadat yang berarti \"Tidak ada Tuhan selain Allah dan Nabi Muhammad adalah utusan-Nya",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Flag_of_Saudi_Arabia.svg/2000px-Flag_of_Saudi_Arabia.svg.png",
                "https://t-ec.bstatic.com/images/hotel/max1024x768/629/62964256.jpg "));
        lstAsia.add(new NegaraAsia("Filipina","Ibukota: Manila ","Mata Uang: Peso " +
                "Lagu Kebangsaan: Lupang Hinirang " +
                "Bahasa Nasional: Filipino " +
                "Semboyan: Maka-Diyos, Maka-Tao, Makakalikasan at Makabansa " +
                "Filipina atau Republik Filipina (bahasa Tagalog: Republika ng Pilipinas) adalah sebuah negara republik di Asia Tenggara, sebelah utara Indonesia, dan Malaysia. Filipina merupakan sebuah negara kepulauan yang terletak di Lingkar Pasifik Barat, negara ini terdiri dari 7.641 pulau. Selama ribuan tahun, warga kepulauan Filipina , dan pekerja keras ini telah mengembangkan sistem cocok tanam Padi yang sangat maju, yang menyediakan makanan pokok bagi masyarakatnya.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_the_Philippines.svg/2000px-Flag_of_the_Philippines.svg.png",
                "https://gdb.voanews.com/AE043A9C-170C-4A49-A1EF-BEEA063EB191_w1023_r1_s.jpg "));
        lstAsia.add(new NegaraAsia("India","Ibukota: New Delhi ","Mata Uang: Rupe Hindia " +
                "Lagu Kebangsaan: Jana Gana Mana " +
                "Bahasa Nasional:Hindia " +
                "Semboyan: Hanya Kebenaran yang Berjaya " +
                "Republik India adalah sebuah negara di Asia yang memiliki jumlah penduduk terbanyak kedua di dunia, dengan populasi lebih dari satu miliar jiwa, dan adalah negara terbesar ketujuh berdasarkan ukuran wilayah geografis. Jumlah penduduk India tumbuh pesat sejak pertengahan 1980-an. Ekonomi India adalah terbesar keempat di dunia dalam PDB, diukur dari segi paritas daya beli (PPP), dan salah satu pertumbuhan ekonomi tercepat di dunia",
                "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png",
                "https://ae01.alicdn.com/kf/HTB1EK0LLXXXXXctXpXXq6xXFXXXZ/India-Taj-Mahal-pemandangan-lanskap-poster-Seni-cetak-36-24-inch-ulang-tahun-wallpaper.jpg"));
        lstAsia.add(new NegaraAsia("Iran","Ibukota: Teheran ","Mata Uang: Rial Iran " +
                "Lagu Kebangsaan: Sorud-e Melli Iran " +
                "Bahasa Nasional: Persia " +
                "Semboyan:Kemerdekaan, kebebasan, Republik Islam " +
                "Iran adalah sebuah negara Timur Tengah yang terletak di Asia Barat Daya. Meski negara ini telah dikenal penduduk lokal sebagai Iran sejak zaman kuno, hingga tahun 1935 Iran masih disebut Persia di dunia Barat. Pada tahun 1959, Mohammad Reza Shah Pahlavi mengumumkan bahwa kedua istilah tersebut boleh digunakan. Nama Iran adalah sebuah kognat perkataan \"Arya\" yang berarti \"Tanah Bangsa Arya\". Iran berbatasan dengan Azerbaijan (500 km), dan Armenia (35 km) di barat laut, dan Laut Kaspia di utara, Turkmenistan(1000 km) di timur laut, Pakistan (909 km), dan Afganistan (936 km) di timur, Turki (500 km), dan Irak (1.458 km) di barat, dan perairan Teluk Persia, dan Teluk Oman di selatan.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Flag_of_Iran_%28official%29.svg/2000px-Flag_of_Iran_%28official%29.svg.png",
                "https://www.state.gov/wp-content/uploads/2019/04/Iran-2109x1406.jpg "));
        lstAsia.add(new NegaraAsia("Kamboja","Ibukota: Phnom Penh ","Mata Uang: Riel " +
                "Lagu Kebangsaan: Nokor Reach " +
                "Bahasa Nasional: Khnmer " +
                "Semboyan: Bangsa, Agama, Raja " +
                "Kerajaan Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14. Kamboja berbatasan dengan Thailand di sebelah barat, Laos di utara, Vietnam di timur, dan Teluk Thailand di selatan. Sungai Mekongdan Danau Tonle Sap melintasi negara ini. Menjelang kemerdekaannya, Negara Kesatuan Republik Indonesia banyak membantu negara Kamboja ini. Buku - buku taktik perang karangan perwira militer Indonesia banyak digunakan oleh militer Kamboja. Oleh karenanya, para calon perwira di militer Kamboja, wajib belajar dan dapat berbahasa Indonesia.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_Cambodia.svg/1200px-Flag_of_Cambodia.svg.png",
                "https://cdn.pixabay.com/photo/2017/07/31/21/32/royal-palace-2561254_960_720.jpg "));
        lstAsia.add(new NegaraAsia("Laos","Ibukota: Vientiane ","Mata Uang: Kip " +
                "Lagu Kebangsaan: Pheng Xat Lao " +
                "Bahasa Nasional: Lao " +
                "Semboyan: Perdamaian, Kemerdekaan, Demokrasi, Persautuan, dan Kemakmuran " +
                "Laos adalah sebuah Negara Republik yang dikelilingi oleh daratan dan terletak di bagian utara Semenanjung Indochina. Laos berasal dari kata Lan Xang yang artinya kerajaan gajah. Negara ini adalah satu-satunya Negara di kawasan Asia Tenggara yang tidak memiliki pantai. Laos pernah dijajah oleh Prancis dan memperoleh kemerdekaan pada 22 Oktober 1953 dalam bentuk kerajaan. Sejak 3 Desember 1975 kerajan Laos berubah menjadi Republik Laos. Laos adalah salah satu negara komunis dengan kepala pemerintahan berupa presiden yang bernama Choummaly Sayasone dan dibantu oleh perdana menteri yang bernama Bouasone Bouphavanh. Jika dilihat dari sudut pandang Geografi Politik, letak wilayah negara Laos yang tidak memiliki wilayah laut atau pantai dikenal dengan sebutan kawasan land-lock. Kondisi ini dianggap kurang menguntungkan dari segi pertahanan dan keamanan, khususnya dari serangan atau invasi bangsa lain. Negara Laos mempunyai lembah sungai subur sehingga banyak menghasilkan tanaman pertanian dan perkebunan, terutama padi, kopi, dan tembakau",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Flag_of_Laos.svg/2000px-Flag_of_Laos.svg.png",
                "https://d2v9y0dukr6mq2.cloudfront.net/video/thumbnail/NMTm6g3Kxik80guth/pha-that-luang-temple-landmark-travel-place-of-vientiane-laos_ryswvye__F0010.png "));
        lstAsia.add(new NegaraAsia("Malaysia","Ibukota: Kuala Lumpur ","Mata Uang: Ringgit " +
                "Lagu Kebangsaan: Negaraku " +
                "Bahasa Nasional: Melayu " +
                "Semboyan: Persatuan Menambah Keunggulan " +
                "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggaradengan luas 329.847 km persegi. Ibukotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal. Jumlah penduduk negara ini mencapai 30.697.000 jiwa pada tahun 2015. Negara ini dipisahkan ke dalam dua kawasan — Malaysia Barat dan Malaysia Timur — oleh Kepulauan Natuna, wilayah Indonesia di Laut Tiongkok Selatan. Malaysia berbatasan dengan Thailand, Indonesia, Singapura, Brunei, dan Filipina. Negara ini terletak di dekat khatulistiwa dan beriklim tropika. Kepala negaraMalaysia adalah seorang Raja atau seorang Sultan yang dipilih secara bergiliran setiap 5 tahun sekali, hanya negeri-negeri (negara bagian) yang diperintah oleh Raja/Sultan saja yang diperbolehkan mengirimkan wakilnya untuk menjadi Raja Malaysia. Raja Malaysia biasanya memakai gelar Sri Paduka Baginda Yang di-Pertuan Agong",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Flag_of_the_British_East_India_Company_%281801%29.svg/2000px-Flag_of_the_British_East_India_Company_%281801%29.svg.png",
                "https://cdn.theculturetrip.com/wp-content/uploads/2017/03/14388080334_230751d706_k.jpg"));
        lstAsia.add(new NegaraAsia("Srilangka","Ibukota: Sri Jayawardenapura Kotte ","Mata Uang: Rupee Sri Lanka " +
                "Lagu Kebangsaan: Sri Lanka Matha " +
                "Bahasa Nasional: Sinhala dan Tamil " +
                "Semboyan:- " +
                "Republik Sosialis Demokratik Sri adalah sebuah negara pulau di sebelah utara Samudera Hindia di pesisir tenggara India. Sri Lanka berbatasan laut dengan India di sebelah barat laut dan dengan Maladewa di barat daya. Hingga tahun 1972, dunia internasional menyebut negara ini Ceylon. Dokumen-dokumen menunjukkan bahwa Sri Lanka memiliki sejarah lebih dari 3000 tahun. Karena lokasi geografis yang sangat strategis, memungkinkan Sri Lanka sebagai salah satu tempat perhentian dari masa Jalur Sutra hingga Perang Dunia II. Sri Lanka merupakan negera yang beragam, dihuni oleh masyarakat yang berbeda akan agama, suku, dan bahasa. Sri Lanka memiliki warisan Buddha yang sangat kaya, yang di mana tulisan Buddha pertama ditulis di negara ini",
                "http://flagpedia.net/data/flags/ultra/lk.png",
                "http://4.bp.blogspot.com/-oBvrDtTW5j0/VrAIk0qS3eI/AAAAAAAABWY/NgQ8IoaPLFs/s1600/Ancient%2Bcity%2Bof%2B%2BAnuradhapura.jpg "));
        lstAsia.add(new NegaraAsia("Thailand","Ibukota: Bangkok ","Mata Uang: Thai Bhat " +
                "Lagu Kebangsaan: Phleng Chat Thai " +
                "Bahasa Nasional: Bahasa Thai " +
                "Semboyan: Chat, Satsana, Phra Maha Kasat " +
                "Kerajaan Thai yang lebih sering disebut Thailand dalam bahasa Inggris, atau dalam bahasa aslinya Mueang Thai (dibaca: \"meng-thai\", sama dengan versi Inggrisnya, berarti \"Negeri Thai\"), adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat. Kerajaan Thai dahulu dikenal sebagai Siam sampai tanggal 11 Mei 1949. Kata \"Thai\" berarti \"kebebasan\" dalam bahasa Thai, namun juga dapat merujuk kepada suku Thai, sehingga menyebabkan nama Siam masih digunakan di kalangan warga negara Thai terutama kaum minoritas Tionghoa dan Amerika.",
                "http://flagpedia.net/data/flags/ultra/th.png",
                "https://www.smartertravel.com/uploads/2017/04/shutterstock_418323238-1400x500.jpg "));

        showRecycler();
    }

    private void showRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        NegaraAsiaAdapter adapterAsia = new NegaraAsiaAdapter(this, lstAsia);
        recyclerView.setAdapter(adapterAsia);
    }
}