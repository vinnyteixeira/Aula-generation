package generation;

import java.util.Scanner;

public class ExercicioLa�oDeRepeti��oFor02 {
	
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x,num,contPar=0,contImpar=0;
		
		
		
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			
			
			if(num%2==0)
			{
				contPar++;
			}
			else if(num%2==1)
			{
				contImpar++;
			}
			
		}
		System.out.printf("\nVoce digitou: %d, numero(s) par(es)...",contPar);
		System.out.printf("\nVoce digitou: %d, numero(s) impar(es)...",contImpar);
		

	}

}
