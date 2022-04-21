package camibank;

public class SistemaInterno {

	private int senha = 1111;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);

		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.err.println("Não pode entrar no sistema");
		}

	}

}
