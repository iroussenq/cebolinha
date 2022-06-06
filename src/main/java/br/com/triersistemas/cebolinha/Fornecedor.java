package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Fornecedor extends PessoaJuridica {

	private ArrayList<String> produtos;
	
	public ArrayList<String> getProduto(){
		return produtos;
	}
	
	public void fazProdutos() {
		ArrayList<String> itens = new ArrayList<>();
		itens.add("Chiclete");
		itens.add("Cacau");
		itens.add("Neosoro");
		itens.add("Suplementos");
		itens.add("Vitaminas");
		itens.add("Fraldas");
		itens.add("Farofa");
		itens.add("Leite em po");
		itens.add("Chocolate");
		itens.add("Lenco umidecido");
		itens.add("Pasta de dentes");
		itens.add("Talco");
		itens.add("Preservativos");
		itens.add("Perfume");
		itens.add("Xanax");
		itens.add("Zombrex");
		itens.add("Antidoto X");
		itens.add("Oleo de macaco");
		itens.add("Fragrancia de bebe");
		itens.add("Oleo");
		itens.add("Fenoftalina");
		itens.add("Alcool");
		itens.add("Sinus");
		itens.add("Remedio para dor");
		itens.add("Calmantes");
		itens.add("Sal");
		itens.add("Essencia de limao");
		
		SplittableRandom r = new SplittableRandom();
		ArrayList<String> itensDoDia = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Integer item = r.nextInt((0),itens.size());
			itensDoDia.add(itens.get(item));
		}
		this.produtos = itensDoDia;
	}

	@Override
	public Integer getIdade() {
		// TODO Auto-generated method stub
		return null;
	}
}