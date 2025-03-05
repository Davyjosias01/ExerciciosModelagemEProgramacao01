package exercicio_10;

import java.util.Scanner;
import static exercicio_10.Constantes.*;//Importação de todas as constantes

public class Exercicio_10 {

	public static void main(String[] args) {
		//instantiating the variables
		float dimPorHoras, salarioBruto, descontoImpRenda, descontoInss, descontoSind, fgts, salarioLiquido;
		int horas;
		
		//instantiating the classes
		Scanner sc = new Scanner(System.in);
		
		//get the hour price and quantity of the hour
		System.out.println("Valor por hora: ");
			dimPorHoras = sc.nextFloat();
		System.out.println("Horas: ");
			horas = sc.nextInt();		
			
		//make the necessary calculations
		salarioBruto = dimPorHoras * horas;
		descontoImpRenda = salarioBruto * PORCENT_IMPOSTO_DE_RENDA;
		descontoInss = salarioBruto * PORCENT_INSS;
		descontoSind = salarioBruto * PORCENT_SINDICATO;
		salarioLiquido = salarioBruto - ( descontoImpRenda + descontoInss + descontoSind);
		fgts = salarioLiquido * PORCENT_FGTS;
		
		//introducing the results
		System.out.printf("\nSalario bruto: %.2f", salarioBruto);
		System.out.printf("\nDesconto imposto de renda: %.2f", descontoImpRenda);
		System.out.printf("\nDesconto Inss: %.2f", descontoInss);
		System.out.printf("\nDesconto sindicato: %.2f", descontoSind);
		System.out.printf("\nSalario líquido: %.2f", salarioLiquido);
		System.out.printf("\nDesconto fgts: %.2f", fgts);
		
		//end the Scanner class instance
		sc.close();
	}

}
