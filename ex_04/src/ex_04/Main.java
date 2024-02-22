package ex_04;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// 4- Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10 . 

		try (Scanner read = new Scanner(System.in)){
			int numDigi;
			System.out.println("Digite um numero inteiro: ");
			numDigi = read.nextInt();
			for (int i = 0; i < 10; i++) {
				//i++;
				//resultado = numDigi * i;
				//System.out.println(numDigi+" x "+i+" = "+resultado);
                
				System.out.println(numDigi + " x " + (i + 1) + " = " + (numDigi * (i + 1)));

				//i--;
			}
	
	}
	}

}
