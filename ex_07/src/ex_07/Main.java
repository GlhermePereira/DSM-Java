package ex_07;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//7-Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta ou idosa (use, por
		
		try (Scanner readScanner = new Scanner(System.in)){
			
			int idade;
			System.out.println("Digite sua idade: ");
			idade = readScanner.nextInt();
			
			if (idade < 18) {
				System.out.println("Menor de idade!");
			}else if (idade>=18) {
				System.out.println("Pessoa Adulta!");
			}else if (idade >=60) {
				System.out.println("Idosa!");
			}
			
			
			
		}
		
	}

}
