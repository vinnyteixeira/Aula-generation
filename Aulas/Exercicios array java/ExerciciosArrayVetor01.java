package generation;



public class ExerciciosArrayVetor01 {
	/*
	 * 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

	 * 
	 */

	public static void main(String[] args) {
		
	
		
		int[] A = new int[] {1, 0, 5, -2, -5, 7};
		
		int soma= A[0] + A[1] + A[5];
		
		System.out.println("\nO valor da soma das posi��es dos vetores A[0], A[1] e A[5] �: "+soma);
		
		A[4]=100;
		
		System.out.println("\nValor vetor A[0]: "+A[0]);
		
		System.out.println("\nValor vetor A[1]: "+A[1]);
		
		System.out.println("\nValor vetor A[2]: "+A[2]);
		
		System.out.println("\nValor vetor A[3]: "+A[3]);
		
		System.out.println("\nValor vetor A[4]: "+A[4]);
		
		System.out.println("\nValor vetor A[5]: "+A[5]);

	}

}
