package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerProduto implements InterfaceProduto{
    
	Scanner leia = new Scanner(System.in);
	
    private String nome;
    private float preco;
    private int tipo;
    private int id;

    protected ArrayList<Produto> produtoArrayList = new ArrayList<>();
    
    @Override
    public void salvarProduto() {

        System.out.println("Nome do produto; ");
        this.nome = leia.next();
        System.out.println("Valor: R$ ");
        this.preco = leia.nextFloat();
        System.out.println("Tipo: ");
        this.tipo = leia.nextInt();

        Produto produto = new Produto(this.nome, this.preco, this.tipo,this.id) {
        };
        produtoArrayList.add(produto);
    }
    
    @Override
    public void atualizarProduto() {}
    
    @Override
    public void listarProdutos() {
    	
        for(Produto produto  : produtoArrayList) {
        	System.out.println(produto);
        	}
        }
    @Override
    public Produto buscarNumeroProduto(int id) {
        for(Produto produto : produtoArrayList) {
            if(produto.equals(id)) {
                produtoArrayList.remove(produto);
                return produto;
            }
        }
        return null;
    }
    @Override
    public void excluirProduto(int id) {
        var produto = buscarNumeroProduto(id);
        if (produto !=null){
            if(produtoArrayList.remove(produto) == true){
                System.out.println("\nO Produto foi removido!");
            }else
                System.out.println("O item não foi encotrado!");
        }
    }
    @Override
    public int gerarNumero() {
        return produtoArrayList.size() + 1;
    }
}
