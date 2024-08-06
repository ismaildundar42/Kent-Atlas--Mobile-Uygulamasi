package com.ismail.turkiyekentlerininsimgeleri;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.ismail.turkiyekentlerininsimgeleri.databinding.ActivityMainSehirBilgiBinding;

public class MainSehirBilgi extends AppCompatActivity {

    private ActivityMainSehirBilgiBinding binding;
    public String secilmisURLtext;
    public String sehirAdi;
    public String secilmisBilgitext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainSehirBilgiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        sehirBilgileri secilmisSehir = (sehirBilgileri) intent.getSerializableExtra("sehirdetay");

        if (secilmisSehir != null) {
            binding.txtYapitAdi.setText(secilmisSehir.yapiAdi);
            sehirAdi = secilmisSehir.sehir;
            binding.txtSehirAdi.setText(secilmisSehir.sehir);
            binding.imageView.setImageResource(secilmisSehir.resim);
            secilmisURLtext = secilmisSehir.konum;
            secilmisBilgitext = secilmisSehir.bilgi;
        }
    }

    public void konumaGit(View view) {
        Uri gmmIntentUri = Uri.parse(secilmisURLtext);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            startActivity(browserIntent);
        }
    }

    public void DetayliBilgi(View view) {
        Intent intent = new Intent(MainSehirBilgi.this, MainSehirDetayBilgi.class);
        intent.putExtra("sehrinadi",sehirAdi);
        intent.putExtra("bilgi", secilmisBilgitext);
        startActivity(intent);
    }
}
