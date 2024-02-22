package ex_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou impar e exiba uma mensagem correspondente.
		try (Scanner readScanner = new Scanner(System.in)){
			
			int numDigitado,resultado;
			
			System.out.println("Digite um número inteiro: ");
			numDigitado = readScanner.nextInt();
			resultado = numDigitado % 2;
			if (resultado==0) {
				System.out.println("Número " + numDigitado + " é par.");
			}else if (resultado!=0) {
				System.out.println("O número " + numDigitado + " é impar.");
			}
		}
	}

	}


