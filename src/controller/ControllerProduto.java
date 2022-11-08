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

    public void salvarProduto() {

        System.out.println("Nome do produto; ");
        this.nome = leia.next();
        System.out.println("Valor: R$ ");
        this.preco = leia.nextFloat();
        System.out.println("Tipo: ");
        this.tipo = leia.nextInt();

        Produto produto = new Produto(this.nome, this.preco, this.tipo) {
        };
        ArrayList<Produto> produtoArrayList = new ArrayList<>();

        produtoArrayList.add(produto);
        produto.visualizar();

    }
}
