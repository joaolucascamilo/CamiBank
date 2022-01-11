package camibank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(300);
		System.out.println(contaDoJoao.getSaldo());
		contaDoJoao.saca(100);
		System.out.println(contaDoJoao.getSaldo());
		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);
		contaDoJoao.transfere(100, contaDaMaria);
		System.out.println("Saldo de Maria: " + contaDaMaria.getSaldo());
		System.out.println("Saldo de Jo�o: " + contaDoJoao.getSaldo());
	}
}