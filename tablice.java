package com.company;

import java.util.Scanner;

public class tablice {
    public static void main(String[] args){
        int[] tab = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj 3 liczby ");
        for(int i = 0; i<tab.length; i++) {
            tab[i] = input.nextInt();
           // System.out.println(tab[i]);
        }
        System.out.println("Nasze liczby to ");
        for(int i = 0;i <tab.length; i++)
            System.out.println(tab[i]);


    }
}
