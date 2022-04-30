package programa_base;

import java.util.Scanner; 

public class calculadora {
	
	public int somar(int valor1, int valor2) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Valor 01: ");
		valor1 = scanner.nextInt();
		System.out.println("Valor 02: ");
		valor2 = scanner.nextInt();
		int soma = valor1 + valor2;
		
		scanner.close();
		
		return soma;
	}

}
