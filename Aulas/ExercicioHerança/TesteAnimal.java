package generation;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1 = new Cachorro("Cachorro",7,"Latido","sim");
		animal1.imprimirInfo();
		
		Animal animal2 = new Cavalo("Cavalo",15,"Relincha","sim");
		animal2.imprimirInfo();
		
		Animal animal3 = new Preguica("Pregui�a",30,"Grunhido","n�o","sim");
		animal3.imprimirInfo();
		

	}

}
