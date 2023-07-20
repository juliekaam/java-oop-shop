package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Prodotto product1=new Prodotto("camiccia", "lana", 20.85,0.4);
// testo le funzionalità

        System.out.println( "prodotto esteso: "+ product1);
        System.out.println("descrizione: "+ product1.getDescription());

        System.out.println("prezzo base: " + product1.initialPrice());
        System.out.println("iva: "+ product1.getIva());
        System.out.println("prezzo finale: " + product1.finalPrice());

        // modifico i valori del prodotto

        product1.setName("Gonna lunga");
        product1.setDescription("Jeans");
        product1.setPrice(52.99);
        product1.setIva(0.5);


        //stampo a video il prodotto
        System.out.println( "prodotto esteso: "+ product1);
        System.out.println("descrizione: "+ product1.getDescription());
        System.out.println("prezzo base: " + product1.initialPrice());
        System.out.println("iva: "+ product1.getIva());
        System.out.println("prezzo finale: " + product1.finalPrice());

    }
}
