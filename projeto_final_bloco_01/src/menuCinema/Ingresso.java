package menuCinema;

public class Ingresso {
	
    private String filme;
    private double preco;
    private int quantidadeDisponivel;

    public Ingresso(String filme, double preco, int quantidadeDisponivel) {
        this.filme = filme;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public boolean vender(int quantidade) {
        if (quantidade <= quantidadeDisponivel) {
            quantidadeDisponivel -= quantidade;
            return true;
        }
        return false;
    }

    public String getFilme() {
        return filme;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}


