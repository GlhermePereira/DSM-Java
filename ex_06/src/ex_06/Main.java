package ex_06;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		// 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
		
		try (Scanner readScanner = new Scanner(System.in)){
			
			// Inicializa o fatorial como 1
	        long fatorial = 1;
	        // Inicializa o contador
	        int contador = 1;
			int numDigitado;
			System.out.println("Digite um número: ");
			numDigitado = readScanner.nextInt();
	        // Calcula o fatorial usando um loop while
			
	        while (contador <= numDigitado) {
	            fatorial *= contador;
	            contador++;
	        }
	        
	        
	        System.out.println("O fatorial do número "+numDigitado+" é "+fatorial);
			
		}

	}

}
