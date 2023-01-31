package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {	
	
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 13);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 14);
		lista.add(cc4);

		for(int i = 0 ; i< lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println(lista.size());// tamanho da array
		
		Conta ref = (Conta)lista.get(0);
		
		System.out.println(ref.getNumero()); 
		
		lista.remove(0);
		
		System.out.println("tamanho : " + lista.size());
		
		
		
	}
		
}
