package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author toshyro
 * @version 1.0
 */

public abstract class Conta extends Object{
	protected  double saldo;
	protected int numero;
	protected int agencia;
	private Cliente titular;
	private static int total;
	
	/**
	 * 	Contrutor para inicializar o objeto COnta a partir da agencia e numero.
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("total de contas :" + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando a conta" + this.numero);
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

	public void deposita(double valor) {

		this.saldo += valor;
	}

	/**
	 * Valor precisa ser maior do que o Saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsufucienteException
	 */
	
	public void saca(double valor) throws SaldoInsufucienteException{

		if (this.saldo < valor) {
			throw new SaldoInsufucienteException("Saldo: "+ this.saldo + ", Valor " + valor);
		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsufucienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode ser menor ou igual a zero");
			return;
		}
		this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode ser menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	@Override
	public boolean equals(Object ref) {
		
		Conta outra =(Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
	return "Numero: " + this.getNumero() + ", Agencia " + this.agencia;
	}
	
}