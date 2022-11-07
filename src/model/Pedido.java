package model;

public class Pedido extends Produto{
    /*Pedido apenas pega os itens que estiverem no "Banco de dados", adiciona e ao finalizar o pedido lista com o
    * valor final a ser pago.
    * Deve ter uma opção para colocar o nome do cliente, telefone e forma de pagamento*/

    public Pedido(String nome, float preco, int tipo) {
        super(nome, preco, tipo);
    }
    public void visualizarPedido(){
        super.visualizar();
    }

    public Produto produto(Produto produto){
        return  produto;
    }
}