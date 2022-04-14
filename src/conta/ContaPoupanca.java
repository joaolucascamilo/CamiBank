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
			System.err.println("VALOR INCORRETO, NÃO FOI POSSÍVEL REALIZAR O SAQUE.");
		}
		
	}
}
