package br.com.movimento.cafeteira.bebidas;

public class Cafe extends Bebida{
	
	private double preco = 0.5;
	
	public Cafe(int numeroDaOpcao) {
		super(numeroDaOpcao);
	}
	
	public void prepararBebida() {
//		if(super.reservatorioAgua.confereNivelDeAgua()){
//			super.reservatorioAgua.abastecerAgua();
//		}
		int nivelAcucar = super.solicitarNivelAcucar();
		System.out.println("Adicionando: caf� em p� + filtro + n�vel de a��car de: " + nivelAcucar);
		System.out.println("Caf� pronto.");
		
	}

	public double getPreco() {
		return preco;
	}
	
}
