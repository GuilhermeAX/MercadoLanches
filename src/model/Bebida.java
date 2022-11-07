package model;

public class Bebida extends Produto {
    private int categoria;//Diz se é bebida
    private String marca;//Diz qual é a marca da bebida (ex. fanta)
    private String sabor;//Diz qual é a sabor da bebida
    private int quantidadeEmEstoque;//dizer qual a quantidade que está sendo adicionada


    public Bebida(String nome, float preco, int tipo, int categoria, String marca, String sabor, int quantidadeEmEstoque) {
        super(nome, preco, tipo);
        this.categoria = categoria;
        this.marca = marca;
        this.sabor = sabor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    /*Ex de bebida:
    * Nome: Coca-Cola, preço: R$4.99, tipo: 2, categoria: 2(bebida), marca: Coca-Cola, sabor: Cola, quantidade: 12
    * Nome: Suco de Laranja, preço: R$3.99, tipo: 1, categoria: 2(bebida), marca: Cappo, sabor: Laranja, quantidade: 6*/

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void visualizar() {
        super.visualizar();
        String tipo = "";
        switch (getCategoria()) {
            case 1:
                tipo = "Suco";
                break;
            case 2:
                tipo = "Refrigerante";
                break;
        }
        System.out.println("Bebida: " + tipo);
        System.out.println("Nome: " + getNome());
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preco: " + getPreco());
        System.out.println("Quantidade em estoque: " + getQuantidadeEmEstoque());
    }
}
