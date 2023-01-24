package br.com.davi.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private LocalDate data;
	
	public Mentoria() {

	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo= " + this.titulo + ", descricao= " + this.descricao + ", data= " + data + ", XP " + calcularXP() + "]";
	}

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	
}
