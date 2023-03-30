package listaRecursividade;

public class Questao2 {

	public static void main(String[] args) {
		System.out.println(fatorial(5));

	}
	public static int fatorial(int n){
		if( n == 1) {
			return n;
		}
		System.out.println(n);
		return n * fatorial(n-1);
	}

}
