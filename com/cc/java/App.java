package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
    Konto konto1 = new Konto(10000);
    Konto konto2 = new Konto(10000);
    Konto konto3 = new Konto(10000);

    // Anfangswerte
    konto1.outputKontostand();
    konto2.outputKontostand();
    konto3.outputKontostand();

    // Update
    konto1.updateKontostand(2);
    konto2.updateKontostand(3);
    konto3.updateKontostand(10);

    // Neuer Kontostand
    konto1.outputKontostand();
    konto2.outputKontostand();
    konto3.outputKontostand();



    }

}

