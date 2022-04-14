package conta;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;
		}else {
			System.err.println("VALOR INCORRETO, N�O FOI POSS�VEL REALIZAR O SAQUE.");
		}
		
	}
}
