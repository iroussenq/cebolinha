package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.SplittableRandom;

public abstract class PessoaJuridica extends Pessoa{
	private ArrayList<Integer> cnpj = new ArrayList<>();
	private Integer soma = 0;
	private Integer iterador = 0;
	private String cnpjValidado = "";

	@Override
	public String getDocumento(){
		for (int i = 0; i < 13; i++) {
			SplittableRandom r = new SplittableRandom();
			Integer numeroCNPJ = r.nextInt(0,9);
			if (i < 8) {
			cnpj.add(numeroCNPJ);
			} else if(i < 11 ){
				cnpj.add(0);
			} else {
				cnpj.add(numeroCNPJ);
			}		
		}
		cnpj.forEach((Integer i) -> {
			System.out.print(i);
		});
		for (int i = 13; i >= 0; i--) {
			if(i == 0) {
				if (soma % 11 < 3 || soma % 11 > 9) {
					cnpj.add(0);
				} else {		
					cnpj.add(soma % 11);
				}
				} else {
					if (i > 9) {
						soma = soma + cnpj.get(iterador) * (i - 8);
					}
					if (i <= 9) {
					soma = soma + cnpj.get(iterador) * i;
					}
				}
			iterador = iterador + 1;
		}
		iterador = 0;
		cnpj.forEach((Integer digitocnpj) -> {
			
			if (iterador == 2 || iterador == 5) {
				cnpjValidado = cnpjValidado + ".";
			} else if (iterador == 8){
				cnpjValidado = cnpjValidado + "/";
			} else if (iterador == 12) {
				cnpjValidado = cnpjValidado + "-";
			} 
			cnpjValidado = cnpjValidado + cnpj.get(iterador).toString();
			iterador ++;
				});	
		return cnpjValidado;
	}
}
