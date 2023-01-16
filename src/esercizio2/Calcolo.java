package esercizio2;

import java.util.Scanner;

public class Calcolo {
	double km, carburante, risultato;
	Scanner in = new Scanner(System.in);
	
	public void avvio() {
		try {
			System.out.println("Inserisci il numero di km percorsi");
			km = Integer.parseInt(in.nextLine());
			System.out.println("Inserisci i litri di carburante consumati");
			carburante = Integer.parseInt(in.nextLine());
			if(carburante != (int)carburante) {
				throw new NumberFormatException();
			}
			
			if(carburante == 0.0){
		            throw new ArithmeticException("Errore: non è possibile dividere per zero.");
			}
			risultato = km/carburante;
			System.out.printf("Hai percorso %.1f km per una media di %.1fkm per litro.", km, risultato);
			
			in.close();
		}
		catch (NumberFormatException e) {
			System.out.println("Il valore non è consentito!");
		}
		catch (ArithmeticException e) {
		  System.out.println(e.getMessage());
		}

		
	}
}

/*Esercizio #2
Scrivere un programma che permetta di calcolare il numero di km/litro percorsi da un'auto. Il programma riceve dall'utente il numero di km percorsi ed i litri di carburante consumati e stampa i km/litro percorsi. Gestire per mezzo del try-catch l'eventualità che l'utente inserisca il valore O per il numero di litri consumati e venga generata una eccezione di divisione per zero. 
 */