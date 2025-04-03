package lezione7;

import java.util.Random;
import java.util.Scanner;

public class MenuEsercizio {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
		
		
		stampaMenu(); 
		char scelta; 
		
		
		
		do {
			
			scelta = s.next().charAt(0);
			switch(scelta) {
			case 'g':
			case '1':
				tombola();
				
				break;
			case 'c': 
			case '2':
				System.out.println("Hai scelto di calcolare qualcosa....");
				calcola();
				
				break;
			case 'd':
				dadi();
				break;
				
			case 'q':
				System.out.println("Stai uscendo dal programma...");
				break;
			default:
				System.out.println("Scelta non valida. Riprova.");
			}
			
			System.out.println();
			
		}while(scelta != 'q' && scelta != 'Q');
		
			
		System.out.println("Hai chiuso il programma");
		
		s.close();
		
	}

	public static void stampaMenu() {

	
		System.out.println("-----MENU-----");
		System.out.println("1. GIOCA TOMBOLA (g)");
		System.out.println("2. Calcola (c)");
		System.out.println("3. Gioca ai dadi(d)");
		System.out.println("4. Esci (q)");
		System.out.println("--------------");
	}
	
	public static void tombola() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanti num vuoi estrarre ? ");
		int dimensione = scan.nextInt();
		
		int [] numeriCasuali = new int[dimensione];
		Random rand = new Random();
		int contatore = 0;  
		
		while (contatore < dimensione) {
			int numeroSingoloCasuale =  rand.nextInt(90)+1;
			
			boolean presente = false;
			
			for (int i = 0; i < contatore; i++) { // i<contatore significa che ogni volta che contatore aumenta il for fa un giro
				if(numeriCasuali[i] == numeroSingoloCasuale) {
					presente = true;
					break;
				}
			}
			if(!presente) {
				numeriCasuali[contatore]= numeroSingoloCasuale;
				contatore++;
			}       
		}
		
		for (int i : numeriCasuali) {
			System.out.println(i);
		}
		
		System.out.println("Tombola chiusa");
		System.out.println();
		
		stampaMenu();
	}
	
	
	public static void calcola() { //passando i valori nel 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci i numeri");
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();

		System.out.println("Inserisci l'operatore matematico(+ , - , * , /)");
		char operatore = s.next().charAt(0);
		//usa i casi per ogni operatore
		double operazione = 0;
		
		
		switch (operatore){
		case '+':
			operazione = num1+num2;
			break;
		case'-':
			operazione = num1-num2;
			break;
		case'*':
		case'x':
			operazione = num1*num2;
			break;
		case'/':
		case':':
			
			operazione = num1/num2; 
			
			
			}
		
		System.out.println(operazione);
			
		System.out.println();
		stampaMenu();
		}
	
	public static void dadi() {
		
		
			Scanner s = new Scanner(System.in);
			System.out.println("Inserisci il numero di facce del dado, premi q per tornare al menu");
			int facce = s.nextInt();
			Random rand = new Random();
			int risultato1 = rand.nextInt(facce) + 1;
			int risultato2 = rand.nextInt(facce) + 1;
			
			for (int i = 0; i < 2; i++) {
				if(facce<2) {
					System.out.println("un dado deve avere almeno 2 facce");
					stampaMenu();
					return;
					
				}
				else {
					
				}
			}
			System.out.println("Il risultato1 è "+ risultato1);
			System.out.println("Il risultato2 è "+ risultato2);
			
			if(risultato1==risultato2) {
				System.out.println("Hai Vinto!");
			}else {
				System.out.println("Hai Perso!");
			}
			
			System.out.println();
			stampaMenu();
			
;		
		
	
		
		
		
	}


}
