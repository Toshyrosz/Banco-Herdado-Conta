package br.com.bytebank.banco.modelo;


public class SaldoInsufucienteException extends Exception {

	private static final long serialVersionUID = 1L;

	public SaldoInsufucienteException(String msg) {
		super(msg);
	}

}
