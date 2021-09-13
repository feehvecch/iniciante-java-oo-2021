import java.util.Scanner;

public class Cafeteira {

	public static void main(String[] args) {
	    
		System.out.println("Bem-vindo a Cafeteria!!\n");
		int inicio;
		
		Pedido pedido = new Pedido();
		Credito credito = new Credito();
		
		do {
			Scanner opcaoInicial = new Scanner(System.in);
		    System.out.println("\nEscolha a op��o desejada:\n"
		    		+ "1 - Adicionar Cr�dito\n"
		    		+ "2 - Realizar Pedido\n"
		    		+ "0 - Finalizar");
	
		    inicio = opcaoInicial.nextInt();
		    System.out.println("Voc� escolheu: " + inicio);
		    
		    switch(inicio) {
		    case 1:
		    	pedido.AdicionarCredito(credito);
		    	break;
		    case 2:
		    	pedido.realizarPedido(credito);
		    	break;
		    }
		}while(inicio == 1 || inicio == 2);
		System.out.println("M�quina finalizada");
	}
}
