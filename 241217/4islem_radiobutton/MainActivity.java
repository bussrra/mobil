package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber_sayi1, editTextNumber_sayi2;

    RadioGroup radioButton1_topla,radioButton2_cikar,radioButton3_carp,radioButton4_bol;

    Button button_hesapla;
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

        editTextNumber_sayi1=findViewById(R.id.editTextNumber_sayi1);
        editTextNumber_sayi2=findViewById(R.id.editTextNumber_sayi2);
        radioButton1_topla=findViewById(R.id.radioButton1_topla);
        radioButton2_cikar=findViewById(R.id.radioButton2_cikar);
        radioButton3_carp=findViewById(R.id.radioButton3_carp);
        radioButton4_bol=findViewById(R.id.radioButton4_bol);
        button_hesapla=findViewById(R.id.button_hesapla);
        textView_sonuc=findViewById(R.id.textView_sonuc);

        button_hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sayi1=Double.parseDouble(editTextNumber_sayi1.getText().toString());
                double sayi2=Double.parseDouble(editTextNumber_sayi2.getText().toString());
                double sonuc=0;
                if(radioButton1_topla.createAccessibilityNodeInfo().isChecked()){
                    sonuc=sayi1+sayi2;
                } else if (radioButton2_cikar.createAccessibilityNodeInfo().isChecked()) {
                    sonuc=sayi1-sayi2;
                } else if (radioButton3_carp.createAccessibilityNodeInfo().isChecked()) {
                    sonuc=sayi1*sayi2;

                }
                else{
                    sonuc=sayi1/sayi2;
                }

                textView_sonuc.setText("Sonuç: "+sonuc);
            }
        });
    }
}