package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static int[] array = new int[5];

	public static void main(String[] args) {

		randomNum();
		
		InputUtente nuovo = new InputUtente();
		nuovo.sceltaUtente();
		
	}
	
	public static void randomNum() {
		Random num = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = num.nextInt(11); //numero random max 10
			System.out.println("Array n." + (i + 1) + " = " + array[i]);
		}
	}

}
/* ﻿

Esercizio #1
Scrivere un programma che istanzi un array di 5 interi con valori causali tra 1 e 10 e lo stampi in console, chieda poi all'utente di inserire un numero in una posizione specificata e stampi il nuovo stato dell'array, ripetere l'operazione fino a che l'utente non inserisce il valore 0. Gestire eventuali errori dovuti alla violazione dei limiti dell'array.
*/