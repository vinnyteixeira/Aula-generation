package programaçãoSequencial;
import java.util.Scanner;

public class ProgramaçãoSequencialAtividade06 {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de x1: ");
		
		double x1 = ler.nextInt();
		
		System.out.println("\nEntre com o valor de x2: ");
		
		double x2 = ler.nextInt();
		
		System.out.println("\nEntre com o valor de y1: ");
		
		double y1 = ler.nextInt();
		
		System.out.println("\nEntre com o valor de y2: ");
		
		double y2 = ler.nextInt();
		
		double d = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		
		System.out.println("\nO valor da distancia entre dois pontos foi de: " + Math.round(d));
	}

}
