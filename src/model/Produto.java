package model;

public abstract class Produto {
    private String nome;
    private float preco;
    private int tipo;

    public Produto(String nome, float preco, int tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void visualizar() {
        String tipo = "";
        switch (getTipo()) {
            case 1:
                tipo = "Sanduíche";
                break;
            case 2:
                tipo = "Bebida";
                break;
            case 3:
                tipo = "Acompanhamento";
                break;
            case 4:
                tipo = "Sobremesa";
                break;
        }
        System.out.println("************************************");
        System.out.println("****** INFORMAÇÕES DO PRODUTO ******");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Classificação: " + tipo);
        System.out.println("************************************");
    }
}
