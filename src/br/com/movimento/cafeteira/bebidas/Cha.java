package br.com.movimento.cafeteira.bebidas;
public class Cha extends Bebida{
	
	private double preco = 1.0;
	
	public Cha(int numeroDaOpcao) {
		super(numeroDaOpcao);
	}
	
	public void prepararBebida() {
//		if(agua.confereNivelDeAgua(agua)) {
//			agua.abastecerAgua(agua);
//		}
		int nivelAcucar = super.solicitarNivelAcucar();
		System.out.println("Adicionando: ch� em p� + filtro + n�vel de a��car de: " + nivelAcucar);
		System.out.println("Ch� de lim�o pronto.");
	}

	public double getPreco() {
		return preco;
	}
	
}
