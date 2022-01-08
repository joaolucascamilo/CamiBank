package camibank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(300);
		System.out.println(contaDoJoao.saldo);
		contaDoJoao.saca(100);
		System.out.println(contaDoJoao.saldo);
		Conta contaDaMaria = new Conta();
		contaDaMaria.saldo = 1000;
		contaDoJoao.transfere(100, contaDaMaria);
		System.out.println("Saldo de Maria: " + contaDaMaria.saldo);
		System.out.println("Saldo de João: " + contaDoJoao.saldo);
	}
}