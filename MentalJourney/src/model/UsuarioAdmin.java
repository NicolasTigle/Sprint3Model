package model;

public class UsuarioAdmin extends Usuario {
	public UsuarioAdmin(String email, String senha) {
		super(email, senha);
	}

	public UsuarioAdmin() {
	}

	@Override
	public String toString() {
		return "Adm: Senha = " + getSenha() + ", Email = " + getEmail();
	}
}
