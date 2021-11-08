package programaçãoSequencial;
import java.util.Scanner;

public class ProgramaçãoSequencialAtividade05 {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		
		float n1 = ler.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		
		float n2 = ler.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		
		float n3 = ler.nextFloat();
		
		float media = (n1*2)+(n2*3)+(n3*5);
		
		float mediapond = media/10;
		
		
		System.out.printf("\nA média pondera é %2.2f",mediapond);
	}

}
