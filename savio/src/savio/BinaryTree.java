package savio;

public class BinaryTree {

	int valor;

	BinaryTree left;

	BinaryTree right;

	public int somatorio(BinaryTree binaryTree, int valor) {
		if (binaryTree != null) {
			int somatorio = binaryTree.valor + valor;
			return somatorio(binaryTree.right, somatorio);
		}
		return valor;
	}

}
