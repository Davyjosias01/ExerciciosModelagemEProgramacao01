package exercicio_03;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		//Instantiating necessary variables n classes:
		float c, f;
		Scanner sc = new Scanner(System.in);
		
		//get the temperature in fahrenheit to convert
		System.out.print("Digite a temperatura em graus Fahrenheit para converter: ");
			f = sc.nextFloat();
		
		//Convert the temperature value
		c = 5 * ((f - 32) / 9);
		
		//Introducing the result value
		System.out.printf("Valor convertido: %.2f", c);
		
		//end the Scanner class instance
		sc.close();
	}
}
