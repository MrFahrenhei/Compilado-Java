package br.fag.edu;

public enum Recheio {
	QUEIJO("Recheio de queijo"),
	CATUPIRI("Recheio de Catupiri"),
	PORTUGUESA("Recheio de portuguesa"),
	CARNE("Recheio de Carne"),
	BACON("Recheio de Bacon");
	
	private String recheios;
	
	Recheio(String recheios){this.recheios = recheios;}
	public String getInfo() {return recheios;}


}
