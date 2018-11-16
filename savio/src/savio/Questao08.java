package savio;

public class Questao08 {
	
	public static void main(String[] args) {
		int a = 10256;
		int b = 512;
		int c = getValorC(a, b);
		System.out.println(c);
	}

	private static int getValorC(int a, int b) {
		StringBuilder stringC = new StringBuilder();
		int numeroMaior = getNumeroMaior(a, b);
		int numeroMenor = getNumeroMenor(numeroMaior, a, b);
		int tamanhoNumeroMenor = String.valueOf(numeroMenor).length();
		int range = tamanhoNumeroMenor + 1;
		for (int index = 1; index < range; index++) {
			int i = index - 1;
			stringC.append(String.valueOf(a).substring(i, index));
			stringC.append(String.valueOf(b).substring(i, index));
		}
		String stringNumeroMaior = String.valueOf(numeroMaior);
		stringC.append(stringNumeroMaior.substring(tamanhoNumeroMenor, stringNumeroMaior.length()));
		if (Long.valueOf(stringC.toString()) > Integer.MAX_VALUE || Integer.valueOf(stringC.toString()) > 1000000) {
			return -1;
		}
		return Integer.valueOf(stringC.toString());
	}

	private static int getNumeroMenor(int numeroMaior, int a, int b) {
		if (numeroMaior == a) {
			return b;
		}
		return a;
	}

	private static int getNumeroMaior(int a, int b) {
		int tamanhoA = String.valueOf(a).length();
		int tamanhoB = String.valueOf(b).length();
		if (tamanhoA > tamanhoB) {
			return a;
		}
		return b;
	}

}