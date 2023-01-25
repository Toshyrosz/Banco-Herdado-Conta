package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculardorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
	ContaCorrente cc= new ContaCorrente (222,333);
	cc.deposita(100);
	
	SeguroDeVida seguro = new SeguroDeVida();
	
	CalculardorDeImposto calc = new CalculardorDeImposto();
	calc.registra(cc);
	calc.registra(seguro);
	
	System.out.println(calc.getTotalImposto());

	}



}
