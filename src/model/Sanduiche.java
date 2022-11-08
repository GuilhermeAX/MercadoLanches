package model;

public class Sanduiche extends Produto {
/*EX:
    nome: X-Bacon, preço: R$14.99, tipo 1
 */

    public Sanduiche(String nome, float preco, int tipo, int id) {
        super(nome, preco, tipo, id);
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("================================");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: " + getPreco());
    }
}
