package br.com.triersistemas.cebolinha;

import java.util.SplittableRandom;

public abstract class PessoaJuridica extends Pessoa{

	@Override
	public String getDocumento(){
		char[] cnpj = new char[13];
		for (int i = 0; i < 13; i++) {
			SplittableRandom r = new SplittableRandom();
			Integer numeroCPF = r.nextInt(0,9);
			numeroCPF.toString().charAt(0);
			if (i == 2) {
				cnpj[i] = '.';
			}
			if(i == 6) {
				cnpj[i] = '.';
			}
			if(i == 10) {
				cnpj[i] = '/';
			}
			cnpj[i] = numeroCPF.toString().charAt(0);
		}
		
		return String.valueOf(cnpj);
	}
}
