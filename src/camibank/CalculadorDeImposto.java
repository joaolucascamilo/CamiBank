package camibank;

public class CalculadorDeImposto { // CALCULA O VALOR TOTAL DOS IMPOSTOS
	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}
}
