package edu.bill.condicionais;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args)  {
		
		int nota;
		String situacaoAluno;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		nota = sc.nextInt();
		do {
			if (nota>=0 && nota<=10) { 
				situacaoAluno = nota>= 6 ? "Aprovado":"Reprovado";
				System.out.println("Aluno está com nota: " + nota + " situação: " + situacaoAluno);
			}else {
				System.out.println("Nota invalida");
				break;
			}
		}while(true);
		
		sc.close();
	}

}
