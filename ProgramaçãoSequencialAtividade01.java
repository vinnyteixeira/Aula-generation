package programaçãoSequencial;
import java.util.Scanner;

public class ProgramaçãoSequencialAtividade01 {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem ? ");
		
		int anos = ler.nextInt();
		
		System.out.println("\nE meses ? ");
		
		int meses = ler.nextInt();
		
		System.out.println("\nE dias ? ");
		
		int dias = ler.nextInt();
		
		anos = 365*anos;
		meses = 30*meses;
		
		int resultadoDias;
		
		resultadoDias = anos+meses+dias;
		
		System.out.println("\nSua idade expressa apenas em dias é: " + resultadoDias);
	}

}
