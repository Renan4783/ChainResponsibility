package br.unicentro.acaddecomp;

public class Processador25 implements Processador {

	@Override
	public void processaReq(double valor) {
		int moedas = (int)(valor/0.25);
		System.out.println("Moedas de 25 centavos: " + moedas);
	}
}
