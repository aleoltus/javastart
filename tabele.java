package com.company;

public class tabele {
    public static void main(String[] args){

        int[] tablica = new int[10];

        for(int i = 0; i <10; i++){
            tablica[i] = i+1;
        }
        int zmienna = tablica[3];

        for(int i =0; i<10; i++)
            System.out.println("Kolejkna  komorka to "+tablica[i]);

        System.out.println("nasza zmienna to " +zmienna);
    }
}
