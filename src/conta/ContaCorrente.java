package conta;

public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(numero, agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}else {
			System.err.println("VALOR INCORRETO, NÃO FOI POSSÍVEL REALIZAR O SAQUE.");
		}
	}
}
