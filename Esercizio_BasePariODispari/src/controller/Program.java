package controller;

public class Program {

	public static void main(String[] args) {
		Utility u = new Utility();
//      dato u numero letto in input, dimmi se � positivo, negativo, pari o dispari		
//		Utility.isPositive(u.readString("inserisci il numero per vedere se � maggiore o minore di 0"));
//		Utility.isOdd(u.readString("inserisci il numero per vedere se � dispari"));	

//		Scrivere un algoritmo che presi 5 numeri in input compresi tra
//		5 e 15 dica, qual'� il maggiore, qual'� il minore,
//		qual'� il numero di "mezzo" dei 5;
//		e se qualche numero si ripete, quante ripetizioni abbiamo
		int num1 = u.readString("inserisci il primo numero");      
		int num2 = u.readString("inserisci il primo numero");     
		int num3 = u.readString("inserisci il primo numero");
		int num4 = u.readString("inserisci il primo numero");   
		int num5 = u.readString("inserisci il primo numero");
		int somma = num1 + num2 + num3 + num4 + num5;
		boolean check = u.checkAllNumbers(num1, num2, num3, num4, num5);
		if (check){
			System.out.println("la somma � " + somma);
			System.out.println("il numero maggiore �: " + u.maxOfFiveNum(num1,num2,num3,num4,num5));
			System.out.println("il numero minore �: " + u.minOfFiveNum(num1,num2,num3,num4,num5));
			System.out.println("la media �: " + u.averageNumber(num1, num2, num3, num4, num5));
			System.out.println("ripetizioni: " + u.counter(num1, num2, num3, num4, num5));
			System.out.print("il numero di mezzo (penso sia): " + u.midOfFiveNum(num1, num2, num3, num4, num5));
		}
		else {
			System.out.println("inserisci valori da 5 a 15");
		}
	}
}
