package org.lessons.java.shop;

import java.util.Random;




import java.util.Random;

    public class Prodotto {
    /*Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
Il codice prodotto sia accessibile solo in lettura
Gli altri attributi siano accessibili sia in lettura che in scrittura
Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome: il codice deve avere un pad left di zeri per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
Nello stesso package aggiungete una classe Main con metodo main nella quale create uno o più prodotti e testate tutte le funzionalità della classe (cioè tutti i metodi public)
:aeroplano: BONUS 1:  Aggiungere una classe Categoria (con nome e descrizione) e associare ad ogni Prodotto una categoria usando la composizione
:razzo: BONUS 2: Permettere di associare più di una Categoria ad ogni prodotto (usare quindi una ArrayList di categorie come tipo di attributo)*/

        private int code;
        private String name;
        private String description;
        private double price;
        private double iva;

        //COSTRUTTORI

        public Prodotto( String name, String description, double price, double iva) {
            this.code=randomCode();
            this.name = name;
            this.description = description;
            this.price = price;
            this.iva = iva;
        }
        //GETTERS E SETTERS

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price ;
        }

        public double getIva() {
            return iva;
        }

        public void setIva(double iva) {
            this.iva = iva;
        }

        //METODI
        private int randomCode(){
            Random random=new Random();
            return random.nextInt(1,100000000);
        }

        public double initialPrice(){
            return Math.round(price*100.0)/100.0;
        }
        public double finalPrice(){
            return Math.round((price+ (price*iva))*100.0)/100.0;
        }

        @Override
        public String toString() {
            return name +"-"+ code;
        }
    }


