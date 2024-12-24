package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxCorba,checkBoxPilav,checkBoxLahmacun,checkBoxSarma;
    Button buttonSiparisVer;
    TextView textViewSiparisOzet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBoxCorba=findViewById(R.id.checkBoxCorba);
        checkBoxPilav=findViewById(R.id.checkBoxPilav);
        checkBoxLahmacun=findViewById(R.id.checkBoxLahmacun);
        checkBoxSarma=findViewById(R.id.checkBoxSarma);
        buttonSiparisVer=findViewById(R.id.buttonSiparisVer);
        textViewSiparisOzet=findViewById(R.id.textViewSiparisOzet);

        buttonSiparisVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbaFiyat = 50, pilavFiyat = 150, lahmacunFiyat = 75, sarmaFiyat = 70, baklavaFiyat = 250;
                float toplamTutar = 0;
                String s = "Sipariş Özeti:\n--------------\n";

                if (checkBoxCorba.isChecked()) {
                    toplamTutar += corbaFiyat;
                    s += "-Çorba\n";
                }
                if (checkBoxPilav.isChecked()) {
                    toplamTutar += pilavFiyat;
                    s += "-Pilav\n";
                }
                if (checkBoxLahmacun.isChecked()) {
                    toplamTutar += lahmacunFiyat;
                    s += "-Lahmacun\n";
                }
                if (checkBoxSarma.isChecked()) {
                    toplamTutar += sarmaFiyat;
                    s += "-Sarma\n";
                }


                textViewSiparisOzet.setText(s + "--------------\nToplam Tutar: " + toplamTutar);


            }
        });
    }
}