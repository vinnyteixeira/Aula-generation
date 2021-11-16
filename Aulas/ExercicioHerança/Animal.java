package generation;

public class Animal {
	
	private String nome;
	private int idade;
	private String emiteSom;
	private String corre;
	
	public Animal(String nome, int idade, String emiteSom, String corre)
	{
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		this.corre = corre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public void imprimirInfo() {
		
		
	}

	
	
	

}
