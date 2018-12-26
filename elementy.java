package com.company;

import java.util.Scanner;

public class elementy {
    public static void main(String[] args){
        System.out.println("Podaj liczbe elementow ");
        Scanner odczyt = new Scanner(System.in);
        int liczba = odczyt.nextInt();

        for(int i = 0; i < liczba;  i++)
            System.out.println(i);

    }
}
