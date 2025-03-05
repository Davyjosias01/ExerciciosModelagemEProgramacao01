package exercicio_05;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		//Instantiating the necessary variables n classes:
		float a, b;
		Scanner sc = new Scanner(System.in);
		
		//get the two numbers
		System.out.print("Digite um número: ");
			a = sc.nextFloat();
		System.out.print("Digite outro número: ");
			b = sc.nextFloat();
		
		//checking the bigger number
		if (a > b) {
			System.out.printf("O maior número é: %.2f", a);
		} else {
			System.out.printf("O maior número é: %.2f", b);
		}
		
		//end the Scanner class instance
		sc.close();
	}
}
