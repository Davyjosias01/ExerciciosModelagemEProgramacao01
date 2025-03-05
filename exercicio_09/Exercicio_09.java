package exercicio_09;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		//instantiating the necessary variables and classes
		int a, b;
		Scanner sc = new Scanner(System.in);
	
		//get the two necessary values
		System.out.print("\nDigite o primeiro número: ");
			a = sc.nextInt();
		System.out.print("\nDigite o segundo número: ");
			b = sc.nextInt();
		
		//calculate and make the necessary checks
		a = a + b;	
		if ( a <= 20 ) {
			System.out.printf("\n\nResult = %d", (a - 5));
		} else {
			System.out.printf("\n\nResult = %d", (a + 8));
		}
		
		//end the Scanner class instance
		sc.close();
	}
}
