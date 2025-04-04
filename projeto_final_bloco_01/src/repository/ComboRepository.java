package repository;

import model.Combo;

public interface ComboRepository {
    void listarTodos();
    void buscarPorNumero(int numero);
    void cadastrar(Combo combo);
    void comprar(int numero, int quantidade);
}