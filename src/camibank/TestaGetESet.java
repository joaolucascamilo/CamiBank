package camibank;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta contaDeJoao = new Conta();
		Cliente joao = new Cliente();
		contaDeJoao.setTitular(joao);
		contaDeJoao.deposita(160);
		System.out.println(contaDeJoao.getSaldo());
		contaDeJoao.getTitular().setNome("João Lucas");
		System.out.println(contaDeJoao.getTitular().getNome());
		contaDeJoao.setAgencia(1456);
		System.out.println(contaDeJoao.getAgencia());
	}

}
