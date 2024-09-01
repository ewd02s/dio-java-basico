public class TiposVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Tipos e Variáveis!");

        //Ver tbm tipos primitivos
        //e classe string que representa texto na aplicação

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        double salarioMinimo = 2500.50;

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Sobre uso de variáveis e constantes:

        int numero = 5;

		numero = 10;

		System.out.print(numero);
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
        
    }
}
