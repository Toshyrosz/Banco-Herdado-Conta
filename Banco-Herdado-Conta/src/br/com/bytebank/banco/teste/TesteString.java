package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		//String imutavel
		String nome = "Alura";//object literal
		//String outro = new String("Alura");

		String vazio =" Alura         ";
		
		String outroVazio = vazio.trim();
		
		System.out.println(outroVazio);
		System.out.println(vazio.contains("Alu"));
		System.out.println(nome.length());
		
		for(int i = 0 ; i< nome.length();i++) {
			System.out.println(nome.charAt(i));
		}
		
		//		String sub = nome.substring(1);
		//		System.out.println(sub);

		//		int pos = nome.indexOf("ur");
		//		System.out.println(pos);
		//		

		//		char c = nome.charAt(2);
		//		System.out.println(c);

		//		char c ='A';
		//	
		//		char d ='a';

		//		
		//		String outra = nome.replace(c,d);

		//		
		//		String outra = nome.toLowerCase();

		//		

		//		System.out.println(outra);
		//		System.out.println(nome);

	}

}
