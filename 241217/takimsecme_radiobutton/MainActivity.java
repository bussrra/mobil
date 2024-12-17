package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_kapak;
    RadioButton radioButton_fb,radioButton_bjk,radioButton_ts,radioButton_gs;
    Button button_sec;

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

        imageView_kapak=findViewById(R.id.imageView_kapak);
        radioButton_fb=findViewById(R.id.radioButton_fb);
        radioButton_bjk=findViewById(R.id.radioButton_bjk);
        radioButton_ts=findViewById(R.id.radioButton_ts);
        radioButton_gs=findViewById(R.id.radioButton_gs);
        button_sec=findViewById(R.id.button_sec);

        button_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton_fb.isChecked()){
                    imageView_kapak.setImageResource(R.drawable.fb);
                } else if (radioButton_bjk.isChecked()) {
                    imageView_kapak.setImageResource(R.drawable.bjk);
                } else if (radioButton_ts.isChecked()) {
                    imageView_kapak.setImageResource(R.drawable.ts);
                }
                else{
                    imageView_kapak.setImageResource(R.drawable.gs);
                }

            }
        });
    }
}