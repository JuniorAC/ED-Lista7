package view;

import controller.mergeSort;

public class menu {

	public static void main(String[] args) {
		int vet1[] = { 26, 69, 25, 53, 59, 27, 42, 0, 33, 16, 35, 43 };
		String mostra = "";
		System.out.println("vetor desorganizado antes do Merge Sort");
		for (int i = 0; i < 11; i++) {
			mostra = mostra + vet1[i] + " ";
		}
		System.out.println(mostra);
		mostra = "";

		mergeSort M = new mergeSort();

		M.mergeSortRecursivo(vet1, 0, 11);
		System.out.println("vetor organizado após o Merge Sort");
		for (int i = 0; i < 11; i++) {
			mostra = mostra + vet1[i] + " ";
		}
		System.out.println(mostra);
	}
}
