package camibank;

public class Conta {
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;
	
	public Conta(int numero, int agencia) {
		total++; //Sempre que uma instancia da classe Conta for iniciada, será adicionado +1 ao total
		if(numero <= 0 || agencia <=0) {
			System.err.println("Número e agência não podem ser menor ou igual a 0");
			return;
		}
		this.numero = numero;
		this.agencia = agencia;
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
