import java.util.Scanner;
public class Desafio01 {
	/*� muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma fun��o que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.

	 * */
	public static boolean verificaEstado(String estadoMain) {
		String[] estados = {"ACRE", "AC", "ALAGOAS", "AL", "AMAP�", "AP", "AMAZONAS", "AM", "BAHIA", "BA", "CEAR�", "CE", "ESP�RITO SANTO", "ES", "GOI�S", "GO", "MARANH�O", "MA", "MATO GROSSO", "MT", "MATO GROSSO DO SUL", "MS", "MINAS GERAIS", "MG", "PAR�", "PA", "PARA�BA", "PB", "PARAN�", "PR", "PERNAMBUCO", "PE", "PIAU�", "PI", "RIO DE JANEIRO", "RJ", "RIO GRANDE DO NORTE", "RN", "RIO GRANDE DO SUL", "RS", "ROND�NIA", "RORAIMA", "RR", "SANTA CATARINA", "S�O PAULO", "SP", "SERGIPE", "SE", "TOCANTINS", "TO", "DISTRITO FEDERAL", "DF"};
		for(String estado : estados) {
			if(estadoMain.equals(estado)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String estado;
		System.out.println("Digite o nome ou a sigla do estado: ");
		estado = leitor.nextLine().toUpperCase();
		
		if(verificaEstado(estado) == true) {
			System.out.println("O estado existe!");
		} else {
			System.out.println("O estado n�o existe!");
		}
		
		leitor.close();
		
	}
}
