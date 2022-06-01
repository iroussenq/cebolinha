package br.com.triersistemas.cebolinha;

import java.util.SplittableRandom;

public class Farmaceutico extends PessoaFisica {

	public String getDesconto(Fornecedor f) {
		SplittableRandom r = new SplittableRandom();
		String desconto = "15% de desconto no produto " + f.getProduto().get(r.nextInt(0, 9));
		return desconto;
	}
}