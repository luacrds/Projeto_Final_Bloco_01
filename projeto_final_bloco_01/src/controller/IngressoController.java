package controller;

import java.util.ArrayList;

import model.Ingresso;

public class IngressoController {

    private ArrayList<Ingresso> lista = new ArrayList<>();
    private int numero = 0;

    public void listarTodos() {
        for (var ingresso : lista) {
            ingresso.visualizar();
        }
    }

    public void cadastrar(Ingresso ingresso) {
        lista.add(ingresso);
    }

    public int gerarNumero() {
        return ++numero;
    }

    public void comprar(int numero, int quantidade) {
        for (var ingresso : lista) {
            if (ingresso.getNumero() == numero) {
                if (ingresso.getQuantidade() >= quantidade) {
                    ingresso.setQuantidade(ingresso.getQuantidade() - quantidade);
                    System.out.println("\nCompra realizada com sucesso!");
                } else {
                    System.out.println("\nQuantidade insuficiente!");
                }
                return;
            }
        }
        System.out.println("\nIngresso não encontrado!");
    }
}