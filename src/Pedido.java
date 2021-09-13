import java.util.Scanner;

public class Pedido extends Credito{
	
	public void realizarPedido(Credito credito) {
		Scanner opcaoBebida = new Scanner(System.in);
	    System.out.println("\nEntre com o n�mero da bebida desejada:\n"
	    		+ "1 - Caf� - R$ 0.50\n"
	    		+ "2 - Caf� com leite - R$ 1.00 \n"
	    		+ "3 - Capuccino - R$ 1.50\n"
	    		+ "4 - Ch� de lim�o - R$ 1.00\n"
	    		+ "5 - �gua quente - free");

	    int pedidoBebidaUsuario = opcaoBebida.nextInt();
	    System.out.println("Seu pedido foi: " + pedidoBebidaUsuario);
	    Bebida agua = new Bebida(pedidoBebidaUsuario);
	    
	    switch (pedidoBebidaUsuario) {
	    case 1:
	    	Cafe cafe = new Cafe(pedidoBebidaUsuario);
	    	cafe.prepararCafe(agua);
	    	cafe.calcularValor(cafe.getPreco(), credito);
	    	break;
		case 2:
			CafeComLeite cafeComLeite = new CafeComLeite(pedidoBebidaUsuario);
	    	cafeComLeite.prepararCafeComLeite(agua);
	    	cafeComLeite.calcularValor(cafeComLeite.getPreco(), credito);
	    	break;
		case 3:
			Capuccino capuccino = new Capuccino(pedidoBebidaUsuario);
			capuccino.prepararCapuccino(agua);
			capuccino.calcularValor(capuccino.getPreco(), credito);
			break;
		case 4:
			Cha cha = new Cha(pedidoBebidaUsuario);
			cha.prepararCha(agua);
			cha.calcularValor(cha.getPreco(), credito);
			break;
		case 5:
			if(agua.confereNivelDeAgua(agua)) {
				agua.abastecerAgua(agua);
			}
			System.out.println("�gua pronta.");
			break;
	    }
	}
	
	public double calcularValor(double valorProduto, Credito credito) {
		 
		double valorCredito = credito.getValorTotalCreditos();
		valorCredito -= valorProduto;
		credito.setValorTotalCreditos(valorCredito);
		System.out.println("\nO valor total de cr�dito � de: R$ " + valorCredito);
		return valorProduto;
		
	}

}
