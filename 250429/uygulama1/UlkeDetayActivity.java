package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UlkeDetayActivity extends AppCompatActivity {

    ImageView ivResim;
    TextView tvAd, tvBaskent,tvNufus,tvDil,tvParaBirimi,tvTel,tvAciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ulke_detay);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ivResim= findViewById(R.id.iv_ud_resim);
        tvAd= findViewById(R.id.tv_ud_ad);
        tvBaskent= findViewById(R.id.tv_ud_baskent);
        tvNufus= findViewById(R.id.tv_ud_nufus);
        tvDil= findViewById(R.id.tv_ud_dil);
        tvParaBirimi= findViewById(R.id.tv_ud_parabirimi);
        tvTel= findViewById(R.id.tv_ud_tckod);
        tvAciklama= findViewById(R.id.tv_ud_aciklama);

        Intent intent=getIntent();
        Ulke ulke =(Ulke)intent.getSerializableExtra("tiklananUlke");


        ivResim.setImageResource(ulke.getBayrak());
        tvAd.setText(ulke.getAd());
        tvBaskent.setText((ulke.getBaskent()));
        tvNufus.setText(ulke.getNufus());
        tvDil.setText(String.valueOf(ulke.getNufus()));
        tvParaBirimi.setText(ulke.getParaBirimi());
        tvTel.setText(ulke.getTelefonKodu());
        tvAciklama.setText(ulke.getAciklama());


    }
}