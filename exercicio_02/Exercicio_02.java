package exercicio_02;

public class Exercicio_02 {

	public static void main(String[] args) {
		//Instantiating variables n classes:
		int a = 5, b = 14, aux;
		
		//introducing the variables
		System.out.printf("\nvariável a: %d", a);
		System.out.printf("\nvariável b: %d", b);
		
		//beauty lineskipp
		System.out.println("\n\n- - - - Troca - - - -");
		
		//change the variables value
		aux = a;
		a = b;
		b = aux;
		
		//introducing the variables
		System.out.printf("\nvariável a: %d", a);
		System.out.printf("\nvariável b: %d", b);		
		
	}
	
}
