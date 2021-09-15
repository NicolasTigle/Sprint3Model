package model;

public class UsuarioComum extends Usuario {
	private String nome;
	private String dataNasc;
	private int telefone;
	private String emailReserva;
	private int resultTesteAnsiedadeInicial;
	private int resultTesteAnsiedadeAtual;

	public UsuarioComum(String nome, String dataNasc, String senha, int telefone, String email, String emailReserva,
			int resultTesteAnsiedadeInicial, int resultTesteAnsiedadeAtual) {
		super(senha, email);
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.resultTesteAnsiedadeInicial = resultTesteAnsiedadeInicial;
		this.resultTesteAnsiedadeAtual = resultTesteAnsiedadeAtual;
		this.emailReserva = emailReserva;
	}

	public UsuarioComum() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		if (telefone >= 900000000 && telefone <= 999999999)
			this.telefone = telefone;
	}

	public String getEmailReserva() {
		return emailReserva;
	}

	public void setEmailReserva(String emailReserva) {
		this.emailReserva = emailReserva;
	}

	public int getResultTesteAnsiedadeInicial() {
		return resultTesteAnsiedadeInicial;
	}

	public void setResultTesteAnsiedadeInicial(int resultTesteAnsiedadeInicial) {
		this.resultTesteAnsiedadeInicial = resultTesteAnsiedadeInicial;
	}

	public int getResultTesteAnsiedadeAtual() {
		return resultTesteAnsiedadeAtual;
	}

	public void setResultTesteAnsiedadeAtual(int resultTesteAnsiedadeAtual) {
		if (resultTesteAnsiedadeAtual >= 0 && resultTesteAnsiedadeAtual <= 3)
			this.resultTesteAnsiedadeAtual = resultTesteAnsiedadeAtual;
	}

	@Override
	public String toString() {
		return "Usuario: nome = " + nome + ", data de nascimento = " + dataNasc + ", telefone = " + telefone
				+ ", email Reserva = " + emailReserva + ", resultTesteAnsiedadeInicial = " + resultTesteAnsiedadeInicial
				+ ", resultTesteAnsiedadeAtual = " + resultTesteAnsiedadeAtual + ", Senha = " + getSenha() + ",Email = "
				+ getEmail();
	}

}
