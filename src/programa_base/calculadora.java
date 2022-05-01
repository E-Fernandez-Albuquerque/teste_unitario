package programa_base;


public class calculadora {
	
	public static float soma(float valor1, float valor2) {
		float soma = valor1 + valor2;
		return soma;
	}
	
	public static float subtracao(float valor1, float valor2) {
		float subtracao = valor1 - valor2;
		return subtracao;
	}
	
	public static float multiplicacao(float valor1, float valor2) {
		float multiplicacao = valor1 * valor2;
		return multiplicacao;
	}
	
	public static float divisao(float valor1, float valor2) {
		float divisao = valor1 / valor2;
		return divisao;
	}
	
	public static float potenciacao(float valor1, float valor2) {
		float potencia = (float) Math.pow(valor1, valor2);
		return potencia;
	}
	
	public static float radiciacao(float valor) {
		float raiz = (float) Math.sqrt(valor);
		return raiz;
	}
	
	public static int fatorial(int valor) {
		int fatorial = 1;
		do {
			fatorial = fatorial * valor;
			valor = valor - 1;
		} while (valor >= 1);
		return fatorial;
	}
}
