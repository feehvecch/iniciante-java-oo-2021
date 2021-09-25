import java.util.Scanner;
import br.com.movimento.cafeteira.bebidas.Bebida;

public class Cafeteira {

	public static void main(String[] args) {
		
		Imprime imprimir = new Imprime();
	    
		imprimir.imprime("Bem-vindo a Cafeteria!!\n");
		int inicio;
		
		Pedido pedido = new Pedido();
		Credito credito = new Credito();
		
		do {
			Scanner opcaoInicial = new Scanner(System.in);
			imprimir.imprime("\nEscolha a op��o desejada:\n"
		    		+ "1 - Adicionar Cr�dito\n"
		    		+ "2 - Realizar Pedido\n"
		    		+ "0 - Finalizar");
	
		    inicio = opcaoInicial.nextInt();
		    imprimir.imprime("Voc� escolheu: " + inicio);
		    
		    switch(inicio) {
		    case 1:
		    	pedido.AdicionarCredito(credito);
		    	break;
		    case 2:
		    	pedido.realizarPedido(credito);
		    	break;
		    }
		}while(inicio == 1 || inicio == 2);
		imprimir.imprime("M�quina finalizada");
	}
}
