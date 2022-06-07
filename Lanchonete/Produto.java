package br.fag.edu;

public class Produto implements ProdutosInterface{
	private String nome;
	private Double price;
	private String validade;
	private Double peso;

	public Produto(String nome, Double price, String validade, Double peso) {
		this.nome = nome;
		this.price = price;
		this.validade = validade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public Double getPrice() {
		return price;
	}

	public String getValidade() {
		return validade;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	
	public void setName(String nome) {
		this.nome = nome;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public void criarProduto(){
		System.out.println("Produto Criado com sucesso!!");
	}

	@Override
	public String toString() {
		return ("Nome: " + getNome() + "\nPreço: R$"+getPrice() + "\nValidade: "+getValidade()+"\nPeso: Kg "+getPeso());
	}
}
