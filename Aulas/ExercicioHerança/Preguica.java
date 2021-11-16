package generation;

public class Preguica extends Animal {
	
	private String SobeEmArvores;
	
	public Preguica(String nome, int idade, String emiteSom, String corre , String SobeEmArvores)
			
	{
		super(nome,idade,emiteSom,corre);
		this.SobeEmArvores = SobeEmArvores;
		
	}
	
	public void imprimirInfo ()
	{
		System.out.println("\nNome do animal: "+getNome()+"\nIdade do animal: "+getIdade()+"\nQue som ele emite: "+getEmiteSom()+"\nEle corre: "+getCorre()+"\nEle sobe em árvores: "+SobeEmArvores);			
	}

	public String getSobeEmArvores() {
		return SobeEmArvores;
	}

	public void setSobeEmArvores(String sobeEmArvores) {
		SobeEmArvores = sobeEmArvores;
	}
	
	
	
}
