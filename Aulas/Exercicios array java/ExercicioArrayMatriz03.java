package generation;

import java.util.Scanner;

public class ExercicioArrayMatriz03 {

	public static void main(String[] args) {
		
		
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int[][] matriz = new int[3][3];
		int linha,coluna,valMaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com os valores da matriz: ");
				matriz[linha][coluna] = leia.nextInt();	
				
				if(matriz[linha][coluna]>10 )
				{
					valMaior++;
				}	
			}		
		}	
		System.out.println("\nA quantidade de valores maiores que 10 são: "+valMaior);
	}
}

