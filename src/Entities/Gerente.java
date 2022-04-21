package Entities;

import camibank.AutenticacaoUtil;
import camibank.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	private int senha;

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
}
