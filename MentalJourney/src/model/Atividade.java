package model;

public class Atividade {
	private String tipo;
	private int nivelIntensidade;
	private String nome;
	private String descricao;

	public Atividade(String tipo, int nivelIntensidade, String nome, String descricao) {
		super();
		this.tipo = tipo;
		this.nivelIntensidade = nivelIntensidade;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Atividade() {

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivelIntensidade() {
		return nivelIntensidade;
	}

	public void setNivelIntensidade(int nivelIntensidade) {
		if (nivelIntensidade >= 1 && nivelIntensidade <= 3)
			this.nivelIntensidade = nivelIntensidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 5 && nome.length() <= 25)
			this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() >= 20 && descricao.length() <= 200)
			this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Atividade: tipo = " + tipo + ", nivel de Intensidade = " + nivelIntensidade + ", nome = " + nome
				+ ", descricao = " + descricao;
	}

}
