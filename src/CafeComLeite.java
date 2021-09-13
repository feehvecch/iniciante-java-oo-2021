
public class CafeComLeite extends Bebida{
	
	double preco = 1.0;
	
	public CafeComLeite(int numeroDaOpcao) {
		super(numeroDaOpcao);
	}
	
	public void prepararCafeComLeite(Bebida agua) {
		if(agua.confereNivelDeAgua(agua)) {
    		agua.abastecerAgua(agua);
    	}
		int nivelAcucar = super.solicitarNivelAcucar();
		System.out.println("Adicionando: caf� em p� + leite em p� + filtro + n�vel de a��car de: " 
				+ nivelAcucar);
		System.out.println("Caf� com leite pronto.");
	}

	public double getPreco() {
		return preco;
	}

}
