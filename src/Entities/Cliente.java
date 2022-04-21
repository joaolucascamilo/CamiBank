package Entities;

import camibank.AutenticacaoUtil;
import camibank.Autenticavel;

public class Cliente implements Autenticavel {
	private String nome;
	private String cpf;
	private String profissao;
	private int senha;
	private AutenticacaoUtil autenticador;

	public Cliente(String nome, String cpf, String profissao) {
		if (nome.isEmpty() || cpf.isEmpty() || profissao.isEmpty()) {
			System.err.println("CAMPO OBRIGATÓRIO NULO");
			return;
		}
		this.autenticador = new AutenticacaoUtil();
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getProfissao() {
		return this.profissao;
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
