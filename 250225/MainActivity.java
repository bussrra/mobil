package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_calistir,btn_yavasla,btn_hizlan,btn_durdur;
    private TextView tv_durum;
    private Araba araba;
    String durum=""; //Global olarak tanımladık. Durum bilgisinde kullanacağız.

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

        araba=new Araba("Toyota","Corolla",220);
        durum="Durum:\n"+"Marka: "+araba.getMarka()+"\n"+"Model: "+araba.getModel()+"\n"+"Son Hız: "+araba.getSonHiz()+"km/h\n";

        btn_calistir=findViewById(R.id.btn_calistir);
        btn_durdur=findViewById(R.id.btn_durdur);
        btn_hizlan=findViewById(R.id.btn_hizlan);
        btn_yavasla=findViewById(R.id.btn_yavasla);
        tv_durum=findViewById(R.id.tv_durum);

        btn_calistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_durum.setText(durum+araba.calistir());

            }
        });

        btn_yavasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.yavasla(10);
                tv_durum.setText(durum+"Arabanın Hızı: "+araba.getAnlikHiz()+"km/h");

            }
        });

        btn_hizlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.hizlan(20); //parametre olarak verdiğimiz değere kadar hız artar
                tv_durum.setText(durum+"Arabanın Hızı: "+araba.getAnlikHiz()+"km/h");

            }
        });

        btn_durdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_durum.setText(durum+araba.durdur());

            }
        });
    }


}