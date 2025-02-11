package com.example.uygulama1;

public class Ders {
    private String dersAdi;
    private double yazili1;
    private double yazili2;

    public Ders(String dersAdi, double yazili1,double yazili2){
        this.dersAdi=dersAdi;
        this.yazili1=yazili1;
        this.yazili2=yazili2;
    }

    public double ortalamaHesaplama(){
        return (yazili1+yazili2)/2;
    }

    public String gectiMi(){
        return ortalamaHesaplama() >=50 ?  "Geçti" : "Kaldı";
    }

    public String getDersAdi(){
        return dersAdi;
    }
}
