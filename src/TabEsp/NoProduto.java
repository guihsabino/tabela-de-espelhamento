package TabEsp;

public class NoProduto {
	public Produto dado;
	public NoProduto prox;
	
	public NoProduto(Produto e){
		dado = e;
		prox = null;
	}
}