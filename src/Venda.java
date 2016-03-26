import java.util.ArrayList;
/**
 * @author Bruno Garcia 	Matricula: 029141072
 * @author Tamires Ferreira Matricula: 029131052
 */
public class Venda {
	public double precoDoCarrinho;
	public double precoDoCarrinhoComDesconto;
	
	private ArrayList<Produto> carrinhoDeCompras = new ArrayList<Produto>();
	
	public void adicionarProduto(Produto P){
		carrinhoDeCompras.add(P);
		precoDoCarrinho += P.getPrecoPodruto();
		System.out.println(P.getNomeProduto() + " adicionado ao carrinho.");
		System.out.println("Valor das compras é R$:"+precoDoCarrinho);
	}
	public void removerProduto(Produto P){
		carrinhoDeCompras.remove(P);
		precoDoCarrinho = getPrecoDoCarrinho() - P.getPrecoPodruto();
		System.out.println(P.getNomeProduto() + " removido do carrinho.");
		System.out.println("Valor das compras é R$:"+precoDoCarrinho);
	}

	public double getPrecoDoCarrinho() {
		return precoDoCarrinho;
	}

	public void setPrecoDoCarrinho(double precoDoCarrinho) {
		this.precoDoCarrinho = precoDoCarrinho;
	}

	public ArrayList<Produto> getCarrinhoDeCompras() {
		return carrinhoDeCompras;
	}

	public void setCarrinhoDeCompras(ArrayList<Produto> carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}
	
	
	
	
	
	
}

