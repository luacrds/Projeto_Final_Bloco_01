package controller;

import java.util.ArrayList;

import model.Combo;

public class ComboController {

    private ArrayList<Combo> lista = new ArrayList<>();
    private int numero = 0;

    public void listarTodos() {
        for (var combo : lista) {
            combo.visualizar();
        }
    }

    public void cadastrar(Combo combo) {
        lista.add(combo);
    }

    public int gerarNumero() {
        return ++numero;
    }

    public void comprar(int numero, int quantidade) {
        for (var combo : lista) {
            if (combo.getNumero() == numero) {
                if (combo.getQuantidade() >= quantidade) {
                    combo.setQuantidade(combo.getQuantidade() - quantidade);
                    System.out.println("\nCompra realizada com sucesso!");
                } else {
                    System.out.println("\nQuantidade insuficiente!");
                }
                return;
            }
        }
        System.out.println("\nCombo não encontrado!");
    }
}