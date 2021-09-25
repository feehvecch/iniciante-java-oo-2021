import java.util.Scanner;
import br.com.movimento.cafeteira.bebidas.Bebida;
import br.com.movimento.cafeteira.bebidas.Cafe;
import br.com.movimento.cafeteira.bebidas.CafeComLeite;
import br.com.movimento.cafeteira.bebidas.Capuccino;
import br.com.movimento.cafeteira.bebidas.Cha;

public class Pedido extends Credito{
	
	Imprime imprimir = new Imprime();
	
	public void realizarPedido(Credito credito) {
		Scanner opcaoBebida = new Scanner(System.in);
		imprimir.imprime("\\nEntre com o n�mero da bebida desejada:\n"
				+ "1 - Caf� - R$ 0.50\n"
				+ "2 - Caf� com leite - R$ 1.00 \n"
				+ "3 - Capuccino - R$ 1.50\n"
				+ "4 - Ch� de lim�o - R$ 1.00\n"
				+ "5 - �gua quente - free");
	    
	    int pedidoBebidaUsuario = opcaoBebida.nextInt();
	    imprimir.imprime("Seu pedido foi: " + pedidoBebidaUsuario);
	    
	    switch (pedidoBebidaUsuario) {
	    case 1:
	    	Bebida cafe = new Cafe(pedidoBebidaUsuario);
	    	cafe.prepararBebida();
	    	calcularValor(cafe.getPreco(), credito);
	    	break;
		case 2:
			Bebida cafeComLeite = new CafeComLeite(pedidoBebidaUsuario);
	    	cafeComLeite.prepararBebida();
	    	calcularValor(cafeComLeite.getPreco(), credito);
	    	break;
		case 3:
			Bebida capuccino = new Capuccino(pedidoBebidaUsuario);
			capuccino.prepararBebida();
			calcularValor(capuccino.getPreco(), credito);
			break;
		case 4:
			Bebida cha = new Cha(pedidoBebidaUsuario);
			cha.prepararBebida();
			calcularValor(cha.getPreco(), credito);
			break;
		case 5:
//			if(agua.confereNivelDeAgua(agua)) {
//				agua.abastecerAgua(agua);
//			}
			imprimir.imprime("�gua pronta.");
			break;
	    }
	}
	
	public double calcularValor(double valorProduto, Credito credito) {
		 
		double valorCredito = credito.getValorTotalCreditos();
		valorCredito -= valorProduto;
		credito.setValorTotalCreditos(valorCredito);
		imprimir.imprime("\nO valor total de cr�dito � de: R$ " + valorCredito);
		return valorProduto;
		
	}

}
