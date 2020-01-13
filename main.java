package ifelse;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int hora;
		
		System.out.println("Quantas Horas?");
		hora=sc.nextInt();
		
		if(hora < 12) {
		System.out.println("Bom dia  ");
		}
		else if(hora < 18) {  // Podemos colocar o if junto else e finalizar no final com else
			System.out.println("Boa Tarde");
				
			}
			else {
			System.out.println("Boa Noite");
				
			}
		
		
		
sc.close();
}
}
