package exercicio_04;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		//Instantiating the necessary variables n classes:
		float meters, centimeters;
		Scanner sc = new Scanner(System.in);
		
		//get the centimeters quantity
		System.out.print("Digite o comprimento em metros para converter: ");
			meters = sc.nextFloat();
			
		//convert
		centimeters = meters*100;
		
		//introducing the result
		System.out.printf("\n%.2f metros são %.2f centimetros!", meters, centimeters);
		
		//end the Scanner class instance
		sc.close();
	}
}
