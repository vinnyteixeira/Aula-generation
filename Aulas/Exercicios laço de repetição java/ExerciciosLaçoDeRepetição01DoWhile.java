package generation;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
*/

public class ExerciciosLa�oDeRepeti��o01DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num,resultado = 0;
			
		do
		{
			System.out.println("\nEntre com um n�mero: ");
			num = ler.nextInt();
			
			resultado += num;
			
		}while(num!=0);
		
		System.out.println("\nA soma dos numeros digitados foi: "+resultado);
		
		

	}

}
