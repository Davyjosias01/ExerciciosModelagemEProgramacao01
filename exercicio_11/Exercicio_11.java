package exercicio_11;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		//instantiating the classes and necessary variables 
		Scanner sc = new Scanner(System.in);
		int limite;
		
		//get the function index
		System.out.print("\nDigite o indice de fibonacci que deseja ser apresentado: ");
			limite = sc.nextInt();
		
		//skip a line
		System.out.println();
			
		//method call and introducing the results
		int resultado = fibo (limite);
		System.out.println(resultado);
		
		//end the Scanner class instance
		sc.close();
	}
	
	
	public static int fibo(int limite) {
		//instantiating the classes and necessary variables 
		int anterior = 0, valor = 1, indice = 1;
		System.out.print(valor + " ");
		
		//Checking if the index is within limits
		if (limite > indice) {
			indice++;
			
			int resultado = anterior + valor;
			anterior = valor;
			valor = resultado;
			
			//introducing the atual value of function
			System.out.print(valor + " ");
			
			//Caling the other function with the same name
			valor = fibo(anterior, limite, valor, indice);
		}
		
		//return the result value.
		return valor;
	}
	
	
	/*
	 * Using polymorphism and the concept of Method Overloading to call
	 * different methods with the same name, according to the parameters passed
	 */
	public static int fibo(int anterior, int limite, int valor , int indice ) {
		
		//check if the index is within limits;
		if (limite > indice) {
			indice++;
			
			int resultado = anterior + valor;
			anterior = valor;
			valor = resultado;
			
			//introducing the atual value of the function
			System.out.print(valor + " ");
			
			//use the recursivity concept calling the function inside the same.
			valor = fibo(anterior, limite, valor, indice);
		}
		
		//return the result value.
		return valor;
	}
}
