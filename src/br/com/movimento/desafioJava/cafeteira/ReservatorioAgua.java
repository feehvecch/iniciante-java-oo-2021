package br.com.movimento.desafioJava.cafeteira;

import java.util.Scanner;

public class ReservatorioAgua {
	
	private int nivelAgua;

	public void confereNivelDeAgua() {
		int reservatorio = getNivelAgua();
		
		if (reservatorio < 50) {
			new Display().imprime("\nN�vel de �gua baixo. Com " + reservatorio + " ml");
			int abastecer;
			
			do {
				Scanner opcaoAbastecer = new Scanner(System.in);
				new Display().imprime("\nN�vel de �gua baixo. Deseja abastecer o reservat�rio?"
						+ "\n1 - Sim"
						+ "\n2 - N�o");
				abastecer = opcaoAbastecer.nextInt();
			}while(abastecer == 2);
			
			if(abastecer == 1) abastecerAgua();			
			
		}	
		
	}

	public void abastecerAgua() {
		
		setNivelAgua(1000);
		int reservatorio = getNivelAgua();
		
		new Display().imprime("\nAbastecendo n�vel de �gua do reservat�rio."
				+ "\nReservat�rio agora com " + reservatorio + " ml.");
	}
	
	public int getNivelAgua() {
		return nivelAgua;
	}
	
	public void setNivelAgua(int nivelAgua) {
		this.nivelAgua = nivelAgua;
	}

	public void utilizarAgua(int usoAgua) {
		int nivelTotal = getNivelAgua();
		nivelTotal -= usoAgua;
		setNivelAgua(nivelTotal);
		new Display().imprime("Utilizados " + usoAgua +"ml de �gua."
				+ "\nN�vel atual de �gua: " + nivelTotal + "ml.");
	}

}
