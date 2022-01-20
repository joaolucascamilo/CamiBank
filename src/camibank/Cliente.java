package camibank;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	public Cliente(String nome, String cpf, String profissao) {
		if(nome.isEmpty()|| cpf.isEmpty() || profissao.isEmpty()) {
			System.err.println("CAMPO OBRIGATÓRIO NULO");
			return;
		}
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
	
}
