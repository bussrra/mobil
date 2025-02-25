package com.example.uygulama1;

public class Araba {
    private String marka;
    private String model;
    private int sonHiz;
    private int anlikHiz;
    private boolean calisiyorMu;


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSonHiz() {
        return sonHiz;
    }

    public void setSonHiz(int sonHiz) {
        this.sonHiz = sonHiz;
    }

    public int getAnlikHiz() {
        return anlikHiz;
    }

    public void setAnlikHiz(int anlikHiz) {
        if(anlikHiz<=0){ //araç hızının negatif duruma düşmesini engelledik
            this.anlikHiz=0;
        }
        else if(anlikHiz>sonHiz) {// arabanın hızını sonlandırdık
            this.anlikHiz = sonHiz;
        }

        else{  // Diğer durumlarda hızını belirledik.

            this.anlikHiz=anlikHiz;
        }
    }


    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

    public void setCalisiyorMu(boolean calisiyorMu) {
        this.calisiyorMu = calisiyorMu;
    }

    public Araba(String marka, String model, int sonHiz) {
        this.marka = marka;
        this.model = model;
        this.sonHiz = sonHiz;
        this.anlikHiz=0; //Varsayılan Hız
        this.calisiyorMu=false; //Başlangıçta çalışmıyor
    }

    //Fonksiyonlarımızı çalıştıralım ----  4 adet anlık hız oluşturuldu

    public String calistir(){
        if(calisiyorMu){ //Araba çalışıyorsa
            return "Araba zaten çalışıyor.";
        }
        calisiyorMu=true;
        return "Araba çalışıyor.";
    }

    public String durdur(){
        if(anlikHiz>0){
            return "Arabanın Hızı"+anlikHiz+"km/h olduğu için durdurulmadı.";
        }
        if(calisiyorMu){ //Araç çalışıyorsa
            calisiyorMu=false; //durdur
            return "Araba durduruldu."; //geriye mesajı yolla
        }
        else{
            return "Araba zaten durdurulmuş."; //Araç zaten durdurulmuşsa
        }
    }

    public void hizlan(int hiz){
        if(calisiyorMu){
            setAnlikHiz(anlikHiz+hiz); // Doğrudan setter metodunu kullanıyoruz
        }
    }

    public void yavasla(int hiz){
        if(calisiyorMu){
            setAnlikHiz(anlikHiz-hiz);
        }
    }
}
