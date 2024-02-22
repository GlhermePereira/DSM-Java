package ex_03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do circulo. Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

		try (Scanner read = new Scanner(System.in) ){
			String text;
			double areaQuadrado,ladoQuadrado;
			double areaCirculo,raioCirculo;
			int respPerg;
			text = """
					1. Calcular área do quadrado.
					-------------------------------
					2. Calcular área do circulo.
					""";
			
			
			System.out.println(text);
			respPerg = read.nextInt();
			if (respPerg==1) {
				System.out.println("Digite o tamanho dos lados do quadrado: ");
				ladoQuadrado = read.nextDouble();
				areaQuadrado = Math.pow(ladoQuadrado, 2);
				System.out.println("A area do quadrado é "+areaQuadrado);
			
			}else if (respPerg==2) {
				System.out.println("Digite o raio do círculo: ");
				raioCirculo = read.nextDouble();
				areaCirculo = Math.PI * (Math.pow(raioCirculo, 2));
				String result = String.format("%.2f", areaCirculo);
				System.out.println("A área do círculo é: "+result);
			}
			
			
		}
	}

}
