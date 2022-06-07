package br.fag.edu;

public enum Pagamento {
	CARTAO("Pago no cartão"),
	DINHEIRO("Pago no dinheiro");
	
	private String money;
	
	Pagamento(String money){this.money = money;}
	public String getInfo() {return money;}

}
