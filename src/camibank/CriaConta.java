package camibank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(2456, 65895);
		primeiraConta.deposita(200);
		System.out.println("primeiraConta Número: " + primeiraConta.getNumero());
		System.out.println("primeiraConta Agencia: " + primeiraConta.getAgencia());
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(5486, 20154);
		segundaConta.deposita(50);
		
		
		System.out.println("Total de contas: " + Conta.getTotal());
		
		System.out.println("Titular da primeira conta: " + primeiraConta.getTitular());
		primeiraConta.setTitular(new Cliente("Rafael Leão", "156.496.325-18", "Professor"));
		System.out.println("Titular da conta " + primeiraConta.getNumero() + ": " + primeiraConta.getTitular().getNome());
		System.out.println("CPF: " + primeiraConta.getTitular().getCpf());
		System.out.println("Profissão: " + primeiraConta.getTitular().getProfissao());
	}

}
