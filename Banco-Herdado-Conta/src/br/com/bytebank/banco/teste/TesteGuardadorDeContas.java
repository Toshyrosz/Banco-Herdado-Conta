package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;

public class TesteGuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;

	public TesteGuardadorDeContas () {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adicionar(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return (Conta) this.referencias[pos];
	}

}
