package exercicio_07;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		//instantiating the necessary classes and variables
		int bananas;
		float value;
		Scanner sc = new Scanner(System.in);
		
		//get the number of purchased bananas 
		System.out.println("Digite o número de bananas:");
			bananas = sc.nextInt();
		
		//check if the number of bananas exceed eleven
		if (bananas <= 11) {
			value = bananas*1;
		} else if (bananas > 11) {
			value = (bananas * 0.9f);
		} else {
			System.out.println("Número digitado inválido!");
			value = 0;
		}
		
		//introducing the final value
		System.out.printf("Valor: %.2f", value);
		
		//end the Scanner class instance
		sc.close();
	}

}
