package bank;

public class Banco {

	/// <summary>
	/// Bank account demo class.
	/// </summary>
	private String nomeCliente;
	private double saldo;

	public Banco(String nomeCliente, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void debitar(double saque) {
		if (saque > saldo) {
			throw new IndexOutOfBoundsException("Saque maior que saldo");
		}

		if (saque < 0) {
			throw new IndexOutOfBoundsException("Saque menor que zero");
		}

		saldo -= saque; // intentionally incorrect code
	}

	public void creditar(double deposito) {
		if (deposito < 0) {
			throw new IndexOutOfBoundsException("Deposito menor que zero");
		}

		saldo += deposito;
	}

	public static void main(String[] args) {
		
		Banco ba = new Banco("Jônatas Oliveira", 11.99);

		ba.creditar(5.77);
		ba.debitar(11.22);
		System.out.println("O saldo atual é: " + ba.saldo);
	}

}
