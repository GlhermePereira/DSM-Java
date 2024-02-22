package ex_10;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try (Scanner readScanner = new Scanner(System.in))
		{
			String senhaDig;
			String senhaCorreta = "123";
			boolean senhaValida = false;
			
			while (!senhaValida) {
	            System.out.print("Digite a senha: ");
	             senhaDig = readScanner.nextLine();
	            
	            // Verifica se a senha digitada está correta
	            if (senhaDig.equals(senhaCorreta)) {
	                senhaValida = true;
	                System.out.println("Senha correta! Acesso permitido.");
	            } else {
	                System.out.println("Senha incorreta. Tentativa inválida.");
	            }
	        }

		}

	}

}
