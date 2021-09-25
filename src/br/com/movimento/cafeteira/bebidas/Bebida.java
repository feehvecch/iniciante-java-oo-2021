package br.com.movimento.cafeteira.bebidas;
import java.util.Scanner;

public abstract class Bebida{
	
	private int numeroDaOpcao;
//	private int reservatorioAgua = 1000;
//	private int nivelAgua;
		
	public Bebida(int opcao) {
		if(opcao <= 0) {
			System.out.println("\nEntre com uma op��o de bebida v�lida.");
			return;
		}
		this.numeroDaOpcao = opcao;
	}
	
	public abstract void prepararBebida();
	public abstract double getPreco();
	
	public int getNumeroDaOpcao() {
		return numeroDaOpcao;
	}
	
	public int solicitarNivelAcucar() {
		Scanner opcaoAcucar = new Scanner(System.in);
	    System.out.println("\nDeseja alterar o n�vel(3) padr�o de a�ucar?Entre com o n�mero\n"
	    		+ "1 - 2 - (3) - 4 - 5");

	    int pedidoAcucarUsuario = opcaoAcucar.nextInt();
	    System.out.println("O n�vel escolhido foi: " + pedidoAcucarUsuario);
	    return pedidoAcucarUsuario;
	}

	
	
//	public boolean confereNivelDeAgua(Bebida agua) {
//		if( agua.getReservatorioAgua() < 50 ) {
//		    System.out.println("\nN�vel de �gua baixo. Com " + agua.getReservatorioAgua() + " ml");
//		    return true;
//		}
//		nivelAgua = agua.getReservatorioAgua();
//		nivelAgua -= 50;
//		agua.setReservatorioAgua(nivelAgua);
//		System.out.println("\nReservat�rio com: " + nivelAgua + "ml.\nFervendo �gua...");
//		return false;
//	}
	
//	public void abastecerAgua(Bebida agua) {
//		System.out.println("\nAbastecendo n�vel de �gua do reservat�rio.");
//		agua.setReservatorioAgua(1000);
//		System.out.println("\nReservat�rio agora com " + agua.getReservatorioAgua() + " ml.\n"
//				+ "Fervendo �gua...");
//	}

//	public int getReservatorioAgua() {
//		return reservatorioAgua;
//	}
//
//	public void setReservatorioAgua(int reservatorioAgua) {
//		this.reservatorioAgua = reservatorioAgua;
//	}
	
}
