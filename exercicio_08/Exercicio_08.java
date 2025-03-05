package exercicio_08;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		//instantiating the necessary classes and variables
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		//get the two first values
		System.out.println("Digite o primeiro número: ");
			a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
			b = sc.nextInt();
		
		//assingin at the lowest value variable the next input value
		if (a >= b) {
			System.out.println("Digite o terceiro número: ");
				b = sc.nextInt();
		} else {
			System.out.println("Digite o terceiro número: ");
				a = sc.nextInt();			
		}
		
		//introducing the bigger value
		if (a >= b) {
			System.out.printf("O maior número é: %d", a);
		} else {
			System.out.printf("O maior número é: %d", b);
		}

		//end the Scanner class instance
		sc.close();
	}
}
