package model;

public class Agenda {

	private String dataInicio;
	private String dataTermino;

	public Agenda(String dataInicio, String dataTermino) {
		super();
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}

	public Agenda() {
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	@Override
	public String toString() {
		return "Agenda: data de Inicio = " + dataInicio + ", data de Fim = " + dataTermino;
	}

}
