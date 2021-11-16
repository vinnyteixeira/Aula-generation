package generation;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade, String emiteSom, String corre)
			
	{
		super(nome,idade,emiteSom,corre);
		
	}
	
	public void imprimirInfo ()
	{
	System.out.println("\nNome do animal: "+getNome()+"\nIdade do animal: "+getIdade()+"\nQue som ele emite: "+getEmiteSom()+"\nEle corre: "+getCorre());			
	}
	
	
	
}
