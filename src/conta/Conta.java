package conta;

public abstract class Conta {
	protected double saldo;
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
		System.out.println("Estou criando uma nova conta " + this.numero);
	}

	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		System.err.println("SALDO INSUFICIENTE, NÃO FOI POSSÍVEL REALIZAR O SAQUE.");
		return false;
	}

	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		}
		System.err.println("SALDO INSUFICIENTE, NÃO FOI POSSÍVEL REALIZAR A TRANSFERÊNCIA.");
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
