package listaRecursividade;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int decimal;
		System.out.println("escreva um numero: ");
		decimal = scan.nextInt();
		String binario = decimalParaBinario(decimal);
		System.out.println(binario);
		scan.close();
	}
	public static String decimalParaBinario(int decimal) {
	    if (decimal == 0) {
	        return "0";
	    } else if (decimal == 1) {
	        return "1";
	    } else {
	        int resto = decimal % 2;
	        return decimalParaBinario(decimal / 2) + Integer.toString(resto);
	    }
	}

}
