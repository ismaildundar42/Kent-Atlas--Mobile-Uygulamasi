package com.ismail.turkiyekentlerininsimgeleri;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ismail.turkiyekentlerininsimgeleri.databinding.ActivityMainSehirDetayBilgiBinding;

public class MainSehirDetayBilgi extends AppCompatActivity {

    private ActivityMainSehirDetayBilgiBinding binding;
    private static final String TAG = "MainSehirDetayBilgi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainSehirDetayBilgiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        if (intent != null) {
            String bilgi = intent.getStringExtra("bilgi");
            String sehiradi = intent.getStringExtra("sehrinadi");
            if (bilgi != null) {
                binding.txtBilgi.setText(bilgi);
                binding.lblSehirAdi.setText(sehiradi);
            } else {
                Log.e(TAG, "Bilgi null döndü.");
                binding.txtBilgi.setText("Bilgi bulunamadı.");
            }
        } else {
            Log.e(TAG, "Intent null döndü.");
            binding.txtBilgi.setText("Bilgi bulunamadı.");
        }
    }
}
