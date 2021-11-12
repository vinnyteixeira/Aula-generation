package generation;

public class PooClienteTesteEx01 {

	public static void main(String[] args) {
		
		PooClienteEx01 cliente1 = new PooClienteEx01("Vinicius Teixeira",123456456456l,912345678,"Calça",80);
		cliente1.imprimirInfo();
		System.out.println("\n***Compra efetuada***");
		
		PooClienteEx01 cliente2 = new PooClienteEx01("Elaine Teixeira",85652141563l,986477863,"Camisa",30);
		cliente2.imprimirInfo();
		System.out.println("\n***Compra efetuada***");
		

	}

}
