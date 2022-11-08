package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerProduto {
    Scanner leia = new Scanner(System.in);
    private String nome;
    private float preco;
    private int tipo;
    String msg;
    private int id;

    ArrayList<Produto> produtoArrayList = new ArrayList<>();

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
        produto.visualizar();

    }

    public void atualizarProduto() {}

    public void listarProdutos() {}

    public Produto buscarNumeroProduto(int id) {
        for(var produto : produtoArrayList) {
            if(produto.getId() == id) {
                produtoArrayList.remove(produto);
                return produto;
            }
        }
        return null;
    }

    public void excluirProduto(int id) {
        var produto = buscarNumeroProduto(id);
        if (produto !=null){
            if(produtoArrayList.remove(produto) == true){
                System.out.println("\nO Produto foi removido!");
            }else
                System.out.println("O item não foi encotrado!");
        }
    }

    public int gerarNumero() {
        return produtoArrayList.size() + 1;
    }
}
