package camibank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100;
		System.out.println(primeiraConta.saldo); 
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo += 700;
		
		System.out.println(primeiraConta.saldo); 
		System.out.println(segundaConta.saldo); 
		 
		if(primeiraConta == segundaConta) { 
			System.out.println("São iguais");
		}
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta);
		
	}

}
