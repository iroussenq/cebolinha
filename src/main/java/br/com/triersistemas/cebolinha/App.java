package br.com.triersistemas.cebolinha;

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {

        var d = new BeautifulDisplay();
        Farmaceutico f = new Farmaceutico("Carlão", LocalDate.of(2020, Month.FEBRUARY, 29), " 077.805.980-47 ");
        d.add("Nome", f.getNome());
        d.add("Oferta", f.getOfertaDia());
        d.add("CPF", f.getDocumento());
        d.add("Valido", f.documentoValido() ? "Sim" : "Não");
        d.add("Niver", f.getNiver());
        d.add("Idade", f.getIdade().toString());
        d.show();

        System.out.println("");

        d = new BeautifulDisplay();
        Fornecedor fo = new Fornecedor("Irineu LTDA", LocalDate.of(1819, Month.JANUARY, 27), "00.000.0848749800/0000-00");
        d.add("Nome", fo.getNome());
        d.add("Produtos", fo.getProdutos().toString());
        d.add("CNPJ", fo.getDocumento());
        d.add("Valido", fo.documentoValido() ? "Sim" : "Não");
        d.add("Niver", fo.getNiver());
        d.add("Idade", fo.getIdade().toString());
        d.show();
    }
}