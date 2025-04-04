package model;

public class Combo extends Produto {

    public Combo(int numero, String nome, double preco, int quantidade, String itens) {
        super(numero, nome, preco, quantidade);
    }

    @Override
    public void visualizar() {
        System.out.println("\n================= COMBO =================");
        super.visualizar();
    }
}