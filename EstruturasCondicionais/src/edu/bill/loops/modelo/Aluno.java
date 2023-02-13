package edu.bill.loops.modelo;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private Double[] notas;
	private Double media;
	private String situacaoAluno;
	
	public Aluno() {}

	public Aluno(String nome, Double[] notas) {
		super();
		this.nome = nome;
		this.notas = notas;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}

	public Double getMedia() {
		return media;
	}

	public String getSituacaoAluno() {
		return situacaoAluno;
	}

	public void calcularMedia() {
		media = 0.0;
		for (Double nota:notas) {
		media +=nota; 
		}
		media = media/notas.length;
	}
	
	public void gerarSituacaoAluno() {
		situacaoAluno = (media >= 6.00) ? "Aprovado" : "Reprovado";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		String listaNotas= " ";
		int cont = 1;
		for (Double nota : notas) {
			listaNotas += "nota " + cont + ": " + String.format("%.2f", nota) + " ";
			cont++;
		}
		return "Aluno [nome =" + nome 
				+ listaNotas + ", media= " + String.format("%.2f", media)
				+ " Situacao do Aluno=" + situacaoAluno + "]";
	}
	
	
}
