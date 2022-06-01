package br.com.triersistemas.cebolinha;

public class App {
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();
		Farmaceutico farmaceutico1 = new Farmaceutico();
		fornecedor1.fazProdutos();

		System.out.println("\nFARMACIA CEBOLINHA: \nLista de produtos disponiveis: \n" + fornecedor1.getProduto() + "\nDesconto do dia: " + farmaceutico1.getDesconto(fornecedor1) + "\nFARMACEUTICO:\nNome: " + 
		farmaceutico1.getNome() + "\nCpf: " + farmaceutico1.getDocumento());
	}
}