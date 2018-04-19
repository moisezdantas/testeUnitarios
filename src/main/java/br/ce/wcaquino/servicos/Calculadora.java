package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroExpection;

public class Calculadora {

	public int somar(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}

	public int dividir(int a, int b) throws NaoPodeDividirPorZeroExpection {
		if(b==0) {
			throw new NaoPodeDividirPorZeroExpection();
		}
		return a / b;
	}

	
}
