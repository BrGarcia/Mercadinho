/**
 * @author Bruno Garcia 029141072
 * @author Tamires Ferreira MATRICULA
 *
 */
public class CaixaRegistradora {

	public static void main(String[] args) {
		//INSIRINDO OS PROTUDOS NO "SISTEMA"
		Produto cafe = new Produto("Caf� Santa Clara", 4.29);
		Produto arroz = new Produto("Arroz Tio Jo�o", 2.11);
		Produto feijao = new Produto("Feij�o KiCaldo", 6.89);
		Produto macarrao = new Produto("Macarr�o Fortaleza", 2.89);
		
		//CRIANDO UMA VENDA
		Venda venda = new Venda();
		//ADICIONANDO DETERMINADOS PRODUTOS AO CARRINHO DE COMPRAS
		venda.adicionarProduto(macarrao);
		venda.adicionarProduto(feijao);
		venda.adicionarProduto(cafe);
		venda.adicionarProduto(arroz);
		//REMOVENDO UM ELEMENTO DO "CARRINHO"
		venda.removerProduto(macarrao);
		//ATE AQUI TA OK.
		
	}

}
