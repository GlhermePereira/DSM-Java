package ex_02;
import java.util.Scanner;


public class main {

	public static void Main(final String[] args) {
		//2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

	try (Scanner read = new Scanner(System.in)){
		int num1,num2;
		
		System.out.println("Digite o primeiro numero");
		num1 = read.nextInt();
		System.out.println("Digite o segundo numero");
		num2 = read.nextInt();
		if(num1>num2) {
			System.out.println("O primeiro numero e maior");
		}else if (num2>num1) {
			System.out.println("O segundo número é maior");
		}else {
			System.out.println("Os números sao iguais");
		}
		
	}

	}
}
