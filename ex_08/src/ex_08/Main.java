package ex_08;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// 8-Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. Calcule e imprima a soma dos primeiros n números impares. Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 +3+5+7=16.

		
		try(Scanner readScanner = new Scanner(System.in)){
			int numDigitado;
			int soma = 0;
	        int contador = 0;
	        int numero = 1;
			System.out.println("Digite um número inteiro: ");
			numDigitado = readScanner.nextInt();

	        while (contador < numDigitado) {
	            if (numero % 2 != 0) {
	                soma += numero;
	                contador++;
	            }
	            numero++;
	        }
	        System.out.println("A soma dos primeiros " + numDigitado + " números ímpares é: " + soma);
			

			
		}
	}

}
