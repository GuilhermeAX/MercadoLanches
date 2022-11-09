package controller;

import model.Produto;

public interface InterfaceProduto {
	public void salvarProduto();
	public void atualizarProduto();
	public void listarProdutos();
	public Produto buscarNumeroProduto(int id);
	public void excluirProduto(int id);
	public int gerarNumero();

}
