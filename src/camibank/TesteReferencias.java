package camibank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo()); 
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(700);
		
		System.out.println(primeiraConta.getSaldo()); 
		System.out.println(segundaConta.getSaldo()); 
		 
		if(primeiraConta == segundaConta) { 
			System.out.println("São iguais");
		}
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta);
		
	}

}
