package ex_09;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//9-Lista de Nomes: Peça ao usuário para inserir 5 nomes (um peça outro nome e use um de cada vez). Após inserir todos os nomes, loop for para percorrer a lista e verificar se o 6º (último) nome digitado está presente no array dos 5 nomes informados inicialmente.
		try(Scanner readScanner = new Scanner(System.in)){
		String[] Nomes = new String[5];
		String sextoNome = "";
		for (int i = 0; i < Nomes.length; i++) {
			
            System.out.println("Digite o " + (i + 1) + "º nome: ");
			
			Nomes[i] =  readScanner.next();
		}
			System.out.println("Digite o último nome: ");
			sextoNome = readScanner.next();
			
			// Verificar se o último nome está presente na lista dos 5 nomes iniciais
	        boolean presente = false;
	        for (String nome : Nomes) {
	            if (nome.equals(sextoNome)) {
	                presente = true;
	                break;
	            }
	        }
	     // Imprimir resultado
	        if (presente) {
	            System.out.println("O último nome está presente na lista dos 5 nomes iniciais.");
	        } else {
	            System.out.println("O último nome não está presente na lista dos 5 nomes iniciais.");
	        }
	        readScanner.close();

		}
		
		

	}

}
