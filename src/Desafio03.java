import java.util.Scanner;

public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

	 * */
	public static void verificaTriangulo(int lado1, int lado2, int lado3) {
		if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
			System.out.println( "O triângulo existe!");
			verificaTipoDoTriangulo(lado1, lado2, lado3);
		} else {
			System.out.println( "O triângulo não existe!");
		}
		
	}

	public static void verificaTipoDoTriangulo(int lado1, int lado2, int lado3) {
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo é equilátero!");
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("O triângulo é isósceles");
		} else {
			System.out.println("O trigângulo é escaleno");
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Digite o valor do lado 1: ");
		lado1 = leitor.nextInt();
		
		System.out.println("Digite o valor do lado 2: ");
		lado2 = leitor.nextInt();
		
		System.out.println("Digite o valor do lado 3: ");
		lado3 = leitor.nextInt();
		
		verificaTriangulo(lado1, lado2, lado3);
		leitor.close();
	}
}
