package generation;

public class PooProdutoEletronicoTesteEx03 {

	public static void main(String[] args) {

		System.out.println("\n\t\t\tConsultando disponibilidade da(s) pe�a(s) e valor(es)");
		PooProdutoEletronicoEx03 eletronico1 = new PooProdutoEletronicoEx03("Placa de video RTX 3080ti",50,10000,"Oder�o");
		eletronico1.imprimirInfo();
		System.out.println("\n\t\t\tProduto disponivel :)");
		
		System.out.println("\n\t\t\tConsultando disponibilidade da(s) pe�a(s) e valor(es)");
		PooProdutoEletronicoEx03 eletronico2 = new PooProdutoEletronicoEx03("Placa de video GTX 1080ti",0,5000,"Mazer");
		eletronico2.imprimirInfo();
		System.out.println("\n\t\t\tProduto indisponivel :(");
		
	}

}
