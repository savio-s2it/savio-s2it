package savio;

public class Questao09 {
	
	public static void main(String[] args) {
		
		BinaryTree root = new BinaryTree();
		
		BinaryTree no01 = new BinaryTree();
		no01.valor = 40;
		root.right = no01;
		no01.left = root;
		
		BinaryTree no02 = new BinaryTree();
		no02.valor = 10;
		no01.right = no02;
		no02.left = no01;
		
		BinaryTree no03 = new BinaryTree();
		no03.valor = 11;
		no02.right = no03;
		no03.left = no02;
		
		BinaryTree no04 = new BinaryTree();
		no04.valor = 44;
		no03.right = no04;
		no04.left = no03;
		
		int somatorio = root.somatorio(no04, 0);
		System.out.println(somatorio);

	}
	
}


