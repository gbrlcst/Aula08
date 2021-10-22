import java.util.Scanner;
public class Desafio01 {
	/*É muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma função que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou não. Caso exista, a função deve retornar um boolean true. Caso não exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digitação do estado, a chamada da função e a exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.

	 * */
	public static boolean verificaEstado(String estadoMain) {
		String[] estados = {"ACRE", "AC", "ALAGOAS", "AL", "AMAPÁ", "AP", "AMAZONAS", "AM", "BAHIA", "BA", "CEARÁ", "CE", "ESPÍRITO SANTO", "ES", "GOIÁS", "GO", "MARANHÃO", "MA", "MATO GROSSO", "MT", "MATO GROSSO DO SUL", "MS", "MINAS GERAIS", "MG", "PARÁ", "PA", "PARAÍBA", "PB", "PARANÁ", "PR", "PERNAMBUCO", "PE", "PIAUÍ", "PI", "RIO DE JANEIRO", "RJ", "RIO GRANDE DO NORTE", "RN", "RIO GRANDE DO SUL", "RS", "RONDÔNIA", "RORAIMA", "RR", "SANTA CATARINA", "SÃO PAULO", "SP", "SERGIPE", "SE", "TOCANTINS", "TO", "DISTRITO FEDERAL", "DF"};
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
			System.out.println("O estado não existe!");
		}
		
		leitor.close();
		
	}
}
