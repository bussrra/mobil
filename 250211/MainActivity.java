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

    EditText editText_dersAdi,editText_yazili1,editText_yazili2;
    Button button_kaydet;
    TextView textView_sonuc;

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

        editText_dersAdi=findViewById(R.id.editText_dersAdi);
        editText_yazili1=findViewById(R.id.editText_Yazili1);
        editText_yazili2=findViewById(R.id.editText_Yazili2);
        button_kaydet=findViewById(R.id.button_kaydet);
        textView_sonuc=findViewById(R.id.textView_sonuc);

        button_kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dersAdi = editText_dersAdi.getText().toString();
                double yazili1= Double.parseDouble(editText_yazili1.getText().toString());
                double yazili2= Double.parseDouble(editText_yazili2.getText().toString());

                Ders ders=new Ders(dersAdi,yazili1,yazili2);
                double ortalama=ders.ortalamaHesaplama();
                String durum= ders.gectiMi();

                textView_sonuc.setText(ders.getDersAdi() +  " Dersin Ortalaması :  "  +ortalama+ "(" +durum+ ")");
            }
        });
    }
}