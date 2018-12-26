package com.company;

import java.util.Scanner;

public class imiona {
    public static void main(String[] args){
        String[] tab = new String[5];

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj 5 imion ");
        for(int i =0; i < 5 ; i++ ){
            tab[i] = odczyt.nextLine();
        }

        for (int i =0; i<5; i++){
            System.out.println("Witaj "+tab[i]);
        }
    }
}
