package model;

public class Relato {
	private String texto;

	public Relato(String texto) {
		super();
		this.texto = texto;
	}

	public Relato() {
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		if (texto.length() >= 60 && texto.length() <= 500)
			this.texto = texto;
	}

	@Override
	public String toString() {
		return "Relato: texto = " + texto;
	}

}
