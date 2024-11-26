package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        int sayi1;

        System.out.print("1. Sayı: ");
        sayi1= oku.nextInt();
        int toplam=kare(sayi1);
        System.out.println("Sonuç: "+toplam);
    }

    public static int kare(int sayi1 )
    {
        int sonuc=sayi1*sayi1;
        return sonuc;
    }

}
