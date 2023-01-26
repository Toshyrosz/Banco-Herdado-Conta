package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		System.out.println('x');
		System.out.println(3);
		System.out.println(false);

		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(23, 335);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(cliente);

		
	}

	static void print() {

	}

	static void println(int a) {

	}

	static void println(boolean valor) {

	}
	
	static void println(ContaCorrente conta) {

	}
	
	static void println(Object conta) {

	}
	
}
