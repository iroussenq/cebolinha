package br.com.triersistemas.cebolinha;

public class App {
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();
		Farmaceutico farmaceutico1 = new Farmaceutico();
		fornecedor1.fazProdutos();
		String cpf = farmaceutico1.getDocumento();
		Integer idade = farmaceutico1.getIdade();
		System.out.println("\nFARMACIA CEBOLINHA:\n \nLista de produtos disponiveis: \n" + fornecedor1.getProduto() + "\nDesconto do dia: " + farmaceutico1.getDesconto(fornecedor1) + "\n\nFARMACEUTICO:\n\nNome: " + 
		farmaceutico1.getNome() + "\nIdade: " + idade + "\n");
		System.out.println("+----------------------+"+
						 "\n|Valido: Sim           |" +
				         "\n|CPF....:" + cpf + "|" +
						 "\n+----------------------+");
	}
}