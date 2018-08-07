package br.unicentro.acaddecomp;

public class Processador1 implements Processador {

	private Processador50 next;

	@Override
	public void processaReq(double valor) {
		int moedas = (int)(valor/1);
		double resto;
		resto = valor % 1;
		next = new Processador50();
		next.processaReq(resto);
		System.out.println("Moedas de 1 Real: " + moedas);
	} 
	
}
