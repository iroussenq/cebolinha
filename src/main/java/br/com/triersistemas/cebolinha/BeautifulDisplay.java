package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;

public class BeautifulDisplay {

    private List<String> names;
    private List<String> values;

    public BeautifulDisplay() {
        this.names = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void add(final String nome, final String val) {
        this.names.add(nome);
        this.values.add(val);
    }

    public void show() {
        final List<String> saida = new ArrayList<>();
        final int nameSize = getSize(this.names);
        final int valueSize = getSize(this.values);
        final int totalSize = nameSize + valueSize + 2;

        saida.add(String.format("+%s+", format("", totalSize, '-')));

        for (int i = 0; i < names.size(); i++) {
            var name = format(names.get(i), nameSize, '.');
            var value = format(values.get(i), valueSize, ' ');
            saida.add(String.format("|%s: %s|", name, value));
        }

        saida.add(String.format("+%s+", format("", totalSize, '-')));

        saida.forEach(x -> System.out.println(x));
    }

    private int getSize(final List<String> lista) {
        return lista.stream()
                .map(String::length)
                .sorted((n1, n2) -> Integer.compare(n2, n1))
                .findFirst()
                .orElse(0);
    }

    private String format(final String s, final int size, final char ch) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i = 0; i < size - s.length(); i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}