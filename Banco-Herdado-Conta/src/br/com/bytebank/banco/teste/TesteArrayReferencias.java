package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Object[] referencias = new Object [5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0]=cc1;
		ContaPoupanca cc2 = new ContaPoupanca(22, 12);
		referencias[1]=cc2;
		ContaCorrente cc3 = new ContaCorrente(22, 13); 
		referencias[2]=cc3;
		ContaCorrente cc4 = new ContaCorrente(22, 14);
		referencias[3]=cc4;
		ContaCorrente cc5 = new ContaCorrente(22, 15);
		referencias[4]=cc5;
		
		Cliente cliente = new Cliente();
		referencias[2]=cliente;
		
		//System.out.println(contas[1].getNumero());
		
		//Object referenciaGenerica =contas[1];
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
		System.out.println(ref.getNumero());
	}

}
