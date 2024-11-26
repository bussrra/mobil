package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        // iki sayı arasındaki farkı ekrana yazdıran
        // not sayıların farkı her zaman pozitif olsun

        Scanner oku= new Scanner(System.in);
        double s1,s2;

        System.out.print("1. Sayı: ");
        s1= oku.nextDouble();
        System.out.print("2. Sayı: ");
        s2= oku.nextDouble();

        double fark = farkHesapla(s1,s2);
        System.out.println("Fark: "+fark);
    }
    public static double farkHesapla(double s1, double s2)
    {
        if(s1 > s2)
        {
            return s1-s2;
        }
        else
        {
            return s2-s1;
        }
    }
}
