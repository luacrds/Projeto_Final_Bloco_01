package model;

public class Ingresso extends Produto {

    public Ingresso(int numero, String nome, double preco, int quantidade) {
        super(numero, nome, preco, quantidade);
    }

    @Override
    public void visualizar() {
        System.out.println("\n================= INGRESSO =================");
        super.visualizar();
    }
}