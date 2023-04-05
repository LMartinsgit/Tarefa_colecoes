package br.com.lmartins;

class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private char genero;
    private int idade;

    public Pessoa(String nome, char genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public char getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Pessoa other) {
        return Integer.compare(this.idade, other.idade);
    }

}
