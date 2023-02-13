package edu.bill.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import edu.bill.loops.modelo.Aluno;

public class Loop {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		// Recebe a nome e as notas de 6 alunos.
		
		for (int i = 0; i<6;i++) {
			Aluno auxAluno= new Aluno();
			System.out.println("Digite o nome do "+(i+1)+"º aluno: ");
			auxAluno.setNome(sc.next());
			Double[] notas = new Double[3];
			for (int j = 0; j<3; j++) {
				System.out.println("Digite a "+(j+1)+"ª nota do aluno: ");
				notas[j]= sc.nextDouble();
			}
			auxAluno.setNotas(notas);
			auxAluno.calcularMedia();
			auxAluno.gerarSituacaoAluno();
		alunos.add(auxAluno);
		}
		
		// Gera uma lista com os alunos com as notas, media e situação.
		
		for (Aluno aluno: alunos)System.out.println(aluno);
		
		sc.close();
	}

}
