package conta;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1515, 1602);
		ContaPoupanca cp = new ContaPoupanca(2876, 466892);

		cc.deposita(100);
		cc.transfere(56, cp);
		cc.saca(24);
		
		System.out.println("SALDO CONTA CORRENTE: " + cc.getSaldo());
		System.out.println("SALDO CONTA POUPANÇA: " + cp.getSaldo());
		
		cp.deposita(100);
		cp.transfere(60, cc);
		
		System.out.println("SALDO CONTA CORRENTE: " + cc.getSaldo());
		System.out.println("SALDO CONTA POUPANÇA: " + cp.getSaldo());
		
		

	}

}
