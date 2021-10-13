package br.com.mentoria.cafeteira.cafeteira.bebidas;

import java.util.Scanner;

import br.com.mentoria.cafeteira.cafeteira.Display;
import br.com.mentoria.cafeteira.cafeteira.ReservatorioAgua;

public class Bebida {
	
	public void prepararBebida(OpcoesBebida bebida, ReservatorioAgua reservatorio) {
		
		Display display = new Display();		
		
		int nivelAcucar = solicitarNivelDeAcucar();
		
		reservatorio.confereNivelDeAgua();
		reservatorio.utilizarAgua(bebida.getUsoAgua());
		
		display.imprime( "Preparando " + bebida.name() + "\n"
			+ "com " + nivelAcucar + ". Adicionando " 
			+ bebida.getIngredientes() + "\n Pronto." );

	}
	
	public int solicitarNivelDeAcucar() {
		Display display = new Display();
		
		Scanner opcaoAcucar = new Scanner(System.in);
		display.imprime("\nDeseja alterar o nível(3) padrão de açucar?\nEntre com o nível" 
				+ "\n1 - 2 - (3) - 4 - 5");

		return opcaoAcucar.nextInt();
	}
	
}
