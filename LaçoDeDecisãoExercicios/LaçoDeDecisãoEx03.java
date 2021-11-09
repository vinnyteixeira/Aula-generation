package programaçãoSequencial;


import java.util.Scanner;

public class LaçoDeDecisãoEx03 {

	public static void main(String[] args) {
		
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) 
		{
			System.out.println("\nInfantil");
		}
		
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nJuvenil");
		}
		
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nAdulto");
		}
		else
		{
			System.out.println("\nIdade fora do intervalo");
		}
	}
}
