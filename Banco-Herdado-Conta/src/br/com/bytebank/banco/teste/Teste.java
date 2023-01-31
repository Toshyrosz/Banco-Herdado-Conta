package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		TesteGuardadorDeContas guardador = new TesteGuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
