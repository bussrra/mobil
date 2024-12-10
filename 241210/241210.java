package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et_sayi1, et_sayi2;
    Button button_topla , button_cikar , button_carp , button_bol;
    TextView tv_sonuc;

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

        et_sayi1=findViewById(R.id.et_sayi1);
        et_sayi2=findViewById(R.id.et_sayi2);
        button_topla=findViewById(R.id.button_topla);
        button_cikar=findViewById(R.id.button_cikar);
        button_carp=findViewById(R.id.button_carp);
        button_bol=findViewById(R.id.button_bol);
        tv_sonuc=findViewById(R.id.tv_sonuc);

        button_topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(et_sayi1.getText().toString());
                int sayi2=Integer.parseInt(et_sayi2.getText().toString());
                int sonuc=sayi1+sayi2;
                tv_sonuc.setText("Sonuç: "+sonuc);
            }
        });

        button_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(et_sayi1.getText().toString());
                int sayi2=Integer.parseInt(et_sayi2.getText().toString());
                int sonuc=sayi1-sayi2;
                tv_sonuc.setText("Sonuç: "+sonuc);
            }
        });

        button_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(et_sayi1.getText().toString());
                int sayi2=Integer.parseInt(et_sayi2.getText().toString());
                int sonuc=sayi1*sayi2;
                tv_sonuc.setText("Sonuç: "+sonuc);
            }
        });

        button_bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(et_sayi1.getText().toString());
                int sayi2=Integer.parseInt(et_sayi2.getText().toString());
                float sonuc;

                if(sayi2!=0){
                    sonuc=sayi1/sayi2;
                    tv_sonuc.setText("Sonuç: "+sonuc);
                }
                else
                {
                    tv_sonuc.setText("Sıfıra Bölme Hatası!!!");
                }
            }
        });
    }
}