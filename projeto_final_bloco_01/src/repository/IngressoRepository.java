package repository;

import model.Ingresso;

public interface IngressoRepository {

    public void procurarPorId(int id);
    public void listarTodos();
    public void cadastrar(Object ingresso);
    public void atualizar(int id, Object ingresso);
    public void deletar(int id);
	void cadastrar(Ingresso ingresso);
	void buscarPorNumero(int numero);
	void atualizar(Ingresso ingresso);
	void comprar(int numero, int quantidade);
}