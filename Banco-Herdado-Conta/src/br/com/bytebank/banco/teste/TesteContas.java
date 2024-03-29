package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsufucienteException;

//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsufucienteException{
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);

	    ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		
		System.out.println("CP: " + cp.getSaldo());

	}

}
