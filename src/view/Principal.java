package view;

import controller.Ordena;

public class Principal {

	public static void main(String[] args) {
		
		Ordena ord = new Ordena();
		int[] vetorBubble = {69,68,32,36,91,19,28,44,88,73,37,99,1};
		int[] vetorMerge = {69,68,32,36,91,19,28,44,88,73,37,99,1};
		ord.TesteBubble(vetorBubble);
		ord.TesteMerge(vetorMerge, 0, vetorMerge.length-1);
	}

}
