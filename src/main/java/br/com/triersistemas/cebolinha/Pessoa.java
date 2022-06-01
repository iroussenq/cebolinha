package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.SplittableRandom;

public abstract class Pessoa {

	private String nome;

	public Pessoa() {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Igor");
		nomes.add("Davi");
		nomes.add("Kay");
		nomes.add("Bianca");
		nomes.add("Caethana");
		nomes.add("Amanda");
		nomes.add("Carol");
		nomes.add("Antonio");
		nomes.add("Edymar");
		SplittableRandom r = new SplittableRandom();
		this.nome = nomes.get(r.nextInt((0), nomes.size()));
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract String getDocumento();

}