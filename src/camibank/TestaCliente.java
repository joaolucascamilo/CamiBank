package camibank;

public class TestaCliente {
	public static void main(String[] args) {
		Conta contaDeMateus = new Conta();
		contaDeMateus.setTitular(new Cliente());
		contaDeMateus.getTitular().setNome("Mateus");  
		System.out.println(contaDeMateus.getTitular().getNome());
	}
}
