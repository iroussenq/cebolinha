package br.com.triersistemas.cebolinha;

import java.util.SplittableRandom;

public abstract class PessoaFisica extends Pessoa{

	@Override
	public String getDocumento(){
		char[] cpf = new char[14];
		for (int i = 0; i < cpf.length; i++) {
			SplittableRandom r = new SplittableRandom();
			Integer numeroCPF = r.nextInt(0,9);

			cpf[i] = numeroCPF.toString().charAt(0);
			if (i == 3) {
				cpf[i] = '.';
			}
			if(i == 7 || i == 11) {
				cpf[i] = '-';
			}

		}
		return String.valueOf(cpf);

	}
}
