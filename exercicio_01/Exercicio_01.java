package exercicio_01;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		//Instantiating the necessary variables n classes:
		float b, h;
		Scanner sc = new Scanner(System.in);
		
		//get the rectangle dimensions 
		System.out.print("\nType the base size: ");	
			b = sc.nextFloat();
		System.out.print("\nType the base size: ");	
			h = sc.nextFloat();
			
		//Calculations:
		h = h * b;
		
		//introducing the rectangle area
		System.out.printf("\nArea of the rectangle: %.2f", h);
		
		//end the Scanner class instance
		sc.close();
	}
	
}
