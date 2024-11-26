package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        //0-200 2tl
        // 200 - 300 2.5tl
        // 300 üstü 4tl

        System.out.println("kullandığınız Elektrik Tüketimi: "+faturaHesapla(150));
        System.out.println("kullandığınız Elektrik Tüketimi: "+faturaHesapla(300));
        System.out.println("kullandığınız Elektrik Tüketimi: "+faturaHesapla(350));

        System.out.println("çok Kullanmışsın Az kullan: "+faturaHesapla(350));

    }

    private static double faturaHesapla(double miktar)
    {
        double ucret=0;
        if(miktar<=200)
        {

           ucret=miktar*2;
        }
        else if(miktar<=300){
            ucret = 200*2 + (miktar-200) *2.5;
        }
        else
        {
            ucret = 200*2 + 100*2.5+(miktar-300)*3;
        }
        return ucret;
    }
}
