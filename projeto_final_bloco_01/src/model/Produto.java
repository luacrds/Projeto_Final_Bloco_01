package model;

public abstract class Produto {

    private int numero;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int numero, String nome, double preco, int quantidade) {
        this.numero = numero;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void visualizar() {
        System.out.println("Número: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade disponível: " + quantidade);
    }
}