package model;

public abstract class Usuario {

	private String email;
	private String senha;

	public Usuario(String email, String senha) {
		this.senha = senha;
		this.email = email;
	}

	public Usuario() {

	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (senha.length() >= 8)
			this.senha = senha;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean logar(String email, String senha) {
		return this.email == email && this.senha == senha;
	}
}
