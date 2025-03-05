package exercicio_06;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		//Instantiating the necessary variables n classes:
		String userName, userType, bookName;
		int rentalDays;
		Scanner sc = new Scanner(System.in);
		
		//get the username
		System.out.print("Digite o nome do usuário: ");
			userName = sc.nextLine();
		
		//get and checking a valid user type 
		do {
			System.out.printf("\nDigite o tipo do usuário: ");
				userType = sc.next();
			if (userType.equalsIgnoreCase("professor")){
				rentalDays = 10;
			} else if (userType.equalsIgnoreCase("aluno")) {
				rentalDays = 3;
			} else {
				System.out.println("\nEntrada inválida, digite 'professor' ou 'aluno'");
				rentalDays = 0;
			}
		} while (!userType.equalsIgnoreCase("professor") && !userType.equalsIgnoreCase("aluno"));
	
		//clear the buffer
		sc.nextLine();
		
		//getting the book name
		System.out.print("\nDigite o nome do livro: ");
			bookName = sc.nextLine();
		
		//introducing the report
		System.out.println("\nRelatório: \n");
		System.out.println("Nome do usuário: " + userName + ""
				+ "\nTipo do usuário: " + userType
				+ "\nNome do livro: " + bookName);
		
		//introducing the rentalDays
		System.out.printf("\nDevolução em %d dias", rentalDays);
	
		//end the Scanner class instance
		sc.close();
	}
}
