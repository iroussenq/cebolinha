package br.com.triersistemas.cebolinha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.SplittableRandom;

import javax.swing.JOptionPane;

public abstract class PessoaFisica extends Pessoa{
	private static final ArrayList<Integer> cpf = new ArrayList<>();
	private String cpfValidado = "";
	private Integer soma = 0;
	
	@Override
	public String getDocumento(){
		for (int i = 0; i < 11; i++) {
			SplittableRandom r = new SplittableRandom();
			Integer numeroCPF = r.nextInt(0,9);
			cpf.add(numeroCPF);
		}
		
		for (int i = 0; i < 11; i++) {
			if(i == 10) {
			if (soma % 11 < 3 || soma % 11 > 9) {
				cpf.remove(10);
				cpf.add(0);
			} else {
				cpf.remove(10);
				cpf.add(soma % 11);
			}
			} else {
				soma = soma + cpf.get(i) * i;
			}
		}
		soma = 0;
		cpf.forEach((Integer digitoCpf) -> {
			
			if (soma == 3 || soma == 6) {
				cpfValidado = cpfValidado + "-";
			} else if (soma == 9){
				cpfValidado = cpfValidado + ".";
			}
			cpfValidado = cpfValidado + cpf.get(soma).toString();
			soma ++;
				});	
		return cpfValidado;
	}
	@Override
	public Integer getIdade() {
		Integer ano = Integer.valueOf( JOptionPane.showInputDialog(null,"Digite o ano que voce nasceu"));
		Integer mes = Integer.valueOf( JOptionPane.showInputDialog(null, "Digite o mes que voce nasceu"));
		Integer dia = Integer.valueOf( JOptionPane.showInputDialog(null, "Digite o dia que voce nasceu"));
		LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
		Integer idade = 0;
		if (LocalDate.now().getDayOfYear() < dataNascimento.getDayOfYear()) {
			idade = LocalDate.now().getYear() - dataNascimento.getYear() - 1;
		} else {
			idade = LocalDate.now().getYear() - dataNascimento.getYear();		
			}
		return idade;
			
	}
}
