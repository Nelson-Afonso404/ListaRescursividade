package listaRecursividade;

public class Questao1 {
	//	1 � O m�todo a seguir, executa o c�lculo do MDC (m�ximo divisor comum) de dois inteiros positivos m e n. Escreva um m�todo recursivo equivalente.
	//	public static int CalculaMDC(int m, int n){
	//	int r;
	//	do{
	//	r = m%n;
	//	m = n;
	//	n = r;
	//	} while (r != 0);
	//	return m;
	//	}

	public static void main(String[] args) {
		int  m = 34, n =68;
		System.out.println(CalculaMDCRecursivo(m, n));
		
	}
	public static int CalculaMDCRecursivo(int m, int n) {
	    if (n == 0) {
	        return m;
	    } else {
	        return CalculaMDCRecursivo(n, m % n);
	    }
	}

}
