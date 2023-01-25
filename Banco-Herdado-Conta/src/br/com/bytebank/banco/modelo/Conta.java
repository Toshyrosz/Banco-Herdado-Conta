package br.com.bytebank.banco.modelo;

public class Conta {
	public double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("total de contas �:" + total);
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

}