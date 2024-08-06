package com.ismail.turkiyekentlerininsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Hoşgeldiniz",Toast.LENGTH_LONG).show();
    }
    public void Basla(View view)
    {
        Intent intent = new Intent(MainActivity.this,MainListe.class);
        startActivity(intent);
    }
}