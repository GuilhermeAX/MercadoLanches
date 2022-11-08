package model;

public class Bebida extends Produto {
	
    private int categoria;//Diz se é bebida
    private String marca;//Diz qual é a marca da bebida (ex. fanta)
    private String sabor;//Diz qual é a sabor da bebida
    private int capacidade;
    private float preco;
    private int quantidadeEmEstoque;
    
    
    public int getCategoria() { //Declaração dos Getters and Setters
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

    public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	

    public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
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
        case 1 ->{
        	tipo = "Suco";
        	
        	Bebida suco01 = new Bebida("Natural","Laranja","Copo 500ml",5.50f,50);
        	Bebida suco02 = new Bebida("Natural","Goiaba","Copo 500ml",5.50f,50);
        	Bebida suco03 = new Bebida("Natural","Morango","Copo 500ml",8.00f,30);
        	Bebida suco04 = new Bebida("Natural","Maracujá","Copo 500ml",10.00,40);
        	Bebida suco05 = new Bebida("Natural","Graviola","Copo 500ml",8.90,10);
        }
        case 2 ->{
        	tipo = "Refrigerante";
        	Bebida refri01 = new Bebida ("Coca-Cola","Cola","Lata 350ml",8f,50);
        	Bebida refri02 = new Bebida ("Fanta","Guaraná","Lata 350ml",8f,50);
        	Bebida refri03 = new Bebida ("Pepsi","Cola","Lata 350ml",8f,50);
        	Bebida refri04 = new Bebida ("Fanta","Uva","Lata 350ml",8f,50);
        	Bebida refri05 = new Bebida ("Sprite","Limão","Lata 350ml",8f,50);
        	
        	
        }
        
        }
     
        System.out.println("Bebida: " + tipo);
        System.out.println("Nome: " + getNome());
        System.out.println("Sabor: " + getSabor());
        System.out.println("Capacidade (mL): " + capacidade);
        System.out.println("Preco: " + getPreco());
        System.out.println("Quantidade em estoque: " + getQuantidadeEmEstoque());
    }
}

