package programaçãoSequencial;

import java.util.Scanner;

public class LacoDeDecisãoEx01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("O maior numero é: " + num1);
		}
		if(num2>num1 && num2>num3)
		{
			System.out.println("O maior numero é: " + num2);
		}
		if(num3>num1 && num3>num2)
		{
			System.out.println("O maior numero é: " + num3);
		}
		else
		{
			System.out.println("Digite um valor valido!");
		}

	}

}
