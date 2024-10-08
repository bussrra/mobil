package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        int cevre,kisa,uzun,alan;

        Scanner oku= new Scanner(System.in);

        System.out.println("Kısa Kenar Gir:");
        kisa=oku.nextInt();

        System.out.println("Uzun Kenar Gir");
        uzun=oku.nextInt();

        cevre=2*(uzun+kisa);
        alan=kisa*uzun;

        System.out.println("Çevre:"+cevre);
        System.out.println("Alan:"+alan);





    }
}
