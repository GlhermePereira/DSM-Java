package ex_01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("digite um número: ");
			int num = read.nextInt();

			if (num <0) {
				System.out.println("o número é negativo");
			    
			}
			else if(num>0) {
				System.out.println("O número é positivo");
			}
		}
    

	}

}
