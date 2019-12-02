package model;

import java.time.LocalDate;

public class Task {
	
	private String cosaDafare;
	private String categoria;
	
	private boolean isFatta;
	private LocalDate dataInizio, dataCompletamento;
	
	
	
	public Task(String cosaDafare, String categoria) {
		this.cosaDafare = cosaDafare;
		this.categoria = categoria;
		this.dataInizio = LocalDate.now();
		this.dataCompletamento=null;
		this.isFatta=false;
	}

	public void setDataCompletamento(LocalDate dataCompletamento) {
		this.dataCompletamento = dataCompletamento;
		this.isFatta=true;
	}
	
	
	//sono i getters
	public LocalDate getDataCompletamento() {
		return dataCompletamento;
	}

	public String getCosaDafare() {
		return cosaDafare;
	}

	public boolean isFatta() {
		return isFatta;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public String getCategoria() {
		return categoria;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Categoria: "+this.categoria)
			.append("\nTask: "+this.cosaDafare)
			.append("\nGenerato il: "+this.dataInizio);
		return sb.toString();
	}
	
	
	
	

}



