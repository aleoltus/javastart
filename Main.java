package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("hej co tam? Jak sie nazywasz? ");
	Scanner odczyt = new Scanner(System.in);
	String imie = odczyt.nextLine();

	System.out.println(imie);

	System.out.println("Podaj liczbe od 1 do 9");
	System.out.println("hej hej podaj liczbe");

	Scanner liczba = new Scanner(System.in);
	int a = liczba.nextInt();


	for(int i = a; i<=10;i++){
	    System.out.println(i);
    }
	System.out.println("koniec petli");


    }
}
