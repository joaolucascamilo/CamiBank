package camibank;

public class TestaCliente {
	public static void main(String[] args) {
		Conta contaDeMateus = new Conta();
		contaDeMateus.titular = new Cliente();
		contaDeMateus.titular.nome = "Mateus";
	}
}
