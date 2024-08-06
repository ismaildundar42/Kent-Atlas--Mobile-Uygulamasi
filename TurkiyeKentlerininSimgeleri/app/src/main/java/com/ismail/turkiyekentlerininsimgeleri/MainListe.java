package com.ismail.turkiyekentlerininsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ismail.turkiyekentlerininsimgeleri.databinding.ActivityMainListeBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListe extends AppCompatActivity {

    private ActivityMainListeBinding binding;

    public static ArrayList<sehirBilgileri> sehirBilgileriArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainListeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        sehirBilgileriArray = new ArrayList<>();

        sehirBilgileri konya = new sehirBilgileri("Mevlana", "Konya", R.drawable.konya,
                "https://l24.im/2RFqA",
                "Plaka : 42\n" +
                        "Nüfus : 2.5 Milyon\n" +
                        "Yöresel Yemeği : Etliekmek\n" +
                        "Şehrin Takımı : Konyaspor\n" +
                        "Ulaşım : Uçak-YHT-Otobüs\n" +
                        "Turistlik Yerler : Mevlana Müzesi, Sille, Japon Parkı, Kelebek Bahçesi");

        sehirBilgileri istanbul = new sehirBilgileri("Galata Kulesi", "İstanbul", R.drawable.istanbul,
                "https://l24.im/QvRJ",
                "Plaka : 34\n" +
                        "Nüfus : 15.5 Milyon\n" +
                        "Yöresel Yemeği : Kumpir\n" +
                        "Şehrin Takımı : Galatasaray, Fenerbahçe, Beşiktaş\n" +
                        "Ulaşım : Uçak-İDO-Metro\n" +
                        "Turistlik Yerler : Galata Kulesi, Topkapı Sarayı, Ayasofya, Sultanahmet Camii");

        sehirBilgileri ankara = new sehirBilgileri("Anıtkabir", "Ankara", R.drawable.ankara,
                "https://l24.im/FvpM4Ly",
                "Plaka : 06\n" +
                        "Nüfus : 5.6 Milyon\n" +
                        "Yöresel Yemeği : Ankara Tava\n" +
                        "Şehrin Takımı : Ankaragücü, Gençlerbirliği\n" +
                        "Ulaşım : Uçak-YHT-Otobüs\n" +
                        "Turistlik Yerler : Anıtkabir, Atakule, Gençlik Parkı, Anadolu Medeniyetleri Müzesi");

        sehirBilgileri kayseri = new sehirBilgileri("Erciyes Dağı", "Kayseri", R.drawable.erciyes,
                "https://l24.im/ADTmQXj\n",
                "Plaka : 38\n" +
                        "Nüfus : 1.4 Milyon\n" +
                        "Yöresel Yemeği : Mantı\n" +
                        "Şehrin Takımı : Kayserispor\n" +
                        "Ulaşım : Uçak-Otobüs\n" +
                        "Turistlik Yerler : Erciyes Dağı, Kapuzbaşı Şelaleleri, Kayseri Kalesi, Hunat Hatun Külliyesi");

        sehirBilgileri afyon = new sehirBilgileri("Karahisar Kalesi", "Afyonkarahisar", R.drawable.afyondag5,
                "https://l24.im/1OzHEwL\n",
                "Plaka : 03\n" +
                        "Nüfus : 725 Bin\n" +
                        "Yöresel Yemeği : Afyon Kaymağı\n" +
                        "Şehrin Takımı : Afjet Afyonspor\n" +
                        "Ulaşım : Uçak-Otobüs\n" +
                        "Turistlik Yerler : Karahisar Kalesi, Frig Vadisi, İkbal Termal Otel, Zafer Müzesi");

        sehirBilgileri trabzon = new sehirBilgileri("Uzungöl", "Trabzon", R.drawable.uzungol,
                "https://l24.im/CG8z",
                "Plaka : 61\n" +
                        "Nüfus : 816 Bin\n" +
                        "Yöresel Yemeği : Hamsiköy Sütlacı\n" +
                        "Şehrin Takımı : Trabzonspor\n" +
                        "Ulaşım : Uçak-Otobüs\n" +
                        "Turistlik Yerler : Uzungöl, Sümela Manastırı, Ayasofya Müzesi, Atatürk Köşkü");

        sehirBilgileri antalya = new sehirBilgileri("Düden Şelalesi", "Antalya", R.drawable.duden,
                "https://l24.im/6VWolzF\n",
                "Plaka : 07\n" +
                        "Nüfus : 2.5 Milyon\n" +
                        "Yöresel Yemeği : Piyaz\n" +
                        "Şehrin Takımı : Antalyaspor\n" +
                        "Ulaşım : Uçak-Otobüs\n" +
                        "Turistlik Yerler : Düden Şelalesi, Kaleiçi, Olympos Antik Kenti, Konyaaltı Plajı");

        sehirBilgileri malatya = new sehirBilgileri("Günpınar Şelalesi", "Malatya", R.drawable.gurpinarjpg,
                "https://l24.im/YHCTly\n\n",
                "Plaka : 44\n" +
                        "Nüfus : 800 Bin\n" +
                        "Yöresel Yemeği : Kayısı Tatlısı\n" +
                        "Şehrin Takımı : Yeni Malatyaspor\n" +
                        "Ulaşım : Uçak-Otobüs\n" +
                        "Turistlik Yerler : Gürpınar Şelalesi, Nemrut Dağı, Malatya Müzesi, Battalgazi Ulu Camii");

        sehirBilgileri adana = new sehirBilgileri("Taş Köprü", "Adana", R.drawable.taskopru,
                "https://l24.im/IlYHfyp\n",
                "Plaka : 01\n" +
                        "Nüfus : 2.2 Milyon\n" +
                        "Yöresel Yemeği : Adana Kebabı\n" +
                        "Şehrin Takımı : Adana Demirspor, Adanaspor\n" +
                        "Ulaşım : Uçak-Otobüs\n" +
                        "Turistlik Yerler : Taş Köprü, Sabancı Merkez Camii, Adana Arkeoloji Müzesi, Atatürk Parkı");

        sehirBilgileri burdur = new sehirBilgileri(
                "Salda Gölü", "Burdur", R.drawable.salda,
                "https://l24.im/ri4jLfl\n", "Plaka : 15\n" +
                        "Nüfus : 300 Bin\n" +
                        "Yöresel Yemeği : Burdur Kebabı\n" +
                        "Şehrin Takımı : Burdurspor\n" +
                        "Ulaşım : Uçak-Otobüs\n" +
                        "Turistlik Yerler : Salda Gölü, Kremna Antik Kenti, Sagalassos Antik Kenti, Burdur Müzesi");


        sehirBilgileriArray.add(konya);
        sehirBilgileriArray.add(istanbul);
        sehirBilgileriArray.add(ankara);
        sehirBilgileriArray.add(kayseri);
        sehirBilgileriArray.add(afyon);
        sehirBilgileriArray.add(trabzon);
        sehirBilgileriArray.add(antalya);
        sehirBilgileriArray.add(malatya);
        sehirBilgileriArray.add(adana);
        sehirBilgileriArray.add(burdur);

        //ListView'e verileri çekme işlemi
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                sehirBilgileriArray.stream().map(sehirBilgileri -> sehirBilgileri.sehir).collect(Collectors.toList()));

        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainListe.this,MainSehirBilgi.class);
                intent.putExtra("sehirdetay",sehirBilgileriArray.get(i));
                startActivity(intent);

                Intent intent2 = new Intent(MainListe.this,MainSehirDetayBilgi.class);
                intent2.putExtra("sehirdetay2",sehirBilgileriArray.get(i));
            }
        });



    }
}