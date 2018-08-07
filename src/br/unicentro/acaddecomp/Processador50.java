package br.unicentro.acaddecomp;

public class Processador50 implements Processador {

	private Processador25 next;
	
	@Override
	public void processaReq(double valor) {
		int moedas = (int)(valor/0.50);
		double resto;
		resto = valor % 0.50;
		next = new Processador25();
		next.processaReq(resto);
		System.out.println("Moedas de 50 centavos: " + moedas);
	}

}
