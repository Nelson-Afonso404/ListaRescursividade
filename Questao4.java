package listaRecursividade;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		System.out.println(somaAlgarismos(numero));
		scan.close();
	}

	public static int somaAlgarismos(int numero) {
		System.out.println(numero);
		if (numero == 0) {
			return 0;
		} 
		else {
			return numero % 10 + somaAlgarismos(numero / 10);
		}
	}
}