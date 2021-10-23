import java.util.Scanner;

public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	public static void verificaTriangulo(int lado1, int lado2, int lado3) {
		if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
			System.out.println( "O tri�ngulo existe!");
			verificaTipoDoTriangulo(lado1, lado2, lado3);
		} else {
			System.out.println( "O tri�ngulo n�o existe!");
		}
		
	}

	public static void verificaTipoDoTriangulo(int lado1, int lado2, int lado3) {
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("O tri�ngulo � equil�tero!");
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("O tri�ngulo � is�sceles");
		} else {
			System.out.println("O trig�ngulo � escaleno");
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
