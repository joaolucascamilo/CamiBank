package Entities;

import camibank.AutenticacaoUtil;
import camibank.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	private int senha;
	
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
