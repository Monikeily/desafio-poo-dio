package br.com.dio.desafio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() {
		super();
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}


	
	

}
