package com.company;

import java.util.Scanner;

public class wieletab {
    public static void main(String[] args){
        System.out.println("Podaj 4 liczby ");
        Scanner input = new Scanner(System.in);
        int[][] tab = new int[2][2];

        for(int i = 0; i< tab.length;  i++)
            for (int j = 0; j<tab.length; j++)
                tab[i][j] = input.nextInt();

        for(int i = 0; i<tab.length; i++)
            for(int j = 0; j<tab.length; j++)
                System.out.println(tab[i][j]);


       // for (int[] x : tab) System.out.println(x);

    }
}
