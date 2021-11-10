package generation;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/

public class ExerciciosLaçoDeRepetição01DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num,resultado = 0;
			
		do
		{
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
			
			resultado += num;
			
		}while(num!=0);
		
		System.out.println("\nA soma dos numeros digitados foi: "+resultado);
		
		

	}

}
