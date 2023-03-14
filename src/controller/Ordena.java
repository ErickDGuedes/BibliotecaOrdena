package controller;

import OrdenacaoBiblioteca.Ordenacoes;

public class Ordena {
	
	public Ordena() {
		super();
	}
	
	public void TesteBubble(int[] vetor) {
		Ordenacoes or = new Ordenacoes();
		or.bubbleSort(vetor);
		
	}
	
	public void TesteMerge(int[] vetor, int inicio, int fim) {
		Ordenacoes or = new Ordenacoes();
		or.mergeSort(vetor, inicio, fim);
		for(int valor : vetor) {
			System.out.print(valor+" ");
		}
	}

}
