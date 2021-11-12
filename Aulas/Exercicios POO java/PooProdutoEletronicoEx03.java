package generation;

public class PooProdutoEletronicoEx03 {
	
	private String nomeProduto;
	private int qtdEstoque;
	private float valorProduto;
	private String nomeFornecedor;
	
	public PooProdutoEletronicoEx03(String nomeProduto,int qtdEstoque, float valorProduto,String nomeFornecedor) {
		
		{
			this.nomeProduto =  nomeProduto;
			this.qtdEstoque = qtdEstoque;
			this.valorProduto = valorProduto;
			this.nomeFornecedor = nomeFornecedor;}
		}
	public void imprimirInfo()
	{
		System.out.println("\n"+nomeProduto+" fornecido por "+nomeFornecedor+" possui em estoque "+qtdEstoque+" peças e é vendido no valor de R$ "+valorProduto);
	}
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public float getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	
	
	
}
