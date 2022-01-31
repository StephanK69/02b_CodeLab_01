package com.cc.java;

public class Konto {
    
    public int kontostand;

    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }

    public void updateKontostand(int faktor){
        this.kontostand *= faktor;
    }

    public void outputKontostand(){
        System.out.println(this.kontostand);
    }


}
