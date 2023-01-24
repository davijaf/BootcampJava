package br.com.davi.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	protected String titulo;
	protected String descricao;

	public static double getXpPadrao() {
		return XP_PADRAO;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public abstract double calcularXP();
}
